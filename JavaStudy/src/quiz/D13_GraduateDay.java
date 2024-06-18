package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import myobj.graduate.DateCalc;

public class D13_GraduateDay {
	
	/*
	 	사용자가 수업이 시작한 날짜와 수업을 받아야 하는 날을 입력하면
	 	수업을 쉬는 날을 모두 출력해 주고
	 	수업이 종료되는 날짜도 알려주는 프로그램을 만들어보세요
	 	
	 	쉬는 날 - 토,일 공휴일(대체휴일 포함)
	*/
	
	public static void main(String[] args) {
		DateCalc getStartDate = new DateCalc(2024, 4, 16, 160);
		int getYear = getStartDate.getYear();
		int getMonth = getStartDate.getMonth() - 1;
		int getDate = getStartDate.getDay();
		int getDays = getStartDate.getDays();
		
		Calendar now = Calendar.getInstance();
		Calendar startDate = Calendar.getInstance();
		startDate.set(Calendar.YEAR, getYear);
		startDate.set(Calendar.MONTH, getMonth);
		startDate.set(Calendar.DATE, getDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E");
		String result = sdf.format(startDate.getTime());
		
		Calendar newYear = Calendar.getInstance();
		Calendar moonYear1 = Calendar.getInstance();
		Calendar moonYear2 = Calendar.getInstance();
		Calendar moonYear3 = Calendar.getInstance();
		Calendar moonYear4 = Calendar.getInstance();
		Calendar samil = Calendar.getInstance();
		Calendar election = Calendar.getInstance();
		Calendar workersDay = Calendar.getInstance();
		Calendar childrends = Calendar.getInstance();
		Calendar comingbuddha = Calendar.getInstance();
		Calendar memorialDay = Calendar.getInstance();
		Calendar Liberation = Calendar.getInstance();
		Calendar thanksGiving1 = Calendar.getInstance();
		Calendar thanksGiving2 = Calendar.getInstance();
		Calendar thanksGiving3 = Calendar.getInstance();
		Calendar nationalFoundation = Calendar.getInstance();
		Calendar korean = Calendar.getInstance();
		Calendar xMas = Calendar.getInstance();
		
		newYear.set(2024, 0, 1);
		moonYear1.set(2024, 1, 9);
		moonYear2.set(2024, 1, 10);
		moonYear3.set(2024, 1, 11);
		moonYear4.set(2024, 1, 12);
		samil.set(2024, 2, 1);
		election.set(2024, 3, 10);
		workersDay.set(2024, 4, 1);
		childrends.set(2024, 4, 6);
		comingbuddha.set(2024, 4, 15);
		memorialDay.set(2024, 5, 6);
		Liberation.set(2024, 7, 15);
		thanksGiving1.set(2024, 8, 16);
		thanksGiving2.set(2024, 8, 17);
		thanksGiving3.set(2024, 8, 18);
		nationalFoundation.set(2024, 9, 3);
		korean.set(2024, 9, 9);
		xMas.set(2024, 11, 25);
		
		List<Calendar> holidayList = new ArrayList<>();
		
		Collections.addAll(holidayList, newYear, moonYear1, moonYear2, moonYear3, moonYear4, samil, 
				election, workersDay, childrends, comingbuddha, memorialDay, Liberation, 
				thanksGiving1, thanksGiving2, thanksGiving3, nationalFoundation, korean, xMas);
		
		int i = 0;
		while (true) {
			if (startDate.after(holidayList.get(i))) {
				for (i = 0; i < holidayList.size(); ++i) {
					System.out.printf("공휴일: %d년 %d월 %d일\n", 
							holidayList.get(i).get(Calendar.YEAR),
							holidayList.get(i).get(Calendar.MONTH) + 1,
							holidayList.get(i).get(Calendar.DATE)
							);
				}
			}
			if (startDate.get(Calendar.DAY_OF_WEEK) == 1 || startDate.get(Calendar.DAY_OF_WEEK) == 7) {
				System.out.printf("%d요일", startDate.get(Calendar.DAY_OF_WEEK));
			} else {
				System.out.println("수업시작 날짜: " + result);	
			}
		}
		
		
	}
}
