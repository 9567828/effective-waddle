package example;

import java.util.Scanner;

public class OvenTimer {

	/* (백준 _ 오븐 시계)
	첫째 줄에는 현재 시각이 나온다. 
	현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 
	정수로 빈칸을 사이에 두고 순서대로 주어진다. 
	두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
	 */
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute= sc.nextInt();
		int minLong = sc.nextInt();

		int finish = minute + minLong;
		hour = (hour + finish / 60) % 24;
		finish = finish % 60;
		
		System.out.printf("%d %d", hour, finish);

		
		
			
		}
	}
