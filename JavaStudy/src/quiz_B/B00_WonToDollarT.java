package quiz_B;
// 24.04.18

import java.util.Scanner;

public class B00_WonToDollarT {

	/*
		한국 돈을 입력하면 달러로 얼마인지 출력해주는 프로그램을 만들어보세요
		(환율은 현재 환율 검색)
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("KRW > ");
		int krw = sc.nextInt();
		double exchangeRate = 1373.55;
		double usd = krw / exchangeRate;
		
		System.out.printf("%dKRW은 %.2fUSD입니다. \n", krw, usd);
		
	}
	
}
