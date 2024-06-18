package backjoon;

import java.util.Scanner;

public class gugudan {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력>> ");
		int dan = sc.nextInt();
		
		for (int i = 1; i <= 9; ++i) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
		System.out.println();
		
	}

	
}