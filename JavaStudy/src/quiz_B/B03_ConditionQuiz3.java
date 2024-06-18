package quiz_B;

// 24.04.19
import java.util.Scanner;

public class B03_ConditionQuiz3 {

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
		
		char a = 'q', b = 'd', c = '7', d = '가', e = '롸';
		
		Scanner sc = new Scanner(System.in);
		
		// 1.
		System.out.println(a == 'q' || a == 'Q');
		
		// 2.
		System.out.println(b != ' ' || b != '\t');
		
		// 3.
		System.out.println(c >= 0 || c <= 9);
		
		// 4.
		System.out.println(d >= 'a' || d <= 'z' && d >= 'A' || d <= 'Z');
		
		
	}
	
}

