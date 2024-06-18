package backjoon;

import java.util.Scanner;

public class Array_remainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> ");
		
		int[] arr = new int[10];
		int[] r = new int[arr.length];
		int cnt = 0;
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; ++i) {
			r[i] = arr[i] % 42;
			if (r[i] != r[i]) {
				++cnt;
				System.out.println("i" + r[i]);
				System.out.println(cnt);
			}
		}
//		System.out.println(cnt);
		
		
	}
	
}