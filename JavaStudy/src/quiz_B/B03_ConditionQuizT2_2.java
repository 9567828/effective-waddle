package quiz_B;

//24.04.19

import java.util.Scanner;

public class B03_ConditionQuizT2_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("연도를 입력하세요 > ");
		
		// 사칙연산 먼저 그다음 == 다음 && 연산을 먼저하고 || 연산을 한다. 윤년 계산식 true면 윤년x false면 윤년o
		//System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
		int year = 1910;
		
		System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
		
		System.out.println(year % 4 == 0); // 4년으로 나누어 떨어지면 윤년 아니면 x
		System.out.println(year % 100 != 0); // 100으로 나누어 떨어지지 않으면 윤년 아니면 x
		// 이어를 100으로 나누어서 0이 아니면 true -> 100으로 나누어 떨어지지 않는다.
		
		System.out.println(year % 400 == 0); // 400으로 나누어 떨어지면 윤년 아니면x
		
		
		
	}

}




