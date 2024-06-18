// 24. 05. 27

import java.util.InputMismatchException;

public class E02_Throw {

	/*
 		# throw
 		
 		- 내가 원하는 예외를 발생 시키는 것
 		
 		# throws
 		
 		- 이 메서드에서 발생할 수 있는 예외들을 미리 고지하는 용도로 사용하는 문법
 		- '이 메서드에서는 다음의 예외들이 발생할 수 있으므로 주의하세요' 라는 뜻
 		
 		# 상속을 통해 원하는 예외 생성하기
 		
 		- Exception 또는 RuntimeException 클래스를 상속받으면 해당 클래스는 예외가 된다
 		- RuntimeExcecption을 상속 받는 경우 
 		  굳이 고지하지 않아도 throws로 알려주지 않아도 되는 사소한 예외가 된다
 		- Exception을 상속받는 경우 throws로 반드시 예외처리(try/catch)가 되어야 컴파일이 가능한 중요한 예외가 된다
 		  이 경우 throws로 반드시 알려줘야 하는 예외가 된다
	*/

	public static void method1(int a) throws InputMismatchException, NotEnoughMoney {
		
		if (a % 2 == 1) {
			System.out.println("a는 홀수");
			// 내가 원하는 예외 인스턴스를 만들어 원하는 시점에 발생 시킬 수 있다
			throw new InputMismatchException("홀수는 놉");
		} else {
			System.out.println("a는 짝수");
			throw new NotEnoughMoney();
		}
	}

	public static void method2() throws TooMuchSpeedException {
		int ran = (int)(Math.random() * 2); 
		
		if (ran == 0) {
			// Exception을 상속받은 예외는 반드시 throws로 추가되어야 한다
			throw new TooMuchSpeedException();
		} else if (ran == 1) {
			System.out.println("과속카메라에 걸리지 않았다");
		}
	}
	
	public static void main(String[] args) {
		try {
			method1(11);
			
		} catch (InputMismatchException e) {
			System.out.println("예외1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외2");			
		} catch (NotEnoughMoney e) {
			System.out.println("예외3");
		}
		
		try {
			method2();
		} catch (TooMuchSpeedException e) {
			System.out.println("너무 빨라서 걸렸네~~~~");
		}
	}	
}


// RuntimeException또는 Exception을 상속받아 원하는 예외 클래스를 만들 수 있다
class NotEnoughMoney extends RuntimeException {
	public NotEnoughMoney() {
		super("돈이 부족합니다");		
	}
	
	public NotEnoughMoney (int money) {
		super(String.format("돈이 %d원 부족합니다", money));
	}
}


class TooMuchSpeedException extends Exception {
	public TooMuchSpeedException() {
		super("속도가 너무 빨라");
	}
	
}




