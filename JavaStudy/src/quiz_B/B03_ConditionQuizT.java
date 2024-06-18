package quiz_B;

//24.04.19 선생님풀이

import java.util.Scanner;

public class B03_ConditionQuizT {
	
	/*
		# 알맞은 비교 연산을 만들어보세요
		
		 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		 2. int형 변수 b가 짝수일 때 true
		 3. int형 변수 c가 7의 배수일 때 true
		 4. int형 변수 d와 e의 차이가 30일 때 true
		 5. int형 변수 year가 400으로 나누어 떨어지거나
		                   또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
		 6. boolean형 변수 powerOn이 false일 때 true
		 7. 문자열 참조변수 str이 "yes"일 때 true
	*/
	
	public static void main(String[] args) {
		
		// 1.
		int a = 15; 
		System.out.println(a > 10 && a < 20);
		
		// 2.
		int b = 3;
		System.out.println(b % 2 == 0);
		
		// 3.
		int c = 21;
		System.out.println(c % 7 == 0);
		
		// 4.
		int d = 33, e = 63;
		
		// 방법 1
		System.out.println(e - d == 30 || e - d == -30);
		// 방법 2 - 둘 중 하나만 만족
		System.out.println(e - d == 30 || d - e == 30);
		// 방법 3 - 절대값
		System.out.println(Math.abs(e - d) == 30);
		
		// 5. 
		// ※ 윤년 계산하는 공식
		// 윤년 계산원리
		/*
		 	4년으로 나누어 떨어지는 (% 연산자를 써서 나머지가 0인 경우) 경우는 윤년이다.
		 	100년으로 나누어 떨어지면 윤년이 아니다.
		 	100년으로 나누어 떨어지지 않으면 윤년
		 	400년으로 나누어 떨어지면 윤년이다.
		 	
		 	애초에 4년으로 나누어 떨어지면 윤년 아니면 윤년x
		 	4년으로 나누어 떨어지는 것 중에 100으로 나누어 떨어지는 것은 윤년x
		 	4년으로 나누어 떨어지고 100으로 떨어지지 않으면 윤년 or 400으로 나누어 떨어지는 것은 윤년
		 	
		*/
 
		
		int year = 2023;
		
		// 사칙연산 먼저 그다음 == 다음 && 연산을 먼저하고 || 연산을 한다.
		System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
		
		// 6.
		boolean powerOn = false;
		boolean powerOff = !powerOn;
		
		System.out.println(!powerOn);
		System.out.println(powerOff);
		
		//7.
		// 기본형 타입들은 ==으로 같음을 나타낼 수 있지만 
		// 참조형 변수들은 ==대신 .equals() 메서드를 사용해야 한다
		System.out.print("yes or no? ");
		String str = new Scanner(System.in).next();
		System.out.println(str.equals("yes"));
		
		
	}

}




