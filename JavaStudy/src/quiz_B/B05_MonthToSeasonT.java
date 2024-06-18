package quiz_B;

import java.util.Scanner;


// 풀이
public class B05_MonthToSeasonT {

	/*
	 	사용자로부터 몇월인지 입력 받으면 해당하는 계절을 출력해보세요
	 	(swith-case문 / if문으로 각각 한 번씩 만들기)
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력(숫자)> ");
		int month = sc.nextInt();
		
		String seasonName;
		
		switch(month) {
			default:
				seasonName = "없는 달";
				break;
			case 12: // case 1, 2, 3 형식으로도 사용 가능하지만 버전이 낮으면 안될 확률이 높음
			case 1:
			case 2:
			case 11:
				seasonName = "겨울";
				break;
			case 3:
			case 4:
				seasonName = "봄";
				break;
			case 5:
			case 6:
			case 7:
			case 8:
				seasonName = "여름";
				break;
			case 9:
			case 10:
				seasonName = "가을";
				break;
		}
		System.out.printf("%d월은 %s입니다.\n", month, seasonName);
		
		if (month == 3 || month == 4 ) {
			seasonName = "봄";
		} else if (month >5 && month <= 8) {
			seasonName = "여름";
		} else if (month == 9 || month == 10) {
			seasonName = "여름";			
		} else if (month == 11 || month == 12 || month == 1 || month == 2) {
			seasonName = "겨울";
		} else {
			seasonName = "없는 달";			
		}
		System.out.printf("%d월은 %s입니다.\n", month, seasonName);
		
		System.out.println("---------------------------------------");
		System.out.print("월을 입력(영어)> ");
		
		String monthName = sc.next();
		
		// "문자열".toLowerCase() : 어떤 문자열을 모두 소문자로 바꿔준다
		// monthName = monthName.toLowerCase();
		
		// 비교시 소문자 또는 대문자로 통일한 후에 비교하면 대소문자에 상관 없이 비교가 가능하다
		switch (monthName.toLowerCase()) { // 소문자로 아예 바꾸지는 않고 비교할 때만 소문자로 확인한다
		case "sep": case "oct":
			seasonName = "Fall";
			break;
		case "nov": case "dec": case "jan": case "feb":
			seasonName = "Winter";
			break;
		case "mar": case "apr":
			seasonName = "Spring";
			break;
		case "may": case "jun": case "jul": case "aug":
			seasonName = "Summer";
			break;
		default :
			seasonName = "Invaild month";
			break;
		}
		System.out.printf("%s is %s in korea.\n", monthName.toUpperCase(), seasonName);
		
		
		// 문자열(뿐만 아니라 대문자로 시작하는 모든 타입) 확인 시 에는 무조건 equals()
		if(monthName.equalsIgnoreCase("sep") || monthName.equalsIgnoreCase("oct")) {
			seasonName = "Fall";
		} else if (monthName.equalsIgnoreCase("nov") || monthName.equalsIgnoreCase("dec")
				|| monthName.equalsIgnoreCase("jan") || monthName.equalsIgnoreCase("feb")) {
			seasonName = "Winter";
		} else if (monthName.equalsIgnoreCase("mar") || monthName.equalsIgnoreCase("apr")) {
			seasonName = "Spring";			
		} else if (monthName.equalsIgnoreCase("may") || monthName.equalsIgnoreCase("jun")
				|| monthName.equalsIgnoreCase("jul") || monthName.equalsIgnoreCase("aug")) {
			seasonName = "Summer";			
		} else {
			seasonName = "Invaild month";
		}
		System.out.printf("%s is %s in korea.\n", monthName.toUpperCase(), seasonName);
	}
	
}
