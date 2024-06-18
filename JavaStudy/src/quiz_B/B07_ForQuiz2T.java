package quiz_B;
// 24.04.23

public class B07_ForQuiz2T {

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
		
		// for문 내부에서 선언한 변수는 for문의 {} 끝나면 사라진다 -> 변수명을 계속 바꿔가며 쓸 필요 없다는 뜻
		
		// 1.
		for (int i = 0; i <=99; i += 3) { // 3배수 3씩 증가
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
		
		// 5. -> 전체를 30번 돌리는게 아니라 증감의 횟수가 30번이면 된다.
		for (int i = 0; i < 30; ++i) {
			System.out.print(i % 10 + " ");
		}
		System.out.println();
		
		// 6.
		for (int i = 0; i < 30; ++i) {
			System.out.print((10 - i % 10) + " "); // 거꾸로 돌리는 방법
		}
		System.out.println();
		
		// 7. -> 10번 반복하는 것이 핵심이 문제
		long num = 7;
		for (int i = 0; i < 10; ++i) {
			System.out.print(num + " ");
			num = num * 10 + 7;
		}
		System.out.println();
		
		String numStr = "";
		for (int i = 0; i < 10; ++i) {
			numStr += 7;
			System.out.print(numStr + " ");
		}
		
		
	}
	
}
