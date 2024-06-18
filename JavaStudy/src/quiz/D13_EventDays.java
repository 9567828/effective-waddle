package quiz;
// 24. 05. 24

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D13_EventDays {

	/*
	 	실행하면 오늘부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어주세요
	 	
	 	1+1 이벤트 : 매월 18일
	 	20%할인 이벤트 : 홀수번째 주 금요일
	 	구매시 아메리카노 무료 이벤트 : 매주 화요일
	 	
	 	※ 이벤트 날짜가 겹치는 날에는 모든 이벤트를 출력해줘야 한다
	*/
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sb = new SimpleDateFormat("yyyy년 MM월 dd일 (E)");
		
		int i = 0;
		while (i < 365) {
			now.add(Calendar.DATE, 1);
			String dateForm = sb.format(now.getTime());

			boolean istrue = false;
			String[] eventName = {"1+1이벤트", "20%할인이벤트", "구매 시 아메리카노무료"};
			
			
			int oneBoneG = now.get(Calendar.DAY_OF_MONTH);
			if (oneBoneG == 18) {
				
				istrue = true;
//				System.out.printf("%s: 1+1이벤트\n", dateForm);				
			}
						
			int week = now.get(Calendar.WEEK_OF_MONTH);
			int date = now.get(Calendar.DAY_OF_WEEK);
			boolean oddWeek = week % 2 != 0;
			
			if (oddWeek) {
				if (date == Calendar.FRIDAY) {
					
					istrue = true;
//					System.out.printf("%s: 20%%할인이벤트\n", dateForm);
				}
			}
			
			int tue = now.get(Calendar.DAY_OF_WEEK);
			if (tue == Calendar.TUESDAY) {
				
				istrue = true;
//				System.out.printf("%s: 아메리카노무료\n", dateForm);				
			}
						
			
//			if (istrue) {
//				System.out.printf("%s: %s\n", dateForm, eventName[i]);
//			} else {
//				System.out.printf("%s\n", dateForm);				
//			}
			
			++i;
		}
			
			
			
			
	}
	
}
