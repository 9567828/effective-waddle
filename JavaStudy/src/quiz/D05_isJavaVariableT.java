package quiz;

import java.util.Scanner;

import javax.lang.model.SourceVersion;

// 24. 05. 16
// 풀이

public class D05_isJavaVariableT {

	/*
	 	사용자로 부터 문자열을 입력받으면
	 	해당 문자열의 자바 변수로 사용할 수 있는 문자열인지 검사해보세요
	*/
	
	public static boolean isJavaVariable(String str) {
		// 전달 받은 문자열을 다루기 편한 char[]로 변환하겠다
		char[] arr = str.toCharArray();
		
		// 첫번째 글자가 자바의 변수명으로 적합하지 않으면
		if (!Character.isJavaIdentifierStart(arr[0])) {
			// 메서드를 종료하고 false를 리턴
			return false;
		}		
		
		// 두번째 글자 부터는 isJavaIdentifierPart() 메서드로 확인한다
		for (int i = 1; i < arr.length; ++i) {
			// 한 번이라도 적합하지 않은 문자가 등장하면 false를 반환한다
			if (!Character.isJavaIdentifierPart(arr[i])) {
				return false;
			}
		}
		
		// 여기까지 도착하면 true를 반환한다
		return true;
	}
	
	public static void main(String[] args) {
		// 예약어 검사해 주는 메서드
		// SourceVersion.isKeyword(): 전달한 문자열이 자바의 예약어 인지 확인해 준다
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String str = sc.nextLine();
			
			if (SourceVersion.isKeyword(str)) {
				System.out.println(str + " 자바의 예약어 입니다. 변수로 사용 불가");
				continue;
			}
			
			boolean result = isJavaVariable(str);
			
			System.out.println(result ? str + "은 자바 변수로 적합합니다" : str + "은 자바 변수로는 부적합합니다");
		}
		
		
	}
}
