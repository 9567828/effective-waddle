package quiz;
// 24. 05. 22

public class D10_CaesarCipher {
	/*
 		# 시저(카이사르) 암호
 		
 		- 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 변경하여 암호문을 생성하는
 		  암호 알고리즘
 		  
 		  [암호표]
 		  ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+
 		  abcdefghijknmnopqrstuvwxyz {}[]|\;:'"/?<>,.
 		  
 		  * 암호화
 		  (평문)		   key: 3      (암호문)
 		  HELLO!      ------->     KHOOR!
 		  
 		  * 복호화
					   key: 3
 		  HELLO!      <-------     KHOOR!
	*/
	
	// 1. 평문과 키 값이 전달되면 해당 평문을 암호문으로 만들어서 변환하여 리턴해주는 메서드
	// 2. 암호문과 키 값이 전달되면 해당 암호문을 평문으로 변환하여 리턴해주는 메서드 decryption
	// ※ 사용할 수 있는 문자의 종류: 영어 대문자&소문자, 숫자, 특수문자(키보드에있는모든)
	
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+"
			+ "abcdefghijknmnopqrstuvwxyz {}[]|\\;:\'\"/?<>,.";
	int setLen = passwordSet.length();
	
	public String encryption(String inputText, int a) {
		
		int len = inputText.length();
		StringBuilder sb = new StringBuilder(inputText);
		
//		for (int i = 0; i < len; ++i) {
//			char ch = inputText.charAt(i);
//			int indexof = passwordSet.indexOf(ch);
//			char changePW = passwordSet.charAt(indexof + a);
//			sb.setCharAt(i, changePW);
//		}
		int i = 0;
		while (i < len) {
			char ch = inputText.charAt(i);
			int indexof = passwordSet.indexOf(ch + a);
			char changePW = passwordSet.charAt(indexof + a);
			sb.setCharAt(i, changePW);
			++i;
			continue;
		}
		return String.format("%s", sb);
	}

	public boolean getPassword(String inputText) {
		int len = inputText.length();
		
		for (int i = 0; i < len; ++i) {
			char ch = inputText.charAt(i);
			for (int j = 0; j < len; ++j) {
				char ch2 = passwordSet.charAt(j);
				if (ch == ch2) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		D10_CaesarCipher password = new D10_CaesarCipher();
		
		System.out.println(password.encryption("ddd..", 3));
		
		
		
	}
	
}
