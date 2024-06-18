// 24.04.19

public class B02_Operator1 {

	/*
		# 연산자 (Operator)
		
		- 계산할 때 값과 함께 사용하는 것
		- +, -, *, /, >, <, >=, ....
		
		# 산술 연산자
		
		  + : 더하기
		  - : 빼기
		  * : 곱하기
		  / : 나누기 (※ 정수로 나눌 때와 실수로 나눌 때의 결과가 다르다)
		  % : 나머지
		
	*/
	
	public static void main(String[] args) {
		
		int a = 15, b = 7;
		double c = 7.0;
		
		System.out.printf("a + b: %d\n", a + b);
		System.out.printf("a - b: %d\n", a - b);
		System.out.printf("a * b: %d\n", a * b);
		
		System.out.println();
		
		
		// ※ 문자열과 이어 붙이기 하는 것이기 때문에 연산결과 조심
		// 정수와 정수의 연산 => 정수
		// 정수와 실수의 연산 => 실수
		
		// double result1 = a + c;
		// int result1 = (int)(a+c); 실수를 int로 보관하고 싶으면 강제로
		
		System.out.println("a + b: " + (a + b));
		System.out.println("a + c: " + (a + c));
		System.out.println("a - b: " + (a - b));
		System.out.println("a - c: " + (a - c));
		System.out.println("a * b: " + a * b);
		System.out.println("a * c: " + a * c);
		System.out.println("(정수끼리의 나누기) a / b: " + a / b);
		System.out.println("(정수와 실수 나누기) a / c: " + a / c);
		System.out.println("a % B: " + a % b); // 나누기 하고 남은 나머지

		System.out.println("==========================================");
		
		// Math.abs() : 절대값을 구하는 함수
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		// Math.round(x) : x를 소수 첫째 자리에서 반올림해주는 함수
		System.out.println("반올림(round): " + Math.round(1.55));
		
		// Math.ceil(x) : x를 소수 첫째 자리에서 올림해주는 함수
		System.out.println("올림(ceil): " + Math.ceil(1.55));
		
		// Math.floor(x) : x를 소수 첫째 자리에서 내림해 주는 함수
		System.out.println("내림(floor): " + Math.floor(1.55));
		System.out.println("=========================================");
		
		
		// 연습: 10.34567을 소수 3번째 자리에서 내림한 결과를 출력해 보세요
		System.out.println(Math.floor(10.34567 * 100) / 100.0);
		
		// 선생님 풀이
		double avg = 10.34567;
		// (1) 10.34567을 1034.567로 만든다 
		//     (반올림, 올림, 내림 중 하고 싶은 숫자를 소수 첫번째 자리로 만든다)
		System.out.println(avg * 100); // 1034.567
		
		// (2) 내림을 한다
		System.out.println(Math.floor(avg * 100)); // 1034.0
		
		// (3) 아까 100을 곱했으니까 다시 100.0으로 나눠서 원래대로 돌려준다.
		System.out.println(Math.floor(avg * 100) / 100.0);
		
		System.out.println("--------------------------------------");
		
		// Math.pow(x, y) : x의 y제곱을 구하는 함수
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.pow(2, 9));
		
		// Math.sqrt(x) : x의 제곱근을 구하는 함수
		System.out.println(Math.sqrt(49));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(48));
		
		// Math.max(x, y) : 두 값 중 더 큰 값을 구하는 함수
		System.out.println(Math.max(-3, 9));
		
		// Math.mix(x, y) : 두 값 중 더 작은 값을 구하는 함수
		System.out.println(Math.min(-3, 9));
		
		// 사인, 코사인 탄젠트 등은 3D 캐릭터 만들 떄 필요하다. 웹은 필요x
	}
	
}




