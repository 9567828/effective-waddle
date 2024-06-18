package quiz;

import java.util.Arrays;

// 24.05.02
// 풀이

public class C00_FunctionQuzi2T {

	/*
	 	1. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	 	2. 문자열을 전달하면 해당 문자열을 거꾸로 뒤집은 문자열을 반환하는 함수
	 	3. 문자열을 전달하면 해당 문자열의 좌우대칭 여부를 반환하는 함수
	 	4. 함수를 호출하면 1 ~ 45 사이의
	 	   중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	*/
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getRandomNumbers(0, 6, 7)));
		System.out.println(Arrays.toString(getLottoNumbers()));
		System.out.println(reverse("안녕하슈"));
		System.out.println(shuffle("안녕하슈"));
		System.out.println(checkPalindrome("abba"));
		
	}


	// 0 ~ 6이 들어왔을 때 중복없이 0 ~ 6 까지의 숫자를 랜덤으로 반환하는 함수
	public static int[] getRandomNumbers(int start, int end, int size) {
		int[] arr = new int [size];
		
		int currIndex = 0;
		while (currIndex < size) {
			int num = (int)(Math.random() * (end - start + 1) + start);
			
			boolean repeated = false;
			for (int i = 0; i < currIndex; ++i) {
				if (arr[i] == num) {
					repeated = true;
					break;
				}
			}
			
			if(!repeated) {
				arr[currIndex++] = num;
			}
		}
		
		return arr;
	}
	
	// 1. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	public static String shuffle(String text) {
		int len = text.length();
		
		// (1) 문자열 길이를 활용해 중복없는 랜덤 인덱스 배열을 먼저 생성한다
		//     ex> 길이가 10일때 0 ~ 9의 중복없는 랜덤 배열이 생성한다
		int[] ranNums = getRandomNumbers(0, len - 1, len);
		
		// (2) 생성된 배열을 활용해 문자열을 섞어서 출력한다
		String shuffled = "";
		for (int i = 0; i < ranNums.length; ++i) {
			shuffled += text.charAt(ranNums[i]);
		}
		
		
		return shuffled;
	}

 	// 2. 문자열을 전달하면 해당 문자열을 거꾸로 뒤집은 문자열을 반환하는 함수
	public static String reverse(String text) {
		int len = text.length();
		String reversed = "";
		
		for (int i = len - 1; i >= 0; --i) {
			reversed += text.charAt(i);
		}
		return reversed;
	}
	
 	// 3. 문자열을 전달하면 해당 문자열의 좌우대칭 여부를 반환하는 함수
	public static boolean checkPalindrome(String text) {
		return text.equals(reverse(text));
	}
	
 	// 4. 함수를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	public static int[] getLottoNumbers() {
		return getRandomNumbers(1, 45, 7);
	}
}
