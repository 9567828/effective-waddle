package quiz;
// 24. 05. 27
// 풀이

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_NumberOnlyT {
	/*
	  	사용자로부터 스캐너의 nextInt()로 숫자를 입력받되, 숫자가 아닌 것을 입력하더라도
	  	프로그램이 강제종료되지 않고 다시 입력받을 수 있게 만들어보세요
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print(">> ");
				int num = sc.nextInt();
				System.out.println("입력한 숫자" + num);
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력");
				String trash = sc.nextLine();
				System.out.println("통로에 남아있던 잘못 된 문자: " + trash);
			}			
		}
		System.out.println("프로그램이 정상 종료 되었습니다");
		
		
	}

}
