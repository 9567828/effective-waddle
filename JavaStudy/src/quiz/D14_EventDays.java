package quiz;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.util.Locale;

// 24. 05. 27

public class D14_EventDays {

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
		
		
		for (int i = 0; i < 365; ++i) {
			LocalDate eventDate = now.plusDays(i);
			DayOfWeek dates = eventDate.getDayOfWeek();
			String korean = dates.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
					
			System.out.printf("%s(%s)행사: ", eventDate, korean);
			
			boolean isEvent = false;
			
			if (eventDate.getDayOfMonth() == 18) {
				System.out.print("[1 + 1]");
				isEvent = true;
			}
			
			if (eventDate.get(ChronoField.ALIGNED_WEEK_OF_MONTH) % 2 == 1 &&
					eventDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
				if (isEvent) {
					System.out.print(", [20% 할인]");	
				} else {
					System.out.print("[20% 할인]");						
				}
				isEvent = true;
			}
			
			if (eventDate.getDayOfWeek() == DayOfWeek.TUESDAY) {
				if (isEvent) {
					System.out.print(", [구매 시 아메리카노 무료]");					
				} else {
					System.out.print("[구매 시 아메리카노 무료]");					
				}
			}
			
			
			
			System.out.println();
		}
		
		
	}
	
}
