package quiz_B;

import java.util.Scanner;

// 24. 04. 25

public class B09_NumericT {

	/*
		사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
		판별해주는 프로그램을 만들어보세요
		
		ch >= '0' && 
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력해주세요: ");
		
		String text = sc.nextLine();
		
		int len = text.length();
		
		boolean onlyNum = true;
		
		
		// 1. 모든 문자가 숫자인지 검사하는 방식. 검사를 무조건 문자열 길이만큼 해야 한다.
//		for(int i = 0; i < len; ++i) {
//			char ch = text.charAt(i);
//			onlyNum &= ch >= '0' && ch <= '9';
//			
//			if (ch >= '0' && ch <= '9') {
//				onlyNum &= true;
//			} else {
//				onlyNum &= false;
//			}
//		}
//		 System.out.println("숫자만으로 이루어져 있나요? " + onlyNum);
		
		// 2. 숫자가 아닌 문자가 등장하면 바로 검사를 중단하는 방식
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			
			if (ch < '0' || ch > '9') {
				onlyNum = false;
				break;
			}
		}
		 System.out.println("숫자만으로 이루어져 있나요? " + onlyNum);
		
		
		
	}
	
}
