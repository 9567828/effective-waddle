package quiz;

import myobj.t_omok.Omok;

// 24. 05. 20

public class D08_Omok {
	// 오목을 만들어주세요
	public static void main(String[] args) {
		Omok game = new Omok();
		
		game.putBlack(1, 7);
		game.putBlack(2, 7);
		game.putBlack(3, 7);
		game.putBlack(4, 7);
		game.putBlack(5, 7);
		game.putBlack(8, 7);
		game.putBlack(9, 7);
		game.putBlack(10, 7);
		game.putBlack(11, 7);
		game.putBlack(12, 7);
		game.putWhite(7, 14);
		game.putWhite(7, 13);
		game.putWhite(7, 12);
		game.putWhite(7, 11);
		game.putWhite(7, 10);
		game.putWhite(7, 7);
		game.putWhite(7, 6);
		game.putWhite(7, 5);
		game.putWhite(7, 4);
		game.putWhite(7, 3);
		game.putWhite(9, 1);
		game.putWhite(9, 2);
		game.putWhite(9, 3);
		game.putWhite(9, 4);
		game.putWhite(9, 5);

		System.out.println("흑돌7-1 " + game.postCheck(14, 7, Omok.BLACK_STONE));
		System.out.println("흑돌7-2 " + game.postCheck(7, 7, Omok.BLACK_STONE));
		System.out.println("흰돌7-1 " + game.postCheck(7, 7, Omok.WHITE_STONE));
		System.out.println("흰돌7-2 " + game.postCheck(7, 14, Omok.WHITE_STONE));
		System.out.println("흰돌9 " + game.postCheck(14, 9, Omok.WHITE_STONE));
		
		game.printBoard();
		
		
		
		
		//		// Hint - 콘솔에 판 그리는 방법
//		for (int i = 0; i < 10; ++i) {
//			for (int j = 0; j < 10; ++j) {
//				System.out.printf("%2c", '┿');
//			}
//			System.out.println();
//		}
//		
//		// Hint2 - 오목판에 돌 놓는 방법
//		char[][] omok = {
//				{'┌', '●', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┐'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '●', '●', '○', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'└', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┘'},
//		};
//		
//		for (int i = 0; i < omok.length; ++i) {
//			for (int j = 0; j < omok[i].length; ++j) {
//				System.out.printf("%-2c", omok[i][j]);
//			}
//			System.out.println();
//		}
		
	}

}
