package quiz_B;
//24. 04. 25

public class B08_ChangeCase {

	/*
	 	사용자가 영어로 된 문장을 입력하면 대소문자를 
	 	반대로 바꿔서 출력해주는 프로그램을 만들어보슈
	 	
	 	ex.
	 	입력 > I Like To Try Apple
	 	출력 > i lIKE tO tRY aPPLE
	 	
	 	--- 안해 도 됨 ---
	 	※ 입력에 공백 또는 영어가 아닌 문자가 포함되어 있다면 메세지를 출력
	 	입력 > 한글
	 	출력 > 영어와 공백만 입력 하실 수 있습니다.
	 	
	 	a - z 까지 순서를 확인해서
	 	A - Z 까지 순서 확인하고 a > A로 바꾼다
	*/
	
	public static void main(String[] args) {
		
		String eng = "Hello World";
		char chr = 'b';
		int len = eng.length();
		
		int cnt = 0;
		String lowerCase;
		String upperCase;
		boolean space = false;
		
		for (int i = 0; i < len; ++i) {
			char ch = eng.charAt(i);
//			System.out.print(" " + (int)ch);
			if (ch <= 'A' || ch >= 'Z') {
				++cnt;
				System.out.print("입력한 문자는: " + (ch - 32));
			} else if (ch <= 'a' || ch > 'z') {
				System.out.print("입력한 문자는2: " + (ch + 32));				
			}
		}

		System.out.println();
		
	}
	
}
