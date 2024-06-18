package quiz_B;

public class B12_TempPassword2 {

	/*
	 	대문자, 소문자, 특수문자, 숫자로 구성된 
	 	6자리 랜덤 비밀번호를 20개 생성하여 출력하는 프로그램을 만들어보세요
	 	
	 	※ 비밀번호로 사용가능한 특수문자의 아스키코드 범위는 33 ~ 47 48~57 숫자
	 	소문자 - 97 ~ 122
	 	대문자 - 65
	 	숫자 48 - 57
	 	91 - 96 필요없는 범위
	 	58 - 64 필요없는 범위
	 	
	 	i 91 보다 크면 false
	 	i 96 보다 작으면 false
	 	i 58 보다 크면 false 출력
	 	i 64 보다 작으면 false 출력
	 	
	 	i 91 보다 작으면 true
	 	i 96 보다 크면 true
	 	i 58 보다 작으면 true
	 	i 64 보다 크면 true
	 	
	 	 i >= (char)91 && i <= (char)96
	*/
	
	public static void main(String[] args) {
		
		
		boolean tempword = true;
		
		for(int i = 0; i < 20; ++i) {
			String password = "";
			for (int j = 0; j < 6; ++j) {
				int randomCh = (char)((Math.random() * 90) + 33);
				System.out.println(randomCh);
				char ch = password.charAt(randomCh);
				password += randomCh;
//				System.out.println(ch);
				if(ch <= ':' && ch >= '@') {
					tempword = false;
				}
			}
//			if(tempword) {
//				System.out.println(password);
//			}
		}
		
	}
	
	
}
