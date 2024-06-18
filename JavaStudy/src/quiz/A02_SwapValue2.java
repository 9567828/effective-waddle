package quiz;

import java.util.Random;

public class A02_SwapValue2 {

	public static void main(String[] args) {
		
		// "랜덤 번호 생성 기계"를 하나 만든다
		Random ran = new Random(); // 
		
		// "랜덤 번호 생성 기계"로 부터 랜덤 번호를 하나씩 받아온다
		int a = ran.nextInt(30); 
		int b = ran.nextInt(30);
		
		System.out.println("a에 원래 보관된 값: " + a);
		System.out.println("b에 원래 보관된 값: " + b);
		
		// 문제: 코드를 추가해 두 변수의 값을 서로 교환하여 출력해 보세요 (다른 곳은 변경 불가능)
		
		// 풀이
		
		// a를 temp에 새로 보관한다.
		int temp = a;
		
		// a를 b값으로 보낸다.
		a = b;
		
		//b는 새로 등록한 temp(a)의 값으로 보관한다.
		b = temp;
		
		
		//////////////////////////////////////////////////////////////////
		
		System.out.println("교환후 a에 보관된 값: " + a);
		System.out.println("교환후 b에 보관된 값: " + b);
		
		
	}
	
}
