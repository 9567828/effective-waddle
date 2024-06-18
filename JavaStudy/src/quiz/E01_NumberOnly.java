package quiz;

import java.util.Scanner;

public class E01_NumberOnly {
	/*
	  	사용자로부터 스캐너의 nextInt()로 숫자를 입력받되, 숫자가 아닌 것을 입력하더라도
	  	프로그램이 강제종료되지 않고 다시 입력받을 수 있게 만들어보세요
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean istrue = false;
		
		while (true) {
			System.out.print("입력하세요>> ");
			int num = 0;
			
			try {
				num = sc.nextInt();
				istrue = true;
			} catch (java.util.InputMismatchException e) {
				istrue = false;
				System.out.println("숫자만 입력");
			}
			
			if (istrue) {
				System.out.println(num);
			} else {
				num = sc.nextInt();
			}
			
			
		}
		

		
		
	}

}
