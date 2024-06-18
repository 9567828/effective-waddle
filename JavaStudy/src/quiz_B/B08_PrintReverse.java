package quiz_B;
// 24.04.24

import java.util.Scanner;

public class B08_PrintReverse {

	/*
	 	사용자가 문장을 입력하면 해당 문장을 거꾸로 출력해보세요
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요: ");
		String text = sc.nextLine();
		
		int len = (text.length() -1);
		
		int cnt = 0;
		for(int i = len; i > 0; --i) {
			char ch = text.charAt(i);
			++cnt;
			System.out.println("ch" + ch);
			System.out.println("cnt" + cnt);
			System.out.println("len" + len);
			System.out.println("i" + i);
		}
	
	
	}
	
}
