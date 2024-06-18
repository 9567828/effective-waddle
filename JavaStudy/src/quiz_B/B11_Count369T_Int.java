package quiz_B;
// 24. 04.26
// 풀이 숫자로

import java.util.Scanner;

public class B11_Count369T_Int {
	
	/*
	 	사용자가 숫자를 입력하면
	 	해당 숫자 까지 369게임이 진행 됐을 대 박수를 총 몇 번 쳐야하는지 출력해보세요
	 	
	 	1. 숫자를 문자열로 취급하여 검사하는 방식
	 	
	 	2. 그냥 숫자로 검사하는 방식
	 	   344436
	*/
	
	public static void main(String[] args) {
		
		// 개발중에 입력이 잘 되었는 지 콘솔에 확인하고 완료 후 확인용 출력값 정리할 때 사용하면 좋음
		boolean DEBUG_MODE = true;
		
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.print("숫자를 입력>> ");
//		int targetNum = sc.nextInt();
		int targetNum = 200;
		
		
		int totalCnt = 0;
		for (int i = 1; i <= targetNum; ++i) {
			System.out.print(i + ": \n");
			// 그냥 i로 나누면 무한반복이 나타남
			int num = i;
			while(num > 0) {
				// 한 자리 분리
				int digit = num % 10;
				System.out.print("\t" + digit + ": ");
				
				if(digit != 0 && digit % 3 == 0) {
					System.out.print("박수를 쳐야 합니다");
					++totalCnt;
				}
				
				System.out.println();
				num /= 10;
			}
		}		
		
		
//		자릿수를 뒤에서 부터 세는 방법		
//		int total = 0;
//		for(int i = 1; i <= targetNum; ++i) {
//			if(DEBUG_MODE) {
//				System.out.print(i);	
//			}
//			// digit : 자리수
//			long digit = 1;
//			while(digit <= 1000000000000L) {
//				// digit이 long이라서 int로 다운캐스팅 해주는것.
//				// 한 자릿수 분리
//				int num = (int)(i / digit % 10);
//				
//				// 해당 자릿수 숫자가 0이 아니고 3의 배수이면 박수횟수 증가
//				if(num != 0 && num % 3 == 0) {
//					++total;
//					System.out.println(total);
//				}
//				digit *= 10;
//			}
//			System.out.println("검사완: " + i);
//		}
//		System.out.println("박수는 총: " + total);

		

	}

}
