package quiz_B;

//24.04.19

public class B03_ConditionQuiz {
	
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
		int b = 10;
		System.out.println("2번: " + (b % 2 == 0));
		
		//선생님 풀이
		int b1 = 3;
		System.out.println(b1 % 2 == 0);
		
		// 3.
		int c = 14;
		System.out.println("3번: " + (c % 7 == 0));
		
		// 선생님 풀이
		int c1 = 21;
		System.out.println(c1 % 7 ==0);
		
		// 4.
		int d = 20, e = 50;
		System.out.println("4번: " + (d - e == 30));
		
		// 5.
		int year = 50;
		System.out.println(400 % year == 0 || 4 % year == 0 && 100 % year == 0);
		
		// 6.
		boolean powerOn = false;
		System.out.println("6번: " + !powerOn);
		
		// 7.
		String str = "yes";
		System.out.println("7번: " + (str == "yes"));
		
	}

}
