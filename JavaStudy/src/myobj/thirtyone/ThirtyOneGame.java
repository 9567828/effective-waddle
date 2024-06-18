package myobj.thirtyone;

import java.util.Scanner;

public class ThirtyOneGame {
	Scanner sc = new Scanner(System.in);
	int startNum;
	int playerNum = 2;
	int max = 0;
	
	players game = new players();
	
	
	int[] palyNums = new int[startNum];
	players[] users = new players[playerNum];
	
	
	public ThirtyOneGame() {
		setNums(sc.nextInt());
	}
	
	public int setNums(int setNum) {
		palyNums = new int[setNum];
		for (int i = 0; i < palyNums.length; ++i) {
			max = Math.max(setNum, i);
		}
		return setNum;
	}
	
	public void start() {
		
	}

	public static void main(String[] args) {
		ThirtyOneGame game = new ThirtyOneGame();
		
		game.start();
		
		
	}

}

class players {
	String name;
	int startNum;
}