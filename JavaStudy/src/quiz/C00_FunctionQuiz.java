package quiz;
// 24.05.02

public class C00_FunctionQuiz {

	/*
	 	# 다음 함수를 정의하고 올바르게 동작하는 테스트 해보세요
	 	
	 	1. 전달한 문자가 알파벳이면 ture를 반환, 아니면 false를 반환하는 함수
	 	2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수 입니다"를 반환하는 함수
	 	4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	 	5. 전달한 정수가 소수라면 ture를 반환하고 아니면 false를 반환하는 함수
	 	6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	*/
	
	// 1. 전달한 문자가 알파벳이면 ture를 반환, 아니면 false를 반환하는 함수
	public static boolean alphabet(char ch) {
		
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			return true;
		}
		return false;
	}
	
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean multiple(int num) {
		if(num % 3 == 0) {
			return true;
		}
		return false;
	}
	
	// 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수 입니다"를 반환하는 함수
	public static String even(int num) {
		if(num % 2 == 0) {
			return "짝수입니다";
		}
		return "홀수입니다";
	}
	
	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	public static int aliquot(int[] num) {
		
		
		for(int i = 2; i <= num.length; ++i) {
			boolean isPrime = true;
			System.out.print(i + " : ");
			
			double sqrt = Math.sqrt(i);
			// 1과 자기 자신을 제외한 모든 숫자로 나눠본다
			// (2부터 체크하는 숫자의 제곱근까지 나눠본다)
			
			for (int j = 2; j <= sqrt; ++j) {
				// 나누어 떨어지는게 하나라도 존재한다면 더이상 소수가 아니므로
				// 검사를 그만해도 된다
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println("소수");
			} else {
				System.out.println("X");
			}
		}
		return -1;
	}
	
 	// 5. 전달한 정수가 소수라면 ture를 반환하고 아니면 false를 반환하는 함수
	
	public static boolean sosu(int num) {
		
//		for(int i = 2; i <= targetNum; ++i) {
//		int cnt = 0;
//		System.out.print(i + "\t: [");
//		for(int j = 1; j <= i; ++j) {
//			// 각 숫자의 약수를 찾아서 개수를 센다
//			if (i % j == 0) {
//				if(j != i) {
//					System.out.print(j + ", ");						
//				} else {
//					System.out.print(j + "]");
//				}
//				++cnt; // 약수가 나올 때만 증가 시키기 위해서 여기에 둔것
//			}
//		}
//		if(cnt == 2) {
//			System.out.print(" *소수");
//		}
//		System.out.println();
//	}
		boolean isPrime = true;
		for(int i = 2; i <= num; ++i) {
			double sqrt = Math.sqrt(i);
			// 1과 자기 자신을 제외한 모든 숫자로 나눠본다
			// (2부터 체크하는 숫자의 제곱근까지 나눠본다)
			
			for (int j = 2; j <= sqrt; ++j) {
				// 나누어 떨어지는게 하나라도 존재한다면 더이상 소수가 아니므로
				// 검사를 그만해도 된다
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	
 	// 6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	public static void message(String str, int num) {
		
	}
	
	public static void main(String[] args) {
		System.out.print("1번문제: ");
		boolean ch = alphabet('ㅁ');
		System.out.println(ch);
		
		System.out.println("-------------------------");
		
		System.out.print("2번문제: ");
		boolean tripled = multiple(27);
		System.out.println(tripled);

		System.out.println("-------------------------");
		
		System.out.print("3번문제: ");
		String evenOr = even(5);
		System.out.println(evenOr);
		
		System.out.println("-------------------------");
		
		System.out.print("5번문제: ");
		boolean sosu11 = sosu(7);
		System.out.println(sosu11);

		
	}
	
}
