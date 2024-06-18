package quiz;

public class A03_VariableQuiz {
	public static void main(String[] args) {
		
		String name = "홍길동";
		byte age = 20;
		String num = "010-1234-1234";
		double tall = 178.5;
		int weight = 75;
		char blood = 'O';
		
		System.out.println("=========== 출력 결과 ===========\n");
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + num);
		System.out.println("키\t: " + tall);
		System.out.println("몸무게\t       : " + weight);
		System.out.println("혈액형\t       : " + blood + "\n");
		
		
		// 선생님 풀이
		String name1 = "홍길동";
		int age1 = 20; //byte도 괜춘, 자원절약 메모리를 아껴야할 때 사용 / 요즘은 메모리가 커서 int를 많이 씀
		// int tel = 010-1234-1234; 숫자 앞에 0이 들어가면 8진수가 된다. 결과 -2460
		String tel = "010-1234-1234";
		double height = 178.5;
		// float height = 178.5f; f를 넣어라~ * 자원을 절약해야 할 상황이 아니라면 double 쓰는 편
		
		// 몸무게는 소숫점이 있으니 float or double이 적합
		// float 실수가 정수를 이긴다(?) 정수에 f를 붙이지 않아도 출력가능함. 단 실수로 표현됨
		float weight1 = 75;
		// 9.99999 * 10^ 같은 식으로 표현됨
		float number = 999999999999L;
		System.out.println(number);
		// char blood1 = 'O'; > 혈액형에 AB형이 있기 때문에 char는 안됨 String을 사용하라
		String blood1 = "O";
		
		System.out.println("=========== 출력 결과 ===========\n");
		System.out.println("이름\t: " + name1);
		System.out.println("나이\t: " + age1);
		System.out.println("Tel\t: " + tel);
		System.out.println("키\t: " + height);
		System.out.println("몸무게\t       : " + weight1);
		System.out.println("혈액형\t       : " + blood1);
		

	}
	
	
}
