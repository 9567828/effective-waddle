package quiz_B;
// 24.04.24

import java.util.Scanner;

public class B08_Palindrome {

	/*
	 	사용자가 단어를 입력하면
	 	해당 단어가 좌우대칭을 이루는 단어인지 판별해주는 프로그램을 만들어 보세요
	 	
	 	>> LEVEL
	 	-> 좌우대칭입니다
	 	
	 	>> Apple
	 	-> 좌우대칭이 아닙니다.
	 	
	 	>> BOB
	 	-> 좌우대칭입니다.
	 	
	 	>> ABBA
	 	-> 좌우대칭입니다.
	 	
	 	>> 
	 	-> 좌우대칭입니다.
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어단어를 입력하슈: ");
		
		String text = sc.nextLine();

//		String text = "tenet";
		int len = text.length();
		int len1 = (text.length() -1);
		
		char word1 = text.charAt(1);
		char word2 = (text.charAt(text.length() -2));
		
		
		if (word1 == word2) {
			System.out.println("맞지롱");
		} else {
			System.out.println("아니야");
		}
		
		
		for(int i = 0; i < len; ++i) {
//			System.out.printf("%d번째 문자: %c\n", i, str2.charAt(i));
		}
		System.out.println();
		
		for(int e = len1; e >= 0; --e) {
			char ch2 = text.charAt(e);
//			System.out.println(text.charAt(text.length() -2));
//			System.out.print(ch2);
		}
		
		
		
		
	}
	
	
}
