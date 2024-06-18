package quiz_B;
// 24/04/25

public class B11_WhileQuiz {

	/*
		while문을 사용하여
		
		1. 1000 ~ 2000 사이의 13의 배수를 모두 출력해보세요
		
		2. 50부터 100사의 모든 숫자의 총합을 구해서 출력해보세요
		
		3. 1부터 1000 사이의 모든 10의 배수를 한줄에 8개씩 출력해보세요
		
		4. 1부터 19까지 모든 숫자의 곱을 구해서 출력해보세요
		
		5. 8999 ~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
	*/
	
	public static void main(String[] args) {
		
		// 1.
		int i = 1000;
		while(i <= 2000) {
			++i;
			if(i % 13 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("--------------------");
		
		// 2.
		i = 50;
		int total = 0;
		while(i <= 100) {
			total += i;
			System.out.println("토탈 " + total);
			i++;
			System.out.println(i);
		}
		System.out.println("총합은 " + total + "입니다");

		System.out.println("--------------------");
		
		// 3.
		i = 0;
		int cnt = 0;
		while(i < 1000) {
			System.out.printf("%-8d", i += 10);
			if (++cnt % 8 == 0) {
				System.out.println();
			}
			
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		// 4.
		i = 0;
		long total2 = 1;
		while(i < 19) {
			++i;
//			System.out.println(i);
//			System.out.println(total2);
			System.out.printf("%d x %d = %d\n", total2, i, total2 *= i);
		}

		System.out.println("--------------------");
		
		// 5.
		i = 8999;
		cnt = 0;
		while(i >= 4999) {
			i--;
			if(i % 287 == 0) {
//				System.out.println(i);					
				if(++cnt == 5) {
					System.out.println("287배수의 5번째: " + i);				
				}
				
			}			
		}
	
	
	
	
	
	}
	
}
