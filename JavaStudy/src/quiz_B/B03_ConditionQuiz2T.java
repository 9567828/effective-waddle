package quiz_B;

// 24.04.19
import java.util.Scanner;

public class B03_ConditionQuiz2T {

	/*
		# 알맞는 조건식을 만들어 보세요
		
		 1. char형 변수 a가 'q'또는 'Q'일 때 true
		 2. char형 변수 b가 공백이나 탭이 아닐 때 true
		 3. char형 변수 c가 '0' ~ '9'일 때 true
		 4. char형 변수 d가 영문자(대문자 또는 소문자) 일 때 true
		 5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색)
		 6. 사용자가 입력한 문자열이 quit일 때 true
	 
	*/
	
	
	public static void main(String[] args) {
		
		System.out.println("1번");
		// 1.
		// 대문자 Q 81 / 소문자 q 113
		char a = 'q';
		System.out.println(a == 81 || a == 113);
		System.out.println();
		
		System.out.println("2번");
		//2.
		char b = '5';
		System.out.println(b != 32 || b != 9);
		System.out.println();
		
		
		System.out.println("3번");
		//3.
		// 아스키 0~9 48 - 57
		char c = '5';
		System.out.println(c >= 48 && c <= 57);
		System.out.println();
		
		
		System.out.println("4번");
		//4.
		char d = 'a';
		// 대문자 아스키 - 65-90 소문자 97-122
		System.out.println((int)d);
		
		System.out.println(d >= 65 && d <= 90 || d >= 97 && d <= 122);
		//System.out.println(d >= 65 && d <= 90);
		//System.out.println(d >= 97 && d <= 122);
		System.out.println();
		
		
		System.out.println("5번");
		//5.
		char e = '감';
		// 44032 ~ 55217
		System.out.println((int)e);
		System.out.println(e <= 55217 && e >= 44032);
		System.out.println();
		
		
		
		System.out.println("6번");
		//6.
		System.out.println("그만두다 영어로?> ");
		String str = new Scanner(System.in).next();
		System.out.println(str.equals("quit"));
		
	}
	
}

