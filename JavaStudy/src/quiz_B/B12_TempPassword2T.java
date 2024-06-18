package quiz_B;

public class B12_TempPassword2T {

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


		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$&'()*+,-./";
		
		for (int i = 0; i < 20; ++i) {
			String password = "";
			for(int j = 0; j < 6; ++j) {
				int randomIndex = (int)(Math.random() * charset.length());
				System.out.println(randomIndex);
				password += charset.charAt(randomIndex);
			}
			System.out.println(password);
		}
		
		


//		for (int i = 0; i < 20; ++i) {
//			String password = "";
//			for (int key = 0; key <= 6; ++key) {
//				// 랜덤으로 4종류를 만들겠다 (대문자, 소문자, 특문, 숫자)
//				int select = (int)(Math.random() * 4);
//				
//				// 4종류 0, 1, 2, 3 으로 조건
//				if(select == 0) {
//					password += (char)(Math.random() * 26 + 'A');
//				} else if (select == 1) {
//					password += (char)(Math.random() * 26 + 'a');
//				} else if (select == 2) {
//					password += (char)(Math.random() * 15 + 33);
//				} else if (select == 3) {
//					password += (char)(Math.random() * 10 + '0');
//				}
				
//				switch (select) {
//				case 0:
//					password += (char)(Math.random() * 26 + 'A');
//					break;
//				case 1:
//					password += (char)(Math.random() * 26 + 'a');
//					break;
//				case 2:
//					password += (char)(Math.random() * 15 + 33);
//					break;
//				case 3:
//					password += (char)(Math.random() * 10 + '0');
//					break;
//				}
//			}
//			System.out.println(i + "번째 비밀번호: " + password);
//			
//		}

		
		
		
		
	}
}
