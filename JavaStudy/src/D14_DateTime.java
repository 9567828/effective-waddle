// 24.05.27

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class D14_DateTime {

	/*
 		# java.time 패키지
 		
 		- Calendar의 여러가지 단점을 보완한 패키지
 		- Calendar가 set(), add()를 통해 원본 인스턴스를 변경하는 것이
 		  불변성을 해치는 큰 단점이라고 생각하여 새로운 시간 인스턴스를 만들어 반환하는 방식을 사용한다
 		- 날짜만 따로 다루는 클래스와 시간만 따로 다루는 클래스를 선택하여 사용할 수 있다
 		
 		# java.time.LocalDateTime
 		
 		- 날짜와 시간을 모두 다루는 클래스
 		
 		# java.time.LocalDate
 		
 		- 날짜만 다루는 클래스
 		
 		# java.time.LocalTime
 		
 		- 시간만 다루는 클래스
	*/
	
	public static void main(String[] args) {
		// now() : 현재 시간으로 인스턴스를 생성하여 반환한다
		LocalDateTime nowdt = LocalDateTime.now();
		LocalDate now_d = LocalDate.now();
		LocalTime now_t = LocalTime.now();
		
		System.out.println("로컬데이트타임 " + nowdt);
		System.out.println("로컬데이트 " + now_d);
		System.out.println("로컬타임 " + now_t);
		
		// plus, minus 메서드를 통해 해당 인스턴스를 기준으로
		// 새로운 시간을 만들어낼 수 있다
		// 캘린더처럼 원본을 훼손하는 것이 아니라 새로운 인스턴스를 만들어 낸다
		
		System.out.println("nowdt + 10 " + nowdt.plusDays(10));
		System.out.println("nowdt + 3hour " + nowdt.plusHours(3));
		System.out.println("now_d + 5year " + now_d.minusYears(5));
		System.out.println("now_d + 20개월 " + now_d.plusMonths(20));
		
		// get 메서드로 원하는 단위의 값을 꺼낼 수 있다
		System.out.println("현재날짜 " + nowdt.getDayOfMonth());
		System.out.println("10일뒤의 날짜 " + nowdt.plusDays(10).getDayOfMonth());
		System.out.println("현재 몇 분? " + now_t.getMinute());
		
		// 요일을 꺼낼 때 DayOfWeek라는 인스턴스가 반환된다
		System.out.println("요일? " + now_d.getDayOfWeek());
		
		// 요일 인스턴스를 활용할 수 있다
		DayOfWeek dow = now_d.getDayOfWeek();
		
		// 요일.getDisplayName(길이, 언어) : 해당 요일의 이름을 꺼낸다
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.KOREAN));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.JAPANESE));
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.JAPANESE));
		
		// 7 가지 요일 인스턴스는 DayOfWeek 클래스의 상수로 만들어져 있다
		System.out.println(DayOfWeek.MONDAY.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println(DayOfWeek.TUESDAY.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println(DayOfWeek.WEDNESDAY.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println(DayOfWeek.THURSDAY.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println(DayOfWeek.SATURDAY.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println(DayOfWeek.SUNDAY.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		
		// getMonth()를 할 때도 Month클래스 인스턴스를 반환한다
		System.out.println(nowdt.getMonth());
		
		Month thisMonth = now_d.getMonth();
		System.out.println("thismonth의 값 " + thisMonth.getValue());
		System.out.println("달 이름 " + thisMonth.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println("달 이름 " + thisMonth.getDisplayName(TextStyle.FULL, Locale.JAPANESE));
		System.out.println("달 이름 " + thisMonth.getDisplayName(TextStyle.FULL, Locale.FRENCH));
		
		// of() : 원하는 시간의 인스턴스를 생성할 수 있는 static 메서드
		LocalDate date1 = LocalDate.of(2001, 5, 3);
		LocalTime time1 = LocalTime.of(14, 36);
		System.out.println(LocalDateTime.of(date1, time1));
		
		// with() : 해당 인스턴스의 특정 필드를 수정한 인스턴스를 반환한다
		LocalDate date2 = date1.withMonth(7);
		LocalDate date3 = date1.plusMonths(7);
		System.out.println("with 결과 " + date2);
		System.out.println("plus 결과 " + date3);
		
		// 시간의 단위는(TemporalField)는 chronoField 클래스에 상수로 정의되어있다
		LocalTime time2 = time1.with(ChronoField.HOUR_OF_DAY, 20);
		LocalTime time3 = time1.withHour(20);
		
		System.out.println(time2);
		System.out.println(time3);
		
		
		// now(ZoneID) : 다른 국가의 날짜 및 시간을 확인할 때 사용한다
		LocalDateTime usTime = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(usTime);
		
		// 사용 가능한 zoneId 확인해 보기
		// List, sort를 활용해서 a-z 순서로 변경하기
//		List<String> zoneIdList = new ArrayList<>(ZoneId.getAvailableZoneIds());
//		Collections.sort(zoneIdList);
//		
//		for (String ZoneId : zoneIdList) {
//			System.out.println(ZoneId);
//		}
		
		// TemparalAdjuster 인터페이스 : 특정 날짜를 만들어주는 기능을 하는 인터페이스
		// TemparalAdjusters 클래스 : TemparalAdjuster를 구현한 인스턴스들을 모아놓은 클래스
		// (시간 조절기들 클래스에 시간 조절기가 들어있다)
		LocalDate childernsDay = LocalDate.of(2024, 5, 5);
		LocalDate lastDayOfMay = childernsDay.withDayOfMonth(31);
		
		System.out.println("어린이날 " + childernsDay);
		System.out.println("5월 막날 " + lastDayOfMay);
		
		// with 메서드와 함께
		// TemporalAdjusters의 여러 시간조절기들을 꺼내 쓸 수 있다
		System.out.println("어린이날이 포함된 달의 마지막 날: " +
					childernsDay.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("어린이날 다음달의 마지막날짜: " 
					+ childernsDay.plusMonths(1).with(TemporalAdjusters.lastDayOfMonth()));
		
		System.out.println("저번 주 수요일 인스턴스? " 
					+ LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY)));
		
		System.out.println("이번달의 2번째 목요일: "
					+ LocalDate.now().with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.THURSDAY)));
		
	}
	
}
