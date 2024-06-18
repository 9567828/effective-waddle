package myobj;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class KoreanHolidays {
	
	final private static HashMap<Integer, List<Calendar>> HOLIDAYS = new HashMap<>();
	
	static {
		List<Calendar> holidays2024 = new ArrayList<>();
		
		Calendar newYear = Calendar.getInstance();
		Calendar moonYear1 = Calendar.getInstance();
		Calendar moonYear2 = Calendar.getInstance();
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
		moonYear2.set(2024, 1, 12);
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
		
		
		holidays2024.add(newYear);
		holidays2024.add(moonYear1);
		holidays2024.add(moonYear2);
		holidays2024.add(samil);
		holidays2024.add(moonYear2);
		holidays2024.add(election);
		holidays2024.add(workersDay);
		holidays2024.add(childrends);
		holidays2024.add(comingbuddha);
		holidays2024.add(memorialDay);
		holidays2024.add(Liberation);
		holidays2024.add(thanksGiving1);
		holidays2024.add(thanksGiving2);
		holidays2024.add(thanksGiving3);
		holidays2024.add(thanksGiving3);
		holidays2024.add(nationalFoundation);
		holidays2024.add(korean);
		holidays2024.add(xMas);
		
		HOLIDAYS.put(2024, holidays2024);
		HOLIDAYS.put(2025, new ArrayList<>());
		
	}
	

	public static boolean isHoliday (Calendar day) {
		int year = day.get(Calendar.YEAR);
		int mon1 = day.get(Calendar.MONTH) + 1;
		int date1 = day.get(Calendar.DATE); 
		
		List<Calendar> holidayList = HOLIDAYS.get(year);
		
		for (Calendar holiday : holidayList) {
			int mon2 = holiday.get(Calendar.MONTH) + 1;
			int date2 = holiday.get(Calendar.DATE);
			
			if (mon1 == mon2 && date1 == date2) {
				System.out.println("mon1: " + mon1 + ", mon2: " + mon2);
				System.out.println("date1: " + date1 + ", date2: " + date2);
				return true;
			}
		}
		return false;
	}
	
}
