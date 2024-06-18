// 24.04.16

// Ctrl + +,- : 글자크기 조절 가능
// Ctrl + M : 현재창 최대화
// Ctrl + W : 현재창 닫기
// Ctrl + Shift + W : 현재 열린 모든 창 닫기
// Ctrl + Alt + 아래 방향키 or 위 방향키 : 윗줄 복사
// Alt + 아래 방향키 or 위 방향키 : 줄이동

// F11 : 디버그 모드 (break point에서 정지하면서 실행)
// Ctrl + F11 : 빌드 (컴파일 + 실행)
// F2 : 에러(빨간줄) 또는 경고(노란줄)가 있을 때 원인 및 해결책 띄우기 해당 글자위에 커서를 대야 함.

/*
 # 실수로 창을 닫았을 때
 window > show view 에서 다시 열 수 있다
*/


// ※ public class의 이름은 반드시 파일명과 같아야 한다
public class A00_Hello {
	
	/*
		# main() 함수
		- 자바에서 어떤 단어 뒤에 (소괄호)가 있으면 무조건 함수다.
		- main() 함수는 프로그램의 시작 지점이다
		- 사용자가 프로그램을 실행하면 가장 먼저 main()을 찾아 실행한다
		- main() 함수가 종료 되면 프로그램도 종료 된다
		- main() 함수의 범위는 {중괄호}로 지정한다
	*/
	
	public static void main(String[] args) {
		// 프로그램의 시작 지점
		
		/*
			# System.out.printlin() 함수
			- (소괄호)안에 전달한 데이터를 이 프로그램을 실행한 운영체제의
			  콘솔 화면에 출력해주는 함수
			  
			# 콘솔
			- 각 운영체제에 기본으로 탑재되어 있는 글자만 나오는 화면
			- Command Line Interface (CLI <=> GUI)
			
			# 세미콜론(;)
			- 한 명령어가 끝났음을 컴파일러에게 알리는 문자
		*/
		System.out.println("Hello, World!1");
		System.out.println("Hello, World!2");
		System.out.println("Hello, World!3");
		System.out.println("Hello, World!4");
		System.out.println("Hello, World!5");
		
		/*
			# System.out.println()의 ()안에 전달할 수 있는
			  자바 데이터의 종류 (자바의 리터럴 종류)
			
			1. "" 사이에 적는 것 : 문자열(String), 문자를 여러개 적을 때 사용
			2. '' 사이에 적는 것 : 문자(Character), 문자를 하나만 적을 수 있다 (글자하나)
			3. 그냥 정수를 적는 것 : 정수(Integer), 계산 가능
			4. 그냥 실수를 적는 것 : 실수(Float, Double), 계산 가능
			5. 그냥 true 또는 false를 적는 것 : 참/거짓형 데이터
			6. 정수 뒤에 L을 적는 것 : 아주 큰 정수 (Long)
			
		*/
		
		// 1. 문자열 예시
		System.out.println("안녕하세요~!");
		System.out.println("안녕하세요~! 반갑습니다~~~~~~~~~");
		System.out.println("3334352"); // ""사이에 적는 숫자는 문자열이다
		System.out.println("3333번 버스");
		
		// ★ 그냥 숫자끼리는 계산이 되지만 문자열 숫자는 이어붙이기를 한다
		System.out.println(123 + 10); // 133
		System.out.println(123 + "10"); //12310
		
		//2. 문자 예시
		System.out.println('d');
		System.out.println((int)'d'); // d는 100번째 문자 아스키 코드에 의해 정해진 문자의 코드
		System.out.println('배');
		System.out.println((int)'배'); // 배는 48176번째 문자
		System.out.println('귤');
		System.out.println('1');
		System.out.println('韓');
		System.out.println('漢');
		System.out.println('ㅁ');
		System.out.println((int)'1');
		System.out.println((int)'9');
		// System.out.println('사과'); invalid character
		
		System.out.println(10 + 9); // 19
		System.out.println(10 + '9'); // 67? 9 = 57번키
		
		//3. 정수 예시
		System.out.println(10);
		System.out.println(10 * 13);
		System.out.println(999 + 123);
		System.out.println(999 - 123);
		
		//4. 실수 예시
		System.out.println(3.14 * 9);
		System.out.println(123.123 + 345.345);
		
		//※ 정수와 실수는 계산이 자유롭지만 문자열은 더하기(+)로 이어붙이기만 가능하다
		System.out.println("오늘의 메뉴: " + "오징어 볶음");
		// System.out.println("오늘의 메뉴" * "오징어 볶음");
		
		// ※ 문자열과 다른 모든 타입의 +는 이어붙이기를 한다
		System.out.println("할인율: " + 50 + '%');
		System.out.println("총가격: " + 1500 + '원');
		
		System.out.println(10 + 3 * 8); // 34
		System.out.println("총 가격: " + 1000 * 3 + "원");
		
		System.out.println("총 가격: " + 1000 + 1500 + "원"); // 사칙연산 순서에 의해서 문자 이어붙이기가 된 것
		System.out.println("총 가격: " + (1000 + 1500) + "원");
		
		
		//5. 참/거짓
		System.out.println(true);
		System.out.println(false);
		System.out.println("안경을 썼나요?" + true);
		
		//6. 아주 큰 숫자
		System.out.println(1234567891); // 숫자를 그냥 적을때는 대략 22억까지 사용가능
		System.out.println(1234567891234L); // 더 큰 숫자를 쓰고 싶으면 뒤에 L을 붙이면 사용가능
		
	} // 프로그램의 끝
}