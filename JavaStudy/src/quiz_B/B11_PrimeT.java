package quiz_B;

public class B11_PrimeT {

	/*
	 	사용자가 정수를 입력하면 1부터 입력한 숫자 사이에
	 	존재하는 모든 소수를 출력해보세요
	 	
	 	※소수(prime): 나누어 떨어지는 약수가 1과 자기 자신밖에 없는 수
	 		(2, 3, 5, 7, 11, 13, ..)
	 		
	 		2의 배수 제외
	 		3

	*/
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		int targetNum = 50;
		
		
		// 2부터 사용자가 입력한 숫자(targetNum)까지 있는 모든 숫자의 약수 개수를 체크를 하겠다
		// 해당 숫자의 약수 개수가 2개라면 그 숫자는 소수
		
//		방법1.
//		for(int i = 2; i <= targetNum; ++i) {
//			int cnt = 0;
//			System.out.print(i + "\t: [");
//			for(int j = 1; j <= i; ++j) {
//				// 각 숫자의 약수를 찾아서 개수를 센다
//				if (i % j == 0) {
//					if(j != i) {
//						System.out.print(j + ", ");						
//					} else {
//						System.out.print(j + "]");
//					}
//					++cnt; // 약수가 나올 때만 증가 시키기 위해서 여기에 둔것
//				}
//			}
//			if(cnt == 2) {
//				System.out.print(" *소수");
//			}
//			System.out.println();
//		}

// --------------------------------------------------------------------------------

		// 해당 숫자를 1과 자기 자신을 제외한 숫자로 나누어 봤을 때
		// 나누어 떨어지는 숫자가 존재한다면 소수가 아니다 (방법1은 약수 2개를 찾은 것)
//		for (int i = 2; i < targetNum; ++i) {
//			System.out.println(i);
//			int cnt = 0;
//			for(int j = 1; j <= i; ++j) {
//				if(i % j == 0) {
//					System.out.println(j);
//				}
//			}
//			++cnt;
//			if(cnt >= 1) {
//				System.out.println(cnt);
//			}
//		}
		
		
		
//		boolean sosu = true;
//		for(int i = 2; i < targetNum; ++i) {
//			System.out.print(i + " : ");
//			int cnt = 0;
//			if(i % targetNum == 0) {
//				++cnt;
//				sosu = false;
//				break;
//				System.out.println("cnt" + cnt);
//				System.out.println("i" + i);
//				if (cnt < 2) {
//					System.out.println("소수가 아니다");
//				}
//			}
//			if(sosu) {
//				System.out.println(" 소수다");
//			} else {
//				System.out.println(" 아니다");			
//			}
//		}
		
// --------------------------------------------------------------------------------

		// 방법2.
		
//		targetNum = 230;
//		
//		for(int i = 2; i <= targetNum; ++i) {
//			boolean isPrime = true;
//			System.out.print(i + " : ");
//			
//			double sqrt = Math.sqrt(i);
//			// 1과 자기 자신을 제외한 모든 숫자로 나눠본다
//			// (2부터 체크하는 숫자의 제곱근까지 나눠본다)
//			
//			for (int j = 2; j <= sqrt; ++j) {
//				// 나누어 떨어지는게 하나라도 존재한다면 더이상 소수가 아니므로
//				// 검사를 그만해도 된다
//				if(i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			
//			if(isPrime) {
//				System.out.println("소수");
//			} else {
//				System.out.println("X");
//			}
//		}
		
		
		
}
	
}
