package quiz_B;
// 24. 04. 24

// 풀이
import java.util.Scanner;

public class B07_ForQuiz3T {

	/*
	 	사용자로부터 숫자를 입력 받으면
	 	0 부터 해당 숫자 사이에 존재하는 모든 3의 배수를 한 줄에 6개씩 출력해 보세요
	 	(단, 음수를 입력 받는 경우에도 올바르게 동작해야 함)
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력허세요: ");
		
		
		int num = sc.nextInt();
		
		// for문에 i <= Math.abs(num) 식으로 넣으면 효율적이지 않다.
		int absVale = Math.abs(num);
		
		for (int i = 0, cnt = 0; i <= absVale; ++i) {
			if (i % 3 == 0) {
				if (num < 0) {
					System.out.printf("%d\t", -i);
				} else {
					System.out.printf("%d\t", i);
				}
				if (++cnt % 6 == 0) {
//					System.out.println();
				}
				
				
			}
		}

		
		/*
		if (num >= 0) {
			for (int i = 0, cnt = 0; i <= num; ++i) {
				if(i % 3 == 0) {
					// '\t' 는 아스키 코드 정수와 문자타입을 더하면 문자코드 값과 정수값을 더한다
					// 문자타입도 이어붙이기를 하기 위해서는 문자열과의 +가 필요하다
					System.out.print("" + i + '\t');
					
					if(++cnt % 6 == 0) {
						System.out.println();
					}
				}
			}
		} else { 
			// num가 음수 일 때 도착하는 곳
			for (int i = 0, cnt = 0; i >= num; --i) {
				if(i % 3 == 0) {
					// '\t' 는 아스키 코드 정수와 문자타입을 더하면 문자코드 값과 정수값을 더한다
					// 문자타입도 이어붙이기를 하기 위해서는 문자열과의 +가 필요하다
					System.out.print("" + i + '\t');
					
					if(++cnt % 6 == 0) {
						System.out.println();
					}
				}
			}
		}
		
		*/
		
		
		
		
	}
	
}
