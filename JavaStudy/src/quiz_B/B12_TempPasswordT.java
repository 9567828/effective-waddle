package quiz_B;
// 24.04.26
// 풀이


public class B12_TempPasswordT {
	
	/*
	 	알파벳 대문자로만 구성된 랜덤 4자리 비밀번호를 20개 생성하여 출력해보세요
	*/

	public static void main(String[] args) {
		
		for(int j = 0; j < 20; ++j) {
			String password = "";
			for(int i = 0; i < 4; ++i) {
				password += (char) (Math.random() * 26 + 65);
			}			
			System.out.println(j + "번째 비밀번호: " + password);
		}
		
		
		
	}
	
}
