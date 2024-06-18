package quiz;

// 23.04.18

public class A06_Calendar {

	public static void main(String[] args) {
		
		System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\t%-4s\t%-4s\t%-4s\n", "일", "월", "화", "수", "목", "금", "토");
		System.out.println();
		System.out.printf("\t\t\t\t\t\t%02d\n", 1);
		System.out.printf("%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 2, 3, 4, 5, 6, 7, 8);
		System.out.printf("%02d\t%2d\t%2d\t%2d\t%2d\t%2d\t%2d\n", 9, 10, 11, 12, 13, 14, 15);
		System.out.printf("%2d\t%2d\t%2d\t%2d\t%2d\t%2d\t%2d\n", 16, 17, 18, 19, 20, 21, 22);
		System.out.printf("%2d\t%2d\t%2d\t%2d\t%2d\t%2d\t%2d\n", 23, 24, 25, 26, 27, 28, 29);
		System.out.printf("%2d\t%2d\n", 30, 31);
	
		
		// 선생님 풀이
		System.out.println("-----------------------------------------------------");
		System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		System.out.printf("%5c%02d    %02d   %02d   %02d   %02d   %02d\n", ' ', 1, 2, 3, 4, 5, 6);
		System.out.printf("%02d   %02d    %02d   %2d   %2d   %2d   %2d\n", 7, 8, 9, 10, 11, 12, 13);
		System.out.printf("%02d   %02d    %02d   %2d   %2d   %2d   %2d\n", 14, 15, 16, 17, 18, 19, 20);
		System.out.printf("%02d   %02d    %02d   %2d   %2d   %2d   %2d\n", 21, 22, 23, 24, 25, 26, 27);
		System.out.printf("%02d   %02d    %02d\n", 28, 29, 30);
	}
	
}
