package quiz_B;
// 24.04.18

import java.util.Scanner;

public class B00_WonToDollar {

	/*
		한국 돈을 입력하면 달러로 얼마인지 출력해주는 프로그램을 만들어보세요
		(환율은 현재 환율 검색)
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력해주세요(기준환율 1374.10원)> ");
		int won = sc.nextInt();
		double usd = 1374.10;
		
		double usd1 = won / usd;
		
		double a = Math.round(usd1 * 100) / 100.0;
		
		
		System.out.println("달러: " + a);
		//System.out.printf("%s%.2f\n", "달러: ", usd1);
		
	}
	
}
