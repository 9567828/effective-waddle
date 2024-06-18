package quiz_B;
// 24.04.24

import java.util.Scanner;

public class B08_PrintReverseT {

	/*
	 	사용자가 문장을 입력하면 해당 문장을 거꾸로 출력해보세요
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요: ");
		String text = sc.nextLine();
		
		int len = (text.length() -1);
		int len1 = text.length();

		// 마지막 인덱스 부터 0까지 박복하며 한 글자씩 출력
		for (int i = len; i >= 0; --i) {
			System.out.print(text.charAt(i));
		}
		
		System.out.println();
		
		// 마지막 인덱스에서 1씩 더 빼면서 한 글자씩 출력하기 (관용적인 공식)
		for (int i = 0; i < len1; ++i) {
			System.out.print(text.charAt(len1 - 1 -i));
		}
		
		
	
	
	}
	
}
