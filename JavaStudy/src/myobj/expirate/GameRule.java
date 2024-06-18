package myobj.expirate;

import java.util.Arrays;
import java.util.Scanner;

public class GameRule {
	int[] holes = new int[20];
	
	public final static int LAUNCH_HOLE_COUNT = 4;
	public final static int SAFE_HOLE = 0;
	public final static int LAUNCH_HOLE = 1;
	public final static int STABBED_HOLE = 2;
	
	public GameRule() {
		suffle();
	}
	
	public void suffle() {
		for (int i = 0; i < holes.length; ++i) {
			// 꽝 4자리를 만든다
			if (i < LAUNCH_HOLE_COUNT) {
			// 4자리는 1로 설정한다
				holes[i] = LAUNCH_HOLE;
			} else {
			// 나머지는 0으로 설정한다
				holes[i] = SAFE_HOLE;
			}
		}
		
		// 꽝의 위치를 마구 섞어준다
		for (int i = 0; i < 100; ++i) {
			int ranIndex = (int)(Math.random() * (holes.length - 1)) + 1;
			
			int temp = holes[0];
			holes[0] = holes[ranIndex];
			holes[ranIndex] = temp;
		}
	}
	
	public int stab(int index) {
		// 사용자가 숫자를 넣으면 holes배열에 숫자를 넣어준다
		// 통과된 숫자를 입력했을 때는 이미 찌른 위치로 설정해주고 안전한 자리라고 리턴해준다
		switch (holes[index]) {
		case SAFE_HOLE:
			holes[index] = STABBED_HOLE;
			return SAFE_HOLE;
		// 아니면 배열의 위치로 넣어주도록 한다
		default:
			return holes[index]; 
		}
	}
	
	public void print () {
		int i = 0;
		System.out.println("-------------------------------------");
		for (int line = 0; line < 4; ++line) {
			for (int col = 0; col < 5; ++col) {
				switch (holes[i]) {
				case STABBED_HOLE:
					System.out.printf("%-4c", 'X');
					break;
				default:
					System.out.printf("%02d  ", i + 1);
					break;
				}
				++i;				
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
	}
	
	public void showAnswer() {
		System.out.println(Arrays.toString(holes));
	}
	
	public static void main(String[] args) {
		GameRule game = new GameRule();
		
		game.showAnswer();
		System.out.println("---- 테스트용 ----");
		Scanner sc = new Scanner(System.in);
		
		int stabResult = -1;
		while (stabResult != 1) {
			game.print();
			System.out.print(">> ");
			stabResult = game.stab(sc.nextInt() -1);
			System.out.println("찌른 결과는 " + stabResult + "였습니다");
		}
		System.out.println("아저씨가 발사 게임이 끝났슴");
	}
	
}
