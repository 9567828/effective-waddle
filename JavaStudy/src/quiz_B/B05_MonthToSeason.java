package quiz_B;

import java.util.Scanner;

public class B05_MonthToSeason {

	/*
	 	사용자로부터 몇월인지 입력 받으면 해당하는 계절을 출력해보세요
	 	(swith-case문 / if문으로 각각 한 번씩 만들기)
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month;
		
		System.out.print("몇월? (0월) 형태로쓰시오> ");
		
		month = sc.next();
		
		// 11~2월 겨울 , 3~5월 봄, 6~8월 여름 , 9월~10월 가을
		
		switch (month) {
		case "11월" :
		case "12월" :
		case "1월" :
		case "2월" :
			System.out.println("겨울이다");
			break;
		case "3월" :
		case "4월" :
		case "5월" :
			System.out.println("봄이다");
			break;
		case "6월" :
		case "7월" :
		case "8월" :
			System.out.println("여름이다");
			break;
		case "9월" :
		case "10월" :
			System.out.println("가을이다");
			break;
		}
		System.out.println("------------------------------");
		
		System.out.print("몇월? >");
		int month2 = sc.nextInt();
		
		if (month2 == 11 || month2 == 12 || month2 == 1 || month2 == 2) {
			System.out.println("겨울이다");
		} else if (month2 == 3 || month2 == 4 || month2 == 5) {
			System.out.println("봄이다");
		} else if (month2 == 6 || month2 == 7 || month2 == 8) {
			System.out.println("여름이다");
		} else if (month2 == 9 || month2 == 10) {
			System.out.println("가을이다");
		}
		
	}
	
}
