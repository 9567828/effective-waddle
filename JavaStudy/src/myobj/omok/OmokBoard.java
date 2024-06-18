package myobj.omok;

public class OmokBoard {
	char[][] board = new char[10][10];
	

	public OmokBoard() {
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				if (i == 0 && j == 0) {
					board[i][j] = '┌';
				} else if (i == 0 && j == 9) {
					board[i][j] = '┐';
				} else if (i == 9 && j == 0) {
					board[i][j] = '└';
				} else if (i == 9 && j == 9) {
					board[i][j] = '┘';
				} else if (i == 0) {
					board[i][j] = '┬';
				} else if (j == 0) {
					board[i][j] = '├';
				} else if (j == 9) {
					board[i][j] = '┤';					
				} else if (i == 9) {
					board[i][j] = '┴';					
				} else {
					board[i][j] = '┼';
				}
			}
		}
	}

}
