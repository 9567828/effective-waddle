package example;

import java.util.Scanner;

public class OvenTimer_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int cookTime = sc.nextInt();
		
		
		int finishMinute = minute + cookTime;
		if (finishMinute >= 60) {
			hour = (hour + finishMinute / 60) % 24;
			finishMinute %= 60;
		}
		System.out.printf("%d시 %d분\n" , hour, finishMinute);
	}
}
