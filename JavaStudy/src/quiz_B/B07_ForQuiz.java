package quiz_B;
//24.04.23

public class B07_ForQuiz {

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
		for(int i = 1000; i < 2000; ++i) {
			if(i % 13 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("------------------------");
		
		// 2.
		// 1-10 모든 숫자 더하기 > (1+10)*10/2
		int a = 0;
		for(int i = 50; i < 100; ++i) {
			System.out.println(i);
		}
		System.out.println("------------------------");
		
		//3.
		for(int i = 1; i < 1000; ++i) {
			if(i % 10 == 0) {
				System.out.print(i);
			}
		}
		System.out.println();
		System.out.println("------------------------");
		
		// 추가 문제
		// 4.
		int total = 1;
		for (int i = 1; i <= 19; ++i) {
			total *= i;
			System.out.println(i);
			//System.out.println(total);
		}
		System.out.println(total);
		
		System.out.println("------------------------");
		
		// 5.
		for (int i = 8999, cont = 0; i >= 4999; --i) {
			if(i % 287 == 0) {
				System.out.printf("");
				++cont;
				
				if(cont == 5) {
					System.out.println(i);
				}
			}
		}
		
		
		
		
		
	}
	
}
