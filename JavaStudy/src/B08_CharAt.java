// 24. 04. 24
public class B08_CharAt {

	/*
	 	# "문자열".charAt(index);
	 	
	 	- 해당 문자열에서 원하는 인덱스의 문자를 char타입으로 꺼내오는 함수
	 	- 시작 인덱스는 0번이다
	 	- 마지막 인덱스는 문자열의 길이 (-1)이다
	 	
	 	# "문자열".length();
	 	
	 	- 해당 문자열의 길이(몇 글자인지)를 int타입으로 반환하는 함수
	*/
	
	
	public static void main(String[] args) {
		
		String str = "가나다라";
		
		char ch = str.charAt(3);
//		ch = str.charAt(4);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println("ABCDEFG".charAt(5));
//		System.out.println(ch); 문자열이 4글자일 때 마지막 인덱스는 3번이다
		
		System.out.println("----------------------------");
		
		String str2 = "I have a delicious apple";
		
		System.out.println(str2.length());
		System.out.println("마지막 글자: " + str2.charAt(str2.length() -1));
		System.out.println(str2.charAt(str2.length() -2));
		System.out.println(str2.charAt(str2.length() -3));
		System.out.println(str2.charAt(str2.length() -4));
		
		// for문과 charAt을 사용해 문자열을 쉽게 탐색할 수 있다
		for(int i = 0; i < str2.length(); ++i) {
			System.out.printf("%d번째 문자: %c\n", i, str2.charAt(i));
		}
		
		
	}	
}
