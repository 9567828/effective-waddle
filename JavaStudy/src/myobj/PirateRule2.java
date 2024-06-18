package myobj;

import java.util.Arrays;

public class PirateRule2 {
	
	public String playerName;
	public int scores = 0;
	public int cash = 0;
	int[] ports = new int[10];
	PlayerInfo[] info = new PlayerInfo[3];
	int infoCnt = 0;
	int point = 0;
	
	static int[] prizeCash = {1000, 500, -500, -1000};
	static String[] ranking = {"1위", "2위", "3위", "4위"};
	
	public PirateRule2() {
		genAnswer();
	}
	
	void genAnswer() {
		int index = 0;
		for (int i = 0; i < ports.length; ++i) {
			ports[i] = 0;
			for (int j = 0; j < 4; ++j) {
				ports[j] = (int) (Math.random() * 0 + 1);
			}
		}
		
		for (int i = 0; i < 100; ++i) {
			index = (int) (Math.random() * (ports.length - 1) +1);
			
			int temp = ports[0];
			ports[0] = ports[index];
			ports[index] = temp;
		}	
	}
	
	public int getNumber(int a) {
		
		for(int i = 0; i < ports.length; ++i) {
			if(ports[i] != 0 && i == a) {
				System.out.println("발사");
				--scores;
			} else {
				System.out.println("맞나?");
				++scores;
			}
		}
		System.out.println(scores);
		
		return a;
	}
	
	public void getScores(int scores) {
		this.scores = scores;
		
	}
	
	public void printGameInfo() {
		for(int i = 0; i < info.length; ++i) {
			if(info[i] != null) {
				System.out.printf("플레이어 %s의 점수는 %d점, 소지금은 %d원 입니다", 
						info[i].playerName, info[i].scores, info[i].prizeCash);
			} else {
				System.out.println(info[i]);
			}
		}
	}
	
	public void addResult(String name, int scores, int prizeCash) {
		PlayerInfo gameInfo = new PlayerInfo();
		
		gameInfo.playerName = name;
		gameInfo.scores = scores;
		gameInfo.prizeCash = prizeCash;
		
		this.info[this.infoCnt++] = gameInfo;
	}
	
	public void printAnswer() {
		System.out.println(Arrays.toString(ports));
//		System.out.println(Arrays.toString(bomb));
	}

}

class PlayerInfo {
	String playerName;
	int scores;
	int ranking;
	int prizeCash;
}