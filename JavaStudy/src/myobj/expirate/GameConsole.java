package myobj.expirate;

import java.util.Arrays;
import java.util.Scanner;

public class GameConsole {
	Scanner sc = new Scanner(System.in);
	
	GamePlayer[] players = new GamePlayer[4];
	GameRule game = new GameRule();
	
	int turn = 0;
	boolean DEBUG_MODE = true;
	
	public GameConsole() {
		players[0] = new GamePlayer("유재석");
		players[1] = new GamePlayer("노홍철");
		players[2] = new GamePlayer("박명수");
		players[3] = new GamePlayer("정준하");
	}
	
	public void printAllPlayers() {
		players[0].print();
		players[1].print();
		players[2].print();
		players[3].print();
	}
	
	public GamePlayer[] getOrderedPlyers() {
		GamePlayer[] copied = Arrays.copyOf(players, players.length);
		
		for (int i = 0; i < copied.length; ++i) {
			for (int j = 0; j < copied.length - 1 - i; ++j) {
				if (copied[j].rating < copied[j + 1].rating) {
					GamePlayer temp = copied[j];
					copied[j] = copied[j + 1];
					copied[j + 1] = temp;
				}
			}
		}
		return copied;
	}
	
	public void printEndInfo() {
		GamePlayer[] ordered = getOrderedPlyers();
		
		System.out.println("최종결과");
		ordered[0].print(1000);
		ordered[1].print(500);
		ordered[2].print(-500);
		ordered[3].print(-1000);
	}
	
	public void start() {
		while (true) {
			int currPlayerIndex = turn % players.length;
			GamePlayer currplayer = players[currPlayerIndex];
			
			if(DEBUG_MODE) {
				game.showAnswer();
			}
			
			game.print();
			System.out.printf("[%d턴]\"%s\"님의 차례> ", turn + 1, currplayer.name);
			
			int userInput = sc.nextInt();
			
			if (userInput < 1 || userInput > 20) {
				System.out.println("[경고] 1~20사이의 숫자만 입력하쇼");
				 continue;
			}
			
			int result = game.stab(userInput - 1);
			
			if (result == GameRule.STABBED_HOLE) {
				System.out.println("이미 찔렀던 곳");
			} else if (result == GameRule.SAFE_HOLE) {
				currplayer.survive();
				++turn;
			} else if (result == GameRule.LAUNCH_HOLE) {
				System.out.println("통아저씨가 날아간다");
				System.out.printf("\"%s\"님의 패배 입니다\n", currplayer.name);
				
				boolean deadPayerExists = false;
				for (int i = 0; i < players.length; ++i) {
					if (i == currPlayerIndex) {
						players[i].ratingDown(3000);
						deadPayerExists = players[i].rating < 0;
					} else {
						players[i].ratingUp(500);
					}
				}
				
				if(deadPayerExists) {
					System.out.printf("\"%s\"님의 점수가 마이너스가 되어 게임을 종료한다", currplayer.name);
					break;
				}
				
				sc.nextLine();
				
				printAllPlayers();
				System.out.println("게임을 더 진행?? (Y/N)");
				String select = sc.next();
				
				char cmd = select.charAt(0);
				
				if (cmd == 'Y' || cmd == 'y') {
					turn = 0;
					game.suffle();
					System.out.println("새 게임이 시작 됩니다");
				} else if (cmd == 'N' || cmd == 'n') {
					System.out.println("그만하기를 선택하셨습니다");
					break;
				}
			}
		}
		printEndInfo();
	}
	public static void main(String[] args) {
		new GameConsole().start();
	}
}
