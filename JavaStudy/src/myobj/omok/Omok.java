package myobj.omok;

import java.util.Scanner;

public class Omok {
	OmokBoard doll = new OmokBoard();
//	char[][] doll = new char[10][10];
	int x;
	int y;

	public Omok() {
		printBoard();
	}
		
	public void placeWhite(int x, int y) {
		this.x = x;
		this.y = y;
	
		for (int i = 0; i < doll.board.length; ++i) {
			for (int j = 0; j < doll.board[i].length; ++j) {
				if (doll.board[i][j] == doll.board[x][y]) {
					doll.board[x][y] = '○';					
				}
			}
		}
	}
	
	public void placeBlack(int x, int y) {
		this.x = x;
		this.y = y;
		
		doll.board[x][y] = '●';		
	}
	
	public void printBoard() {
		for (int i = 0; i < doll.board.length; ++i) {
			for (int j = 0; j < doll.board[i].length; ++j) {
				System.out.printf("%-2c", doll.board[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Omok game = new Omok();
		
		System.out.print("행, 열입력>> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int turn = 1;

		if (x < 0 || y < 0 && x > 11 || y > 11) {
			System.out.println("1~10 사이의 숫자로 입력해 주세요");
		}
		
		game.placeBlack(x, y);
		game.placeWhite(x, y);
	
		
		
	}
	
}
