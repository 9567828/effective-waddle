package quiz;

import java.util.Arrays;

// 24.05.02

public class C00_FunctionQuzi2 {

	/*
	 	1. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	 	2. 문자열을 전달하면 해당 문자열을 거꾸로 뒤집은 문자열을 반환하는 함수
	 	3. 문자열을 전달하면 해당 문자열의 좌우대칭 여부를 반환하는 함수
	 	4. 함수를 호출하면 1 ~ 45 사이의
	 	   중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	*/
	
	// 1. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	public static char[] randomText(String str) {
		
		char[] arr = new char[str.length()];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = str.charAt(i);
		}

		for(int i = 0; i < 1000; ++i) {
			int randomIndex = (int)(Math.random() * (arr.length -1) +1);
			
			char temp = arr[0];
			arr[0] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
		
		return arr;
	}
	
	
	// 2. 문자열을 전달하면 해당 문자열을 거꾸로 뒤집은 문자열을 반환하는 함수
	public static String reversed(String str) {
		
		int len = str.length();
		
		for (int i = 0; i < len; ++i) {
			char ch = str.charAt(len - 1 - i);
//			System.out.print(ch);
		}
		
		return str;
		
		
	}
	
 	// 3. 문자열을 전달하면 해당 문자열의 좌우대칭 여부를 반환하는 함수
	public static boolean Palindrome(String str) {
		
		int len = str.length();
		int half = len / 2;
		
		for (int i = 0; i < half; ++i) {
			char ch = str.charAt(i);
			char ch2 = str.charAt(len - 1 -i);
			if (ch != ch2) {
				return false;
			}
		}
		
		return true;
		
	}

	
 	// 4. 함수를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	public static int[] ranNum() {
		int[] num = new int [7];
		int index = 0;
		
		boolean repeated = false;
		for (int i = 0; i < num.length; ++i) {
			int ranNums = (int)(Math.random() * 45 + 1);
			
			for (int j = 0; j < index; ++j) {
				if (num[i] == ranNums) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				num[index] = ranNums;
				++index;
			}
		}
		
		return Arrays.copyOf(num, index);
	}
	
//	public static int[] lotto() {
//		int[] num = new int [7];
//		int index = 0;
//		
//		for (int i = 0; i < num.length; ++i) {
//			int ranNums = (int)(Math.random() * 45 + 1);
//			
//		}
//		
//		
//	}
	
	public static void main(String[] args) {
		System.out.print("1번: ");
		System.out.println(randomText("안녕하세여 하하호호히 ㄷ랴더"));
		
		System.out.println("-----------------------");
		
		System.out.print("2번: ");
		String text = reversed("안녕하슈");
		System.out.println(text);
		System.out.println("-----------------------");
		
		System.out.print("3번: ");
		System.out.println(Palindrome("abba"));
		System.out.println("-----------------------");

		System.out.print("4번: ");
		System.out.println(Arrays.toString(ranNum()));
		
	}
}
