package quiz_B;

// 24.04.19
import java.util.Scanner;

public class B03_ConditionQuiz2 {

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
		
		char a = 'q';
		System.out.println(a == 'q' || a == 'Q');
		
		char b = ' ';
		System.out.println(b != '\t' && b != ' ');
		System.out.println(!(b == '\t' || b == ' '));
		
		// 아스키 코드를 굳이 찾을 필요가 없다. 문자타입도 정수 취급한다
		char c = '0';
		System.out.println(c >= '0' && c <= '9');
		
		char d = '이';
		System.out.println(d >= 'a' && d <= 'z' || d >= 'A' && d <= 'Z');
		
		char e = '차';
		System.out.println(e >= '가' && e <= '힣');
		// AC00 - 0xAC00 , D7A3 - 0xD7A3
		
		Scanner sc = new Scanner(System.in);

		System.out.print("input command > ");
		String cmd = sc.next();
		
		// System.out.println(cmd == "quit"); 문자열 비교 ==으로 하면 안됨

		// 문자열 비교는 .equals()
		System.out.println(cmd.equals("quit"));
		
		// 대소문자 상관없이 같은 문자열인지 비교
		System.out.println(cmd.equalsIgnoreCase("quit"));
		
		
		
	}
	
}

