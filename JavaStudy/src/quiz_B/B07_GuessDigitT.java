package quiz_B;

import java.util.Scanner;

// 24.04.23
// 풀이

public class B07_GuessDigitT {

	/*
	 	사용자가 어떤 숫자를 int 타입으로 입력하면 해당 숫자가 몇 자리 숫자인지
	 	알려주는 프로그램을 만들어 보세요
	*/
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int num = sc.nextInt();
		
		
		
//		System.out.println((int)Math.log10(num) +1);
		
		
//		기본적인 자릿수 구하는 공식
		int cnt;
		for (cnt = 0; num > 0; num /= 10) {
			++cnt;
		}
		System.out.println(cnt + "자리 숫자입니다.");
		
		

//		2. 원시적인 생각을 잘 밀어붙인 결과;
//		int cnt = 1;
//		// compare <= 10000000000L 이 조건은 안들어가도 무방하다
//		for (int compare = 10; compare <= 10000000000L && compare <= num ; compare *= 10) {
//			++cnt;
//		}
//		System.out.println(cnt + "자리 입니다.");

		

//		1. 원시적인 생각
//		if (num < 10) {
//			System.out.println("한 자리 숫자 입니다");
//		} else if (num < 100) {
//			System.out.println("두 자리 숫자 입니다");
//		}
		
	}
	
}
