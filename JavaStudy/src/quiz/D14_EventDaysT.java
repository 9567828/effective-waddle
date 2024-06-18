package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

// 24. 05. 27
// 풀이

public class D14_EventDaysT {

	/*
	 	
	 	java.time 패키지의 클래스들만 활용하여
	 	
	 	실행하면 오늘부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어주세요
	 	
	 	1+1 이벤트 : 매월 18일
	 	20%할인 이벤트 : 홀수번째 주 금요일
	 	구매시 아메리카노 무료 이벤트 : 매주 화요일
	 	
	 	※ 이벤트 날짜가 겹치는 날에는 모든 이벤트를 출력해줘야 한다
	*/
	
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate afterOneYear = now.plusDays(365);
		
		LocalDate check = now;
		
		// java.time 패키지의 클래스로 문자열 만들기
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy.MM.dd(E)", Locale.KOREAN);
		
		// 1년 보다 전 인동안 while로 확인할 수 있다
		// now.isBefore가 들어가면 무한루프가 되기 때문에 check라는 새로운 데이터를 만들어준다
		while (check.isBefore(afterOneYear)) {
//			System.out.print(check + ": ");
			System.out.print(check.format(f) + ": ");
			
			boolean eventExist = false;
			
			if (check.getDayOfMonth() == 18) {
				System.out.print("[1+1 이벤트]");
				eventExist = true;
			}
			
			
			// 한 주에 대한 정의를 수정한 인스턴스를 생성할 수 있다
			// : 한 주를 시작하는 첫 요일(기본값 월요일), 첫 주가 되기 위한 최소날짜 (기본값 1)
			// WeekFields weekField = WeekFields.of(DayOfWeek.TUESDAY, 3);
			
			// WeekFields: Week와 관련된 여러 시간단위 (TemporalField)들을 제공해주는 클래스
			int weekOfMonth = check.get(WeekFields.of(Locale.KOREAN).weekOfMonth());
			
			// equals로 비교해야한다
			if (weekOfMonth % 2 == 1 && check.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
				if (eventExist) {
					System.out.print(", [20% 할인 이벤트]");
				} else {
					System.out.print("[20% 할인 이벤트]");					
				}
				eventExist = true;
			}
			
			if (check.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
				if (eventExist) {
					System.out.print(", [구매 시 아메리카노 무료]");
				} else {
					System.out.print("[구매 시 아메리카노 무료]");					
				}
				eventExist = true;
			}
			
			System.out.println();
			check = check.plusDays(1);
		}
		
	}
	
}
