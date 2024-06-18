package quiz_B;

import java.util.Scanner;

// 24. 04. 25

public class B09_Numeric {

	/*
		사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
		판별해주는 프로그램을 만들어보세요
		
		ch >= '0' && 
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력해주세요: ");
		
		String text = sc.next();
		int len = text.length();
		
		boolean num = true;

		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			if (ch >= '0' && ch <= '9') {
				continue;
			}
			num = false;
		}

		if(num) {
			System.out.println("숫자만 있다");
		} else {
			System.out.println("문자 혹은 숫자가 포함 되었다");						
		}
		
		
		
	}
	
}
