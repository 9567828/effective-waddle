package quiz_B;

//24. 04. 22

import java.util.Scanner;

public class B04_AppleQuiz {

	/*
		사과를 10개씩 담을 수 있는 바구니가 있다.
		사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
		바구니의 개수를 알려주는 프로그램을 만들어라
	*/
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 갯수를 입력하세요: ");
		int qty = sc.nextInt();
		
		int basket = qty / 10;
		int basket1 = qty % 10;
		
		System.out.println(basket);
		System.out.println(basket1);

		int total1;
		int bsTotal;
		
		
		
		if (basket1 == 0 && basket1 < 10 || qty > 10) {
			total1 = 0;
			bsTotal = basket + total1;
			System.out.printf("바구니개수는 %d개", bsTotal);
		
		}else if (basket1 > 10 && basket1 == 0 || qty > 10) {
			total1 = 1;
			bsTotal = basket + total1;
			System.out.printf("바구니개수는 %d개", bsTotal);
		
		} else {
			System.out.println("종로");
		}
		
		
	}
	
	
}
