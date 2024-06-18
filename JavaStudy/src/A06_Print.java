// 24.04.18

public class A06_Print {

	/*
		# 콘솔에 출력하는 함수들
		
		1. println()
		
		 - ()안에 전달한 데이터를 콘솔에 출력하고 출력 맨 마지막에 \n을 추가한다 (ln이 \n과 유사하게 생김)
		 - 데이터를 아무것도 전달하지 않으면 줄만 바꿔준다 (\n)
		 
		2. print()
		
		 - ()안에 전달한 데이터를 콘솔에 출력한다
		 - 줄을 자동으로 바꿔주지 않는다
		 - 데이터를 아무것도 전달하지 않으면 사용할 수 없다
		 
		3. printf()
		
		 - print format
		 - 서식을 사용해 데이터를 출력할 수 있는 함수
		 - 출력하고 싶은 문자열의 형식을 먼저 지정한 후 데이터가 
		   들어가야 하는 자리에 데이터를 순서대로 채워서 사용한다 
		 - ※ printf()는 줄을 자동으로 바꿔주지 않기 때문에 주의해야 한다 (서식 끝에 \n을 넣어야함)
		 
	 	 * printf()에 사용할 수 있는 서식 문자의 종류
	 	   
	 	   %d (decimal)	: 해당 자리에 전달한 정수값을 10진수로 출력
	 	   %o (octal) 	: 해당 자리에 전달한 정수값을 8진수로 출력
	 	   %x (hexa)	: 해당 자리에 전달한 정수값을 16진수로 출력, 알파벳을 소문자로 출력
	 	   %X			: 해당 자리에 전달한 정수값을 16진수로 출력, 알파벳을 대문자로 출력
	 	   %f			: 실수
	 	   %c			: 문자 (한글자)
	 	   %s			: 문자열
	 	   %%			: 그냥 %를 출력하고 싶은 경우 (서식문자의 Escape)
	 	   
	 	 * 서식문자 옵션 - 서식 문자의 %와 문자 사이에 넣어서 사용
	 	 
	 	   1. %숫자d : 숫자만큼 자릿수를 확보하면서 출력한다
	 	   
	 	   2. %-숫자d : 숫자만큼 자릿수를 확보한 후 왼쪽 정렬하여 출력한다
	 	   
	 	   3. %0숫자d : 숫자만큼 자릿수를 확보한 후 빈자리에 0을 채워 출력
	 	   
	 	   4. %+d : 양수인 경우에도 부호를 출력해준다
	 	   
	 	   5. %.숫자f : 실수의 소숫점 아래 자릿수를 설정할 수 있다
	 	 	 	   
	 	 
	 	 # 10진수 (숫자가 10개밖에 없다 0~9)
	 	 표기숫자								실제값
	 	 15		=> 10 x 1 + 5				15
	 	 25		=> 10 x 2 + 5				25
	 	 325 	=> 10^2 x 3 + 10 x 2 + 5		325
	 	 
	 	 
	 	 # 8진수 (숫자가 8개 밖에 없다)
	 	 표기숫자					실제값
	 	 15 	=> 8 x 1 + 5	13
	 	 25		=> 8 x 2 + 5	21
	 	 325	=> 
	 	 
	 	 # 2진수 (숫자가 2개)
	 	 0 1 10 11 100 101 110 111 1000 1001 1010 1011 1100 1101 1110 1111 10000
	 	 
	 	   
	 	   
	*/
	
	public static void main(String[] args) {
		
		// 소문자로 시작하는 타입들 - 기본형 타입
		// 대문자로 시작하는 타입들 - 참조형 타입
		
		double hello = 3.14;
		
		System.out.println("hello");
		System.out.println(hello);
		System.out.println(true);
		System.out.println(123 + 123);
		System.out.println("======================");
		System.out.print("hello");
		System.out.print(hello);
		System.out.print(true);
		System.out.print(123 + 123 + "\n"); // println()과 같이 하려면 끝마다 \n을 넣어주어야 한다
		System.out.println(123 + 123);
		
		int year = 2024;
		int month = 4;
		int date = 18;
		int hour = 9;
		int minute = 38;
		int second = 45;
		
		System.out.println(); // 비어있어도 줄바꾸기 실행 됨
		//System.out.print(); // 빈값이면 아무것도 출력할 수 없다
		//System.out.printf(); //object -아무거나 달라 object... 갯수상관없이
		
		// println()으로 출력하기 다소 불편한 경우
		System.out.println(year + "년 " + month + "월 " + date + "일 " + hour + ":" + minute + ":" + second);
		
		
		// printf()를 사용하면 출력하기 편할 수 있다
		System.out.printf("%d년 %d월 %d일 %d:%d:%d\n", 
				          year, month, date, hour, minute, second);
		System.out.println();
		System.out.printf("15를 10진수로 표현하면? %d\n", 15);
		System.out.printf("15를 8진수로 표현하면? %o\n", 15);
		System.out.printf("15를 16진수 소문자로 표현하면? %x\n", 15);
		System.out.printf("15를 16진수 대문자로 표현하면? %X\n", 15);
		System.out.println("----------------------------------");
		
		System.out.printf("%f\n", 12.12345f);
		System.out.printf("%s\n", "문자열");
		System.out.printf("%c등급\n", 'A');
		System.out.println();
		
		// 지정한 숫자의 자릿수 만큼 채워 들어간다 alice(5) 공백 (4)
		System.out.printf("%9s%9s%9s%9s\n", "alice", "chloe", "erin", "jade");
		System.out.printf("%9d%9d%9d%9d\n", 10, 9033, 1285, 8818);
		System.out.println("------------------------------------------------");
		
		System.out.printf("%-9s%-9s%-9s%-9s\n", "alice", "chloe", "erin", "jade");
		System.out.printf("%-9d%-9d%-9d%-9d\n", 10, 9033, 1285, 8818);
		System.out.println("------------------------------------------------");
				
		System.out.printf("%02d\t%02d\t%02d\t%02d\t%02d\n", 8, 9, 10, 11, 12);
		System.out.printf("%02d\t%02d\t%02d\t%02d\t%02d\n", 13, 14, 15, 16, 17);
		System.out.printf("%02d\t%02d\t%02d\t%02d\t%02d\n", 3, 1, 333, 20, 17);
		System.out.println("------------------------------------------------");
		
		System.out.printf("오늘의 최고기온: %+6d℃\n", 13);
		System.out.printf("오늘의 최저기온: %+6d℃\n", -13);
		System.out.println("------------------------------------------------");
		
		// %.숫자f로 자릿수를 제한 할 때 반올림이 발생한다
		System.out.printf("%.0f\t%.1f\t%.2f\t%.3f\t%.4f\n", 1.56789, 1.56789, 1.56789, 1.56789, 1.56789);
		System.out.println("------------------------------------------------");
		
		
	}
	
}






