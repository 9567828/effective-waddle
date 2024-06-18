package myobj;

import java.util.Arrays;

public class PirateRule {
	
	int[] ports = new int[10];
	public int[] bomb = new int[4];
	String[] players = new String [4];	
	int scores = 0;
	int cash = 0;
	
	static int[] ranking = {1, 2, 3, 4};
	static int[] prizeMoney = {1000, 500, -500, -1000};
	
	public int userFailcnt = 0;
	public int userWincnt = 0;

	public PirateRule() {
		genAnswer();
	}
	
	void genAnswer() {
		int index = 0;
//		for(int i = 0; i < ports.length; ++i) {
//			ports[i] = index;
//		}
//		for(int i = 0; i < bomb.length; ++i) {
//			bomb[i] = (int)(Math.random() * ports.length);
//			for (int j = 0; j < i; ++j) {
//				if(bomb[i] == bomb[j]) {
//					--i;
//					break;
//				}
//			}
//		}
		
		for (int i = 0; i < ports.length; ++i) {
			ports[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; ++j) {
				if (ports[i] == ports[j]) {
					--i;
					break;
				}
			}
		}
		
		
		
	}
		
//		for(int i = 0; i < 8; ++i) {
//			ports[i] = i;
//			for(int j = 0; j < ports.length; ++j) {
//				index = (int)(Math.random() * ports.length);
//				
//				int temp = ports[j];
//				ports[j] = ports[index];
//				ports[index] = temp;
//			}
//		}
//	}
		
	public String[] setPlayersName(String a, String b, String c, String d) {
		String[] players = {a, b, c, d};
		
		return players;
	}
	
	public int guessNumber(int a) {
		for (int i = 0; i < 20; ++i) {
			if(bomb[i] == a) {
				++userFailcnt;
				--scores;
				System.out.println("발사");
			} else {
				++userWincnt;
				if(userWincnt > scores) {
					++scores;
					System.out.println(bomb[i]);
				}
			}
		}
		System.out.println("다음차례>> ");
		
		return a;
	}
	
	public int getPrizeMoney() {
		
		
		return 1;
	}
	
	public boolean askStopGame(String answer) {
		if(answer.equals("yes")) {
			return true;
		}
		return false;
		
		
	}
	
	public void printAnswer() {
		System.out.println(Arrays.toString(ports));
		System.out.println(Arrays.toString(bomb));
	}
}
