package example;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String word = "hello";
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		
		// len - 1 : 마지막 글자의 위치
		// len - 1 - 0 : 마지막 글자의 위치
		// len - 1 - 1 : 뒤에서 두 번째 글자의 위치 위치는 for문에서 i
		System.out.println(word.charAt(5 - 1 - 0));
		System.out.println(word.charAt(5 - 1 - 1)); // 한 글자 더 옆으로 와서
		System.out.println(word.charAt(5 - 1 - 2)); // 두 글자!
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(0));
	}
	
}
