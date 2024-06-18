package quiz;

import java.util.Scanner;

// 24. 05. 16
public class D05_isJavaVariable {

	/*
	 	사용자로 부터 문자열을 입력받으면
	 	해당 문자열의 자바 변수로 사용할 수 있는 문자열인지 검사해보세요
	*/
		
	public String checkWord(String text) {
		int len = text.length();
		char ch = ' ';
		int i = 0;
		while (len > i) {
			ch = text.charAt(i);
			char ch1 = text.charAt(0);
			if (!Character.isJavaIdentifierStart(ch1)) {
				System.out.println("불가");
				return text;
			} else {
				System.out.println(Character.isJavaIdentifierPart(ch));
			}
		}
		return text;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력>> ");
		String text = sc.next();
		
		int len = text.length();
		
		char ch = ' ';
		
		boolean isPossible = true;
		
		int i = 0;
		while (len > i) {
			ch = text.charAt(i);
			char ch1 = text.charAt(0);
			if (!Character.isJavaIdentifierStart(ch1)) {
//				System.out.println("불가");
				isPossible = false;
				break;
			} else if(!Character.isJavaIdentifierPart(ch)) {
				isPossible = false;
			} else {
				isPossible = true;
				++i;
			}
		}
		
		if(isPossible) {
			System.out.printf("[%s] 변수로 사용 가능", text);
		} else {
			System.out.printf("[%s] 변수로 사용 불가", text);
		}
		
		
	}
}
