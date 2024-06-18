package test;

public class Omok {
	int[][] board = new int[15][15];
	char[] boardLine = {'┼', '┌', '┬', '┐', '├', '┤', '└', '┴', '┘','╋', '●', '○'};
	int x;
	int y;
	
	public Omok() {
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				if (i == 0 && j == 0) {
					board[i][j] = 1;
				} else if (i == 0 && j == 14) {
					board[i][j] = 3;
				} else if (i == 14 && j == 0) {
					board[i][j] = 6;
				} else if (i == 14 && j == 14) {
					board[i][j] = 8;
				} else if (i == 0) {
					board[i][j] = 2;
				} else if (j == 0) {
					board[i][j] = 4;
				} else if (j == 14) {
					board[i][j] = 5;					
				} else if (i == 14) {
					board[i][j] = 7;					
				} else if (i == 9) {
					board[i][j] = 9;
				} else {
					board[i][j] = 0;
				}
			}
		}
	}
	
	public void placeWhite(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void printboard() {
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				System.out.printf("%2c", boardLine[board[i][j]]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Omok game = new Omok();
		game.placeWhite(1, 2);
		
		game.printboard();
	}

}
