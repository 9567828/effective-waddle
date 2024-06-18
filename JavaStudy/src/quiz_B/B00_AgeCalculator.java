package quiz_B;

// 24.04.18

import java.util.Scanner;

public class B00_AgeCalculator {

	/*
	 	이름과 태어난 년도를 입력하면 이름과 나이를 출력해 주는 프로그램을 만들어보세요
	 	
	 	ex) 김동우 1997 입력 => 김동우 (28세)
	 	
	*/
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 > ");
		String name = sc.next();
		
		
		System.out.print("출생년도를 입력하세요 > ");
		int year = sc.nextInt();
		int age = (2024-year+1);
		
		
		// System.out.println(name + ' ' + "(" + age + "세)");
		System.out.printf("%s (%d세)\n", name, age);
		
		
	}
	
}





