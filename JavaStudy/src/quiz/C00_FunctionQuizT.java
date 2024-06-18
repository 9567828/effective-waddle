package quiz;

import java.util.Arrays;

// 24.05.02

public class C00_FunctionQuizT {

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
	public static boolean isAlphabet(char ch) {
		return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');
		// if else를 굳이 넣을 필요가 없다
	}
	
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean isMul3(int num) {
		return num % 3 == 0;
	}
	
	// 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수 입니다"를 반환하는 함수
	public static String checkEvenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	public static int[] getYaksuList(int num) {
		int[] yaksuArr = new int[num];
		
		// num: 전달 받은 숫자
		// 여기는 div (div : 전달 받은 숫자를 나눠볼 숫자)
		int index = 0;
		for(int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				// ++이 뒤에 들어갔으니까 대입 후 index가 증가한다
				yaksuArr[index++] = i;
			}
		}
		return Arrays.copyOf(yaksuArr, index);
	}
	
	// 5. 전달한 정수가 소수라면 ture를 반환하고 아니면 false를 반환하는 함수
	public static boolean isPrime(int num) {
		// 다른 함수를 사용할 수 있다.
		return getYaksuList(num).length == 2;
	}
	
	
	// 6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	public static void printMessage(String message, int times) {
		for (int i = 0; i < times; ++i) {
			System.out.println(i + message);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("1번: " + isAlphabet('ㅁ'));
		System.out.println("--------------------------");
		System.out.println("2번: " + isMul3(10));
		System.out.println("--------------------------");
		System.out.println("3번: " + checkEvenOdd(10));
		System.out.println("--------------------------");
		System.out.println("4번: " + Arrays.toString(getYaksuList(20)));
		System.out.println("--------------------------");
		System.out.println("5번: " + isPrime(10));
		System.out.println("--------------------------");
		printMessage("안녕하슈", 12);

		
		
		
	}
	
}
