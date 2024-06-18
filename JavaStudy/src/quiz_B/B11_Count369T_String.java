package quiz_B;
// 24. 04.26
// 풀이 문자열로

import java.util.Scanner;

public class B11_Count369T_String {
	
	/*
	 	사용자가 숫자를 입력하면
	 	해당 숫자 까지 369게임이 진행 됐을 대 박수를 총 몇 번 쳐야하는지 출력해보세요
	 	
	 	1. 숫자를 문자열로 취급하여 검사하는 방식
	 	
	 	2. 그냥 숫자로 검사하는 방식
	 	   344436
	*/
	
	public static void main(String[] args) {
		
		// 개발중에 입력이 잘 되었는 지 콘솔에 확인하고 완료 후 확인용 출력값 정리할 때 사용하면 좋음
		boolean DEBUG_MODE = false;
		
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.print("숫자를 입력>> ");
//		int targetNum = sc.nextInt();
		int targetNum = 35;
		
		int totalCnt = 0;
		for(int i = 1; i <= targetNum; ++i) {
			if (DEBUG_MODE) {
				System.out.print(i + "\t: ");
			}
			
			String numStr = "" + i;
			int len = numStr.length();
			
			for(int j = 0; j < len; ++j) {
				char ch = numStr.charAt(j);
				if(ch == '3' || ch == '6' || ch == '9') {
					++totalCnt;
					if(DEBUG_MODE) {
						System.out.print("짝");
					}
				}
			}
			if(DEBUG_MODE) {
				System.out.println();				
			}
		}
		System.out.println("입력한 " + targetNum + "의 박수 총 개수: " + totalCnt);
		

	}

}
