package quiz_B;

//24. 04. 22

import java.util.Scanner;

public class B04_AppleQuiz2 {

	/*
		사과를 10개씩 담을 수 있는 바구니가 있다.
		사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
		바구니의 개수를 알려주는 프로그램을 만들어라
	*/
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);

		int size = 10;

		System.out.print("사과의 갯수를 입력하세요: ");
		int appleQty = sc.nextInt();
		int bucketQty;
		
		if(appleQty % 10 != 0) {
			bucketQty = appleQty / size + 1;
			System.out.println("바구니의 개수는 " + bucketQty + "개 입니다");
		}


	}	
	
}
