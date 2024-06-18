package quiz;

import java.util.Scanner;

import myobj.baskin.BaskinGame;
import myobj.baskin.BaskinGame2;
import myobj.baskin.BaskinPlayer;

// 24. 05. 09
// 풀이

public class C07_31GameT {

	/*
 		# 31 Game
 		
 		- 프로그램을 시작하면 게임에 참여하는 인원과 마지막 숫자를 설정할 수 있어야 한다
 		- 이전 사람이 골랐던 숫자에 +1~+3씩 더할 수 있다
 		- 게임을 진행하다가 마지막 숫자를 입력하게 되는 사람이 패배한다
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("참여인원?>> ");
		int playerSize = sc.nextInt();
		
		System.out.print("이 게임의 마지막 숫자는?>> ");
		int lastNum = sc.nextInt();
		
//		BaskinGame game = new BaskinGame(lastNum);
		
//		상속 받은 자식클래스를 넣을 때 이전(부모)클래스는 지우고 자식 클래스로 돌린다
		BaskinGame game = new BaskinGame2(lastNum);
		BaskinPlayer players = new BaskinPlayer(playerSize);
		
		int turn = 0;
			
		while (true) {
			int playerNum = players.getplayerNum(turn);
			// player를 1,2,3으로 표현하기 위해 1을 더한다
			System.out.printf("플레이어 %d의 차례> \n", playerNum);
			int result = game.next(sc.nextInt());
			
				if(result == -1) {
					System.out.println("[경고]1~3사이의 숫자를 입력해주세요");
					continue;
				} else if (result == -2) {
					System.out.println("[경고] 그 숫자는 더할 수 없습니다");
					continue;
				}

//			if(result == -1) {
//				System.out.println("[경고]마지막 숫자에서 +1 ~ +3까지만 할 수 있습니다");
//				continue;
//			} else if (result == -2){
//				System.out.println("더이상 진행할 수 없습니다");
//				continue;
//			}
			
			System.out.printf("플레이어 %d > %d!\n", playerNum, result);
			
			if(game.isEnd()) {
				System.out.printf("플레이어 %d님의 패배입니다\n", playerNum);
				break;
			}
			
			++turn;
		}
	}
}
