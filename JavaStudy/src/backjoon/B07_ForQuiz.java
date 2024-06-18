package backjoon;

public class B07_ForQuiz {
	
	 /*
	 	# for문을 사용해 숫자를 다음과 같이 출력해 보세요
	 	
	 	1. 0 3 6 9 12 ... 93 96 99
	 	
	 	2. -35 -28 -21 ... 0 7 14 ... 35
	 	
	 	3. 100 200 300 ... 800 900 1000
	 	
	 	4. 100 99 98 ... 5 4 3 2 1 0
	 	
	 	5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ... (30번)
	 	
	 	6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ... (30번)
	 	
	 	7. 7 77 777 7777 7777 .... 7777777777
	 */

	public static void main(String[] args) {
		
		// 1.
		for (int i = 0; i <= 100; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2.
		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 3.
		for (int i = 100; i <= 1000; i += 100) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 4.
		for (int i = 100; i >= 0; --i) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 5.
		for (int i = 0; i < 30; ++i) {
			System.out.print(i % 10 + " "); // 통으로 반복을 30번 하는게 아니라 그냥 반복을 30번 돌린다
		}
		System.out.println();
		
		// 6.
		for (int i = 0; i < 30; ++i) {
			System.out.print((10 - i % 10) + " ");
		}
		System.out.println();

		// 7.
		long num = 7;
		for (int i = 0; i < 10; ++i) {
			System.out.println(num);
			num = num * 10 + 7;
		}
		
		
	}
	
}
