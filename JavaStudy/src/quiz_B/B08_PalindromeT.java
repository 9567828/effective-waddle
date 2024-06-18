package quiz_B;
// 24.04.24

import java.util.Scanner;

public class B08_PalindromeT {

	/*
	 	사용자가 단어를 입력하면
	 	해당 단어가 좌우대칭을 이루는 단어인지 판별해주는 프로그램을 만들어 보세요
	 	
	 	0 == len -1
	 	1 == len -1 -1
	 	2 == len -1 -2
	 	
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

//		String text = "appele";
		
		int len = text.length();
		int half = len / 2;
		
		// 좌우대칭 여부를 저장해 놓을 변수 (여러번 반복되어서 출력되지 않도록)
		boolean isPalindrome = true;
		
		for (int i = 0; i < half; ++i) {
//			System.out.printf("%c vs %c\n", text.charAt(i), text.charAt(len - 1 - i));
			
			/*
				i		ch1			ch2
				-----------------------
				0		0번째			len - 1 - 0
				1		1번째			len - 2
				2		2번째			len - 3
			 
			*/
			
			
			char ch1 = text.charAt(i);
			char ch2 = text.charAt(len - 1 - i);
			if (ch1 != ch2) {
				isPalindrome = false;
				//System.out.printf("%d번째 검사결과: 같음\n", i);
			}
		}
		
		if (isPalindrome) {
			System.out.printf("\"" + text + "\" 좌우대칭입ㄴ디ㅏ");
		} else {
			System.out.printf("\"" + text + "\" 좌우대칭아니다");
		}
		


		
		
		
	}
	
	
}
