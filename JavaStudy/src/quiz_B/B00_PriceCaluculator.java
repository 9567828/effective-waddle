package quiz_B;

import java.util.Scanner;

public class B00_PriceCaluculator {

	/*
	 	4가지 음료수 개수를 입력하면 총 가격을 출력해보세요
	 	(각 음료수의 가격은 2300, 2800, 3300, 3500 입니다)
	 	
	 	ex> 0 5 0 1
	 		= 15000
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("음료수 개수를 입력해주세요 > ");
		int qty1 = sc.nextInt();
		int qty2 = sc.nextInt();
		int qty3 = sc.nextInt();
		int qty4 = sc.nextInt();
		
		int price1 = 2300;
		int price2 = 2800;
		int price3 = 3300;
		int price4 = 3500;
		
		int amount1 = qty1*price1;
		int amount2 = qty2*price2;
		int amount3 = qty3*price3;
		int amount4 = qty4*price4;
		
		int total = amount1+amount2+amount3+amount4;
		
		System.out.printf("음료수 %d개, %d개, %d개, %d개 총 가격은 %d원 입니다.\n", qty1, qty2, qty3, qty4, total);
		
	}
	
}
