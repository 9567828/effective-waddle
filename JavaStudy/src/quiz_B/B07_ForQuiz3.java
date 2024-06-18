package quiz_B;
// 24. 04. 24

import java.util.Scanner;

public class B07_ForQuiz3 {

	/*
	 	사용자로부터 숫자를 입력 받으면
	 	0 부터 해당 숫자 사이에 존재하는 모든 3의 배수를 한 줄에 6개씩 출력해 보세요
	 	(단, 음수를 입력 받는 경우에도 올바르게 동작해야 함)
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력허세요: ");
		
		int num = sc.nextInt();
		
		//int num = 50;
		
//		for(int i = 0, cnt = 0; i <= num; i += 3) {
//			if(num >= 0) {
//				++cnt;
//				System.out.printf("%-5d", i);				
//			}
//			if(cnt % 6 == 0) {
//				System.out.println();
//			}
//		}
		
//		if (num <= 0) {
//			for(int i = 0, cnt = 0; i >= num; i -= 3) {
//				++cnt;
//				System.out.printf("%-5d", i);
//					if(cnt % 6 == 0) {
//						System.out.println();
//					}
//				}
//			}
//
//		if (num >= 0) {
//			for(int i = 0, cnt = 0; i <= num; i += 3) {
//				++cnt;
//				System.out.printf("%-5d", i);
//				if(cnt % 6 == 0) {
//					System.out.println();
//				}
//			}
//		} (10 - i % 10) 거꾸로 돌리기
		
		for(int i = 0, cnt = 0; i <= num; ++i) {
			if (num % 3 == 0) {
				++cnt;				
				if (num >= 0) {
					System.out.printf("%-5d", i);					
				} else if (num <= 0) {
					System.out.printf("%-5d", (0 - i));
				}
			}
			if (cnt % 6 == 0) {
				System.out.println();
			}
		}
		
		
		
		
		
	}
	
}
