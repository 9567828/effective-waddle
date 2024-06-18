package quiz_B;
// 24.04.26

public class B12_TempPassword {
	
	/*
	 	알파벳 대문자로만 구성된 랜덤 4자리 비밀번호를 20개 생성하여 출력해보세요
	*/

	public static void main(String[] args) {
		
		char passWrod1;
		char passWrod2;
		char passWrod3;
		char passWrod4;
		
		for(int i = 0; i < 20; ++i) {
			passWrod1 = (char) ((Math.random() * 26) + 65);
			System.out.println("i: " + i);
			for(int j = 0; j < 4; ++j) {
				System.out.println();
			}
			passWrod2 = (char) ((Math.random() * 26) + 65);
			passWrod3 = (char) ((Math.random() * 26) + 65);
			passWrod4 = (char) ((Math.random() * 26) + 65);
//			System.out.printf("%c%c%c%c\n", passWrod1,passWrod2,passWrod3,passWrod4);
		}
		
	}
	
}
