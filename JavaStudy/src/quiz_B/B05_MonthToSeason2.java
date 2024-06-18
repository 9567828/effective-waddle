package quiz_B;

import java.util.Scanner;

public class B05_MonthToSeason2 {

	/*
	 	사용자로부터 몇월인지 입력 받으면 해당하는 계절을 출력해보세요
	 	(swith-case문 / if문으로 각각 한 번씩 만들기)
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("몇월? 숫자만쓰시오> ");
		
		month = sc.nextInt();
		
		// 11~2월 겨울 , 3~5월 봄, 6~8월 여름 , 9월~10월 가을
		
		System.out.println("switch문");
		switch (month) {
		case 11 :
		case 12 :
		case 1 :
		case 2 :
			System.out.println("겨울이다");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄이다");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름이다");
			break;
		case 9 :
		case 10 :
			System.out.println("가을이다");
			break;
		default :
			System.out.println("1~12월만 쓰세여");
			break;
		}
		
		System.out.println("------------------------------");
		
		System.out.println("if문");
		if (month <= 0 || month > 12) {
			System.out.println("1~12월 중에 입력해주세요");
		} else if (month == 11 || month == 12 || month == 1 || month == 2) {
			System.out.println("겨울이지");			
		} else if (month <= 3 || month <= 5) {
			System.out.println("봄이지");
		} else if (month <= 6 || month <= 8) {
			System.out.println("여름이지");
		} else if (month <= 9 || month <= 10) {
			System.out.println("가을이지");
		}
		
		System.out.println("------------------------------");
		
		System.out.print("몇월? 0월 형태로 쓰시오> ");
		String strMonth = sc.next();
		
		
		System.out.println("switch문");
		switch (strMonth) {
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
		

		System.out.println("if문");
		if (strMonth == "11월" || strMonth == "12월" || strMonth == "1월" || strMonth == "2월") {
			System.out.println("겨울이지");			
		} else if (strMonth == "3월" || strMonth == "4월" || strMonth == "5월") {
			System.out.println("봄이지");
		} else if (strMonth == "6월" || strMonth == "7월" || strMonth == "8월") {
			System.out.println("여름이지");
		} else if (strMonth == "9월" || strMonth == "10월") {
			System.out.println("가을이지");
		} else {
			System.out.println("종료");
		}
	}
	
}
