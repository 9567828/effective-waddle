package quiz_B;
// 24/04/25

public class B11_WhileQuizT {

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
		while (i <= 2000) {
			if(i % 13 == 0) {
				System.out.println(i);		
			}
			++i; // 나중에 증감을 시키면 계산이 쉽다.
		}
		
		System.out.println("----------------");
		
		// 2.
		i = 50;
		int sum = 0;
		while(i <= 100) {
			sum += i;
			++i;
		}
		System.out.println("총합: " + sum);
		
		System.out.println("----------------");

		// 3.
		i = 1;
		int cnt = 0;
		while(i <= 1000) {
			if(i % 10 == 0) {
				System.out.print(i + "\t");
				
				if (++cnt % 8 == 0) {
					System.out.println();
				}
			}
			++i;
		}
		System.out.println();
		
		System.out.println("----------------");

		// 4.
		i = 1;
		long sum2 = 1;
		
		while (i <= 19) {
			sum2 *= i;
			++i;
		}
		System.out.println(sum2);
	
		System.out.println("----------------");
		
		// 5.
		i = 8999;
		cnt = 0;
		while(i >= 4999) {
			// if (i % 287 == 0 && ++cnt == 5) 로 줄일 수 있다 (287의 배수가 나올 때만 확인한다)
			if (i % 287 == 0) {
				if(++cnt == 5) {
					System.out.println("5번째 287의 배수 " + i);
				}
			}
			--i;
		}
	
	
	
	}
	
}
