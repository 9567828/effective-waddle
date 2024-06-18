package quiz_B;
// 24.04.23

public class B07_ForQuiz2 {

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
		for (int i = 0; i <= 100; ++i) {
			if(i % 3 == 0) {
					System.out.printf("%-3d", i);
			}
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		// 2.
		for (int i = -35; i <= 35; ++i) {
			if(i % 7 == 0)
			System.out.printf("%-4d", i);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		// 3.
		for (int i = 100; i <= 1000; ++i) {
			if (i % 100 == 0) {
				System.out.printf("%-5d", i);
			}
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		// 4.
		for(int i = 100; i >= 0; --i) {
				System.out.printf("%3d", i);			
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		// 5. 30번
		for(int i = 1, cnt = 0; i <= 30; ++i) {
			++cnt;
			for(cnt = 0; cnt <= 9; ++cnt) {
				System.out.printf("%d, ", cnt);	
			}
		}
		
		System.out.println();
		System.out.println("--------------------------");

		// 6. 30번
		for(int i = 30, cnt = 0; i >= 1; --i) {
			++cnt;
			for(cnt = 10; cnt >= 1; --cnt) {
				System.out.printf("%d, ", cnt);				
			}
		}
		
		System.out.println();
		System.out.println("--------------------------");

		// 7.
		// i = i * 10 + 7
		long s = 1000000000000L;
		for(long i = 7; i <= s; i *= 10, i += 7) {
			System.out.printf("%d, ", i);
		}
	}
	
}
