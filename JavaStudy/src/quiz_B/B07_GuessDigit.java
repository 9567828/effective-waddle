package quiz_B;

import java.util.Scanner;

// 24.04.23


public class B07_GuessDigit {

	/*
	 	(1) 사용자가 어떤 숫자를 int 타입으로 입력하면 해당 숫자가 몇 자리 숫자인지
	 	    알려주는 프로그램을 만들어 보세요
	*/
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		// int num = 2000000;
		
		int cnt = 0;
		for(int i = 1; i <= num; i *= 10) {
			++cnt;
		}
		System.out.printf("입력하신 숫자의 자리수는 %d 입니다", cnt);
		
	}
	
}
