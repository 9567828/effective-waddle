package quiz;

import java.util.Scanner;

public class D09_isPhoneNumberT {
	
	/*
		전달받은 문자열이 올바른 핸드폰 번호인지 검사하는 메서드를 만들어보세요
	*/

public static boolean checkPhone(String phone) {
	String phoneNum = phone.replace("-", "");
	
	
		if(!phoneNum.startsWith("010")) {
			System.out.println("[오류] 시작 번호를 확인해주세요.");
			return false;
		} 
		
		if(phoneNum.length() != 11) {
			System.out.println("[오류] 번호의 길이를 확인해주세요");
			return false;
		} 
		
		for(int i = 0; i < phoneNum.length(); ++i) {
			char ch = phoneNum.charAt(i);
			if (ch < '0' || ch > '9') {
				System.out.println("[오류] 숫자를 입력해주세요");
				break;
				
			}
			return false;
		}
		return true;
	
}
		

// 풀이
public static boolean isValidPhoneNumber(String phoneNumber) {
	// 외곽의 공백은 허용해주겠다
	phoneNumber = phoneNumber.trim();
	
	// 숫자와 - 만으로 이루어진 문자열인가
	int len = phoneNumber.length();
	for (int i = 0; i < len; ++i) {
		char ch = phoneNumber.charAt(i);
		
		if(ch != '-' && ( ch < '0' || ch > '9')) {
			System.out.println("[System] - 또는 숫자가 아닌 문자가 포함되어 있습니다"); 
			return false;
		}		
	}

	// -가 포함된 번호인 경우 길이가 13이어야 하고 -의 위치도 검사해야 한다
	if (phoneNumber.contains("-")) {
		if (phoneNumber.length() != 13) {
			System.out.println("[System] 번호의 길이가 잘못되었습니다");
			return false;
		} else if (phoneNumber.indexOf('-') != 3 || 
				phoneNumber.lastIndexOf('-') != 8) {
			System.out.println("[System] 번호의 길이가 잘못되었습니다");
			return false;
		}
		
	}
	
		// 모든 -를 제거한 후의 길이가 11인가
		phoneNumber = phoneNumber.replace("-", "");
		
		if (phoneNumber.length() != 11) {
			System.out.println("[System] 숫자의 개수가 잘못되었습니다");
			return false;
		}
		
		if (!phoneNumber.startsWith("010")) {
			System.out.println("[System] 번호가 010으로 시작하기 않습니다");
			return false;
		}
		
		return true;
}

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("핸드폰 번호 입력 > ");
	//	String phone = sc.nextLine();
		
		 // main 메서드가 static이기 때문에 static 메서드를 가져다 쓸 수 있음		
		 // static을 붙이지 않으면 main에서는 인스턴스를 가져다 써야 함
		
	//	D08_isPhoneNumber inst = new D08_isPhoneNumber();		
	//	inst.checkPhone(phone);
//		checkPhone(phone);
	
		System.out.println("---------------------------------------------------------------------");
		String ph = "010-1234-1234";
		System.out.println(isValidPhoneNumber(ph));
	}

}
