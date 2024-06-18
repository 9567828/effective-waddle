package quiz_B;
//24.04.23
//강사님 풀이

public class B07_ForQuizT {

	/*
	 	1. 1000 ~ 2000 사이의 13의 배수를 모두 출력해 보세요
	 	2. 50부터 100 사이의 모든 숫자의 총합을 구해서 출력해 보세요
	 	3. 1부터 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력해보세요
	 		 	-- 추가 문제
	 	4. 1부터 19까지의 모든 숫자의 곱을 구해서 출력해보세요
	 	5. 8999에서 4999 사이에 있는 5번째 287의 배수를 출력해 보세요
	*/
	
	public static void main(String[] agrs) {

		// 1.
		for (int i = 1000; i <= 2000; ++i) {
			if(i % 13 == 0) {
				System.out.println(i);				
			}
		}
		
//		다른 방법
//		for (int i = 13; i <= 2000; i += 13) {
//			if(i >= 1000) {
//				System.out.printf("%d\n", i);
//			}
//		}
		System.out.println("-------------------------");
		
		// 2. - 총합을 누적시키기 위한 변수를 하나 생성하고 계속 누적시킨다
		int total = 0;
		for (int i = 50; i <= 100; ++i) {
			total += i;
		}
		System.out.println("총합은 " + total + "입니다.");
		
		System.out.println("-------------------------");

		// 3.
		for (int i = 1, printCnt = 0; i <= 1000; ++i) {
			if(i % 10 == 0) {
				System.out.printf("%6d", i);
				
				++printCnt; // 10의 배수를 출력한 횟수를 센다
				if (printCnt % 8 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		
			// 다른 방법
//			for(int i = 1; i <= 1000; ++i) {
//			if(i % 10 == 0) {
//				System.out.printf("%6d", i);				
//			}
//			if(i % 80 == 0) {
//				System.out.println();
//			}
//		}
		
		System.out.println("-------------------------");

		// 4.
		// int로 숫자가 너무 길면 터지기 때문에 long 타입을 써야 한다
		long total2 = 1;
		for(int i = 1; i <= 19; ++i) {
			System.out.printf("%d x %d = %d\n", total2, i, total2 *= i);
		}
		System.out.println("-------------------------");
		
		// 5.
		for (int i = 8999, cont = 0; i >= 4999; --i) {
			if(i % 287 == 0) {
				++cont;
				
				if (cont == 5) {
					System.out.printf("[%d번째 287의 배수: %d]\n", cont, i);
				} else {
					System.out.printf("%d번째 287의 배수: %d\n", cont, i);					
				}
			}
			
		}
		
		
		
		
	}
	
}
