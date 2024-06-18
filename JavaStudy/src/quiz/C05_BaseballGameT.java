package quiz;

import java.util.Scanner;

import myobj.BaseBallGameT;

public class C05_BaseballGameT {
	
	public static void main(String[] args) {
		boolean DEBUG_MODE = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			BaseBallGameT game = new BaseBallGameT();
			
			if (DEBUG_MODE) {
				game.printAnswer();
			}
			while (true) {
				System.out.println();
//				정답하나에 입력 여러번
				System.out.print("숫자 4개를 입력>> ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
//				String str = sc.next();
				
//				int[] result = game.guessNumber(a, b, c, d);
//				int[] result = game.guessNumber2(str);
				int[] result = game.guessNumber2(a, b, c, d);
								
				game.minusChane();
				
				int chance = game.getChance();
				
				System.out.printf("%d스트라잌, %d볼 (남은기회: %d)", result[0], result[1], chance);
				
				if(result[0] == 4) {
					System.out.println("플레이어의 승리!");
					System.out.println("새로운 게임!▼ ");
					System.out.println();
					break;
				} else if (chance == 0) {
					System.out.println("플레이어의 패배입니다");
					game.printAnswer();;
					System.out.println("다음게임으러▼ ");
				}
			}
		}
	}
}
