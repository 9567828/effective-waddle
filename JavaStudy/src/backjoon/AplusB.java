package backjoon;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력>> ");
//		int T = sc.nextInt();
//		
//		for (int i = 0; i < T; ++i) {
//			System.out.print("입력>> ");
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a+b);
//		}
		
		int n = sc.nextInt();
		
		int total = 0;
		for (int i = 1; i <= n; ++i) {
			total += i;
		}
		System.out.println(total);
		
		
	}
	
}
