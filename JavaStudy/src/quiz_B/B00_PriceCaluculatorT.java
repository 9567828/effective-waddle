package quiz_B;

//선생님 풀이

import java.util.Scanner;

public class B00_PriceCaluculatorT {

	/*
	 	4가지 음료수 개수를 입력하면 총 가격을 출력해보세요
	 	(각 음료수의 가격은 2300, 2800, 3300, 3500 입니다)
	 	
	 	ex> 0 5 0 1
	 		= 15000
	*/
	
	public static void main(String[] args) {
		
		int price1 = 2300;
		int price2 = 2800;
		int price3 = 3300;
		int price4 = 3500;

		Scanner sc = new Scanner(System.in);
		
		// 한 줄로 끝낼 수 있는데 변수를 써야하는 이유?
		// - 입력 받은 값을 저장하기 위해서 변수를 사용 하는 것
		// - 추후 수정에 용이하다
		// System.out.pirntln(
		//				  sc.nextInt() * 2300
		//				+ sc.nextInt() * 2800..);
		
		System.out.printf("1번 음료: %d원\n", price1);
		System.out.printf("2번 음료: %d원\n", price2);
		System.out.printf("3번 음료: %d원\n", price3);
		System.out.printf("4번 음료: %d원\n", price4);
		System.out.print("> ");
		
		int qty1 = sc.nextInt();
		int qty2 = sc.nextInt();
		int qty3 = sc.nextInt();
		int qty4 = sc.nextInt();
		
		
		System.out.printf("1번 음료: %d개\n", qty1);
		System.out.printf("2번 음료: %d개\n", qty2);
		System.out.printf("3번 음료: %d개\n", qty3);
		System.out.printf("4번 음료: %d개\n", qty4);
		
		System.out.println(qty1*price1 + qty2*price2 + qty3*price3 + qty4*price4);
		

	}
	
}
