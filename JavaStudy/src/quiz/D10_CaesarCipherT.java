package quiz;
// 24. 05. 22
// 풀이

public class D10_CaesarCipherT {
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
	
	String cryptSet;
	
	public D10_CaesarCipherT() {
		cryptSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+\r\n"
				+ "abcdefghijknmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
	}
	
	// 다른 암호표를 새로 받으면 넣어주겠다
	public D10_CaesarCipherT(String cryptSet) {
		this.cryptSet = cryptSet;
	}
	
	// 1. 평문과 키 값이 전달되면 해당 평문을 암호문으로 만들어서 변환하여 리턴해주는 메서드
	String encrypt(String plain, int key) {
		StringBuilder result = new StringBuilder();
		int len = plain.length();
		
		for (int i = 0; i < len; ++i) {
			// 문자를 하나씩 꺼낸다
			char ch = plain.charAt(i);

			// 암호표에서 해당 문자의 위치를 찾는다
			int index = cryptSet.indexOf(ch);
			
			// 만약 -1이 나왔다면 암호표에 존재하지 않는 문자이므로 그대로 유지
			// 인덱스가 -1이 아니라면 암호표에서 키값만큼 더한 문자를 가져와서 추가
			if (index != -1) {
				result.append(cryptSet.charAt((index + key) % cryptSet.length()));
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}
	
	// 2. 암호문과 키 값이 전달되면 해당 암호문을 평문으로 변환하여 리턴해주는 메서드 decryption
	String decrypt(String crypto, int key) {
		StringBuilder result = new StringBuilder();
		int len = crypto.length();
		int len2 = cryptSet.length();
		
		// 어차피 키값이 너무 커봤자 의미가 없는 알고리즘이기 때문에 사이즈를 줄일 수 있따
		key = key % 12;
		
		for (int i = 0; i < len; ++i) {
			char ch = crypto.charAt(i);
			int index = cryptSet.indexOf(ch);
			
			// "ABCDEFG"
			// 전체길이 : 7;
			// 키 값은 7 이상이면 의가 없다
			
			if (index != -1) {
//				result.append(cryptSet.charAt(index - key + len2));
				// key값으로 뺏는데 결과가 음수인 경우와 양수인 경우를 처리한다
				
				int target = index - (key % len2);
				if (target < 0) {
					result.append(cryptSet.charAt(target + len2));
				} else {
					result.append(cryptSet.charAt(target));					
				}
			} else {
				result.append(ch);
			}
		}
		
		return result.toString();
	}
	// ※ 사용할 수 있는 문자의 종류: 영어 대문자&소문자, 숫자, 특수문자(키보드에있는모든)
	
	public static void main(String[] args) {
		D10_CaesarCipherT cipher1 = new D10_CaesarCipherT();
		
		int key = 10;
		
		String encrypted = cipher1.encrypt(",.,", key);
		System.out.println("암호화: " + encrypted);
		
		String devrypted = cipher1.decrypt(encrypted, key);
		System.out.println("복호화: " + devrypted);
	}
}
