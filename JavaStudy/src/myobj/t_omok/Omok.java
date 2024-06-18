package myobj.t_omok;

public class Omok {
	final static char [] OMOOK_CARS = 
		{'┼', '┌', '┬', '┐', '├', '┤', '└', '┴', '┘', '╋', '●', '○'};
	
	final public static int BLACK_STONE = 10;
	final public static int WHITE_STONE = 11;

	final public static int BOARD_WIDTH = 15;
	final public static int BOARD_HEIGHT = 15;
	
	int[][] board;
	
	
	// 새 오목판이 생길 때 마다
	public Omok() {
		board = new int[][] {
			{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8},
		};
	}
	
	// 놓기 전에 진행하는 체크 (33 같은거)
	public int preCheck(int x, int y, int stone) {
		return 0;
	}
	
	// 놓은 후에 진행하는 체크 (승리여부)
	public int postCheck(int x, int y, int stone) {
		// 가로로 연속으로 놓여있는 돌의 개수를 세기
		
		int cnt = 0;
		// 방금놓은 위치(x)로 부터 가로 오른쪽 체크 하면서 같은 색상의 돌의 개수를 센다
		for (int i = x; i < BOARD_WIDTH; ++i) {
			// board[y][i]가 스톤이랑 같은 색이냐?
			if (board[y][i] == stone) {
				++cnt;
			} else {
				break;
			}
		}
		
		// 왼쪽 (방금 놓은 위치 미포함)
		for (int i = x - 1; i >= 0; --i) {
			if (board[y][i] == stone) {
				++cnt;
			} else {
				break;
			}
		}
		
		if (cnt == 5) {
			return 1;
		}
		
		// 세로
		cnt = 0;
		for (int i = y; i < BOARD_HEIGHT; ++i) {
			if (board[i][x] == stone) {
				++cnt;
			} else {
				break;
			}
		}

		for (int i = y - 1; i >= 0; --i) {
			if (board[i][x] == stone) {
				++cnt;
			} else {
				break;
			}
		}
		
		// 방금 놓은 위치(y)로 부터 세로 
		
		if (cnt == 5) {
			return 1; // 1 = 승리
		}
		
		return 0; // 아무것도 아니다
	}
	
	public boolean putBlack(int x, int y) {
		return putStone(x, y, BLACK_STONE);
	}

	public boolean putWhite(int x, int y) {
		return putStone(x, y, WHITE_STONE);
	}
	
	private boolean putStone(int x, int y, int stone) {
		if (x >= BOARD_WIDTH || x < 0 || y >= BOARD_HEIGHT || y < 0) {
			System.out.printf("[ERROR] (%d, %d) 놓을 수 없는 자리 입니다\n", x, y);
			return false;
		}
		
		// 세로가 먼저 확인이 되어야 하기 때문에 y, x 순서임
		int v = board[y][x];
		if (v != BLACK_STONE && v != WHITE_STONE) {
			board[y][x] = stone;
			return true;
		} else {
			System.out.printf("[ERROR] (%d, %d) 이미 돌이 놓여있는 자리 입니다\n", x, y);
			return false;
		}
	}
	
	public void printBoard() {
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				System.out.printf("%2c", OMOOK_CARS[board[i][j]]);
			}
			System.out.println();
		}
	}


}
