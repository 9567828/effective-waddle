package quiz;
// 풀이

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import myobj.KoreanHolidays;

public class D13_GraduateDayT {
	
	/*
	 	사용자가 수업이 시작한 날짜와 수업을 받아야 하는 날을 입력하면
	 	수업을 쉬는 날을 모두 출력해 주고
	 	수업이 종료되는 날짜도 알려주는 프로그램을 만들어보세요
	 	
	 	쉬는 날 - 토,일 공휴일(대체휴일 포함)
	*/
	
	public static void classSchedule(int year, int month, int date, int period) {
		SimpleDateFormat dateFortmat = new SimpleDateFormat("yyyy-MM-dd(E)");
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, date - 1); // 오늘부터 체크하기 위해 1뺌
		
		
		int studyday = 0;
		while (studyday < period) {
			// 와일을 돌면서 스터디 데이를 하루씩 증가 시켜
			cal.add(Calendar.DATE, 1);
			String dateStr = dateFortmat.format(cal.getTime());
			
			// 증가한 날이 토/일 이면 공부한 날이 증가하지 않는다
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {

				System.out.printf("%s는 쉬는날 입니다(%s)\n", dateStr,
						cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.KOREA));
				continue;
			}
			
			// 공휴일이면 공부한 날이 증가하지 않음
			if (KoreanHolidays.isHoliday(cal)) {
				System.out.printf("%s는 쉬는날 입니다(공휴일)\n", dateStr);
				continue;
			}
//			System.out.printf("%s는 %d일 째 공부하는 날 입니다.\n", dateStr, studyday + 1);
			++studyday;
		}
		String dateStr = dateFortmat.format(cal.getTime());
		System.out.println("수업종료일: " + dateStr);
	}
	
	public static void main(String[] args) {
		int year = 2024;
		int month = 1;
		int date = 1;
		int period = 300;
		
		classSchedule(year, month, date, period);
		
		
		
	}
}
