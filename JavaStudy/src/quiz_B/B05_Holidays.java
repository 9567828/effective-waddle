package quiz_B;

import java.util.Scanner;

public class B05_Holidays {

	/*
 		공휴일
 		어린이날 (5월5일) / 크리스마스 (12월 25일) / 광복절 (8월 15일) / 한글날 (10월 9일) / 현충일 (6월 6일)
	*/
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("날짜를 알고 싶은 공휴일을 입력하세요 (ex. 어린이날)> ");
		String holidayInput = sc.next();
		
		String childern = "5월 5일";
		String Christmas = "12월 25일";
		String indeP = "8월 15일";
		String hangle = "10월 9일";
		String army = "6월 6일";
		
		switch(holidayInput) {
		default :
			System.out.println("알 수 없습니다");
			break;
		case "어린이날" :
			System.out.printf("%s은(는) %s 입니다.\n", holidayInput, childern);
			break;
		case "크리스마스" :
			System.out.printf("%s은(는) %s 입니다.\n", holidayInput, Christmas);
			break;
		case "광복절" :
			System.out.printf("%s은(는) %s 입니다.\n", holidayInput, indeP);
			break;
		case "한글날" :
			System.out.printf("%s은(는) %s 입니다.\n", holidayInput, hangle);
			break;
		case "현충일" :
			System.out.printf("%s은(는) %s 입니다.\n", holidayInput, army);
			break;
		}
		
		if(holidayInput.equals("어린이날")) {
			System.out.printf("%s은(는) %s 입니다.", holidayInput, childern);
		} else if (holidayInput.equals("현충일")) {
			System.out.printf("%s은(는) %s 입니다.", holidayInput, army);
		} else if (holidayInput.equals("크리스마스")) {
			System.out.printf("%s은(는) %s 입니다.", holidayInput, Christmas);
		
		} else if (holidayInput.equals("광복절")) {
			System.out.printf("%s은(는) %s 입니다.", holidayInput, indeP);
	
		} else if (holidayInput.equals("한글날")) {
			System.out.printf("%s은(는) %s 입니다.", holidayInput, hangle);
	
		} else {
			System.out.println("알 수 없습니다");
		}
	}
	
}
