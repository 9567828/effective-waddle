// 24. 04. 26

import java.util.Random;

public class B12_Random {
	
	/*
	 	# 무작위 숫자 생성하기
	 	
	 	1. java.util.Random 클래스 사용하기
	 	2. Math.random() 함수 사용하기
	*/
	
	public static void main(String[] args) {
		
		// 새로운 랜덤 시드 생성 (생성 시점에서 모든 숫자가 결정된다)
		// 랜덤 시드를 생성하면서 원하는 시드 번호를 전달 수 도 있다
		// 전달하지 않는 경우 현재 시간이 시드 번호가 된다
		Random ran1 = new Random(1000);
		Random ran2 = new Random(1001);
		// 현재 시간에 따라 랜덤값(시드)이 생셩 된다
		Random ran3 = new Random();
		
		// System.currenTimeMillis(): 현재 시간을 밀리초로 알려준다
		System.out.println("현재 시간: " + System.currentTimeMillis());
		
		// 만들어진 랜덤 시드로부터 랜덤 숫자 10개 꺼내기
		for(int i = 0; i <= 10; ++i) {
			System.out.println(ran1.nextInt());
			System.out.println(ran2.nextInt());
			System.out.println(ran3.nextBoolean());
		}
		
		
		// nextInt()의 범위를 지정해 사용할 수 있다
		// nextInt(bound): 0 ~ n-1의 랜덤 정수를 생성
		for (int i = 0; i < 10; ++i) {
			System.out.println(ran3.nextInt(100));
		}
		
		// 원하는 범위의 랜덤 숫자를 생성하려면? 빼기를 활용한다
		// 1. bound에 원하는 숫자의 개수를 입력한다 > 0부터 시작하니까 잘 계산하슈
		// 2. 원하는 숫자 중 가장 작은 수를 더하거나 빼서 원하는 범위를 만든다.
		for(int i = 0; i < 10; ++i) {
			System.out.println(ran3.nextInt(10) -5); // -5 ~ 4			
			System.out.println(ran3.nextInt(10) + 5); // 5 ~ 14			
		}
		
		System.out.println("----------------------------------------------------");
		
		
		// 연습 > 30 ~ 60 사이의 랜덤 숫자 30개 생성하라
		for(int i = 0; i < 30; ++i) {
			System.out.println(ran3.nextInt(31) + 30);
			
		}

		System.out.println("----------------------------------------------------");


//-----------------------------------------------------------------------------------------------
		
		// # Math.random() : 0 <= x < 1의 실수를 랜덤으로 생성한다
		for(int i = 0; i < 10; ++i) {
			System.out.println(Math.random());
		}

		System.out.println("----------------------------------------------------");
		
		/*
		 	# Math.random()으로 원하는 범위의 정수 만들기
		 	
		 	1. 원하는 숫자의 개수를 곱한다 (bound)
		 	2. 소수점 아래를 잘라 정수로 만든다
		 	3. 더하거나 빼서 원하는 범위로 만든다
		*/
		
		// ex) 20 ~ 39의 랜덤 정수를 만들어 보자
		for (int i = 0; i < 10; ++i) {
			System.out.println((int)(Math.random() * 20) + 20);
		}
		
		
	}

}
