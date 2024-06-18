//24. 04. 22

public class B04_If {

	/*
	  	# if문
	  	
	  	- ()안의 값이 true면 {} 안의 코드를 실행하는 문법
	  	- ()안의 값이 false면 {} 안의 코드를 무시한다
	  	
	  	# else if
	  	
	  	 - 위의 if문의 조건이 false일 때 {}가 실행되지 않았다면 if문 처럼 동작한다
	  	 - ※ 위의 if문의 true라면 else if는 체크하지 않고 넘어간다
	  	 - else if는 여러번 사용할 수 있다
	  	 - else if는 if문 없이 단독으로 사용할 수 없다
	  	
	  	# else문
	  	
	  	 - 위의 if, else if가 모두 false라면 {}안의 내용을 무조건 실행
	  	 - 무조건 실행하는 문법이기 때문에 ()가 없다
	  	 - if문 바로 다음에 사용할 수도 있다
	  	 - 어떠한 상황에서도 반드시 실행을 보장하고 싶을 때 사용한다
	  	
	  	※ else는 무조건 실행 된다 if/else 문으로 작성하면 무조건 한 번은 실행한다.
	  	
	*/
	
	public static void main(String[] args) {
		
		int a = 50;
		
		if(a < 15) {
			System.out.println("a의 값이 15이하 입니다");
		} else if (a < 25) {
			System.out.println("a의 값이 15이상 25이하 입니다");
		} else if (a < 35) {
			System.out.println("a의 값이 15이상, 25이상, 35이하 입니다");
		} else {
			System.out.println("위의 모든 조건을 만족시키지 못하면 출력");
		}
		
		
		// 컴파일러는 여러분이 조건을 잘 짜든 못 짜든 관심이 없다. 무조건 else가 있어야 100% 실행 된다고 생각한다.
		int num;
		
		if (a % 2 == 0) {
			num = 7;
		} else if (a % 2 == 1) {
			num = 8;
		} else if (a < 0) {
			num = 9;
		} else {
			num = 11;
		}
		
		System.out.println(num);
		
		System.out.println("프로그램이 끝났습니다");
		
	}
	
}
