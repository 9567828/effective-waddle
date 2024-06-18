package backjoon;

public class B08_PrintReverse {
	 /*
 		사용자가 문장을 입력하면 해당 문장을 거꾸로 출력해보세요
	 */
	public static void main(String[] args) {
		String text = "안녕하슈";
		int len = text.length();
		
		for(int i = 0; i < len; ++i) {
			System.out.println(text.charAt(i));
		}
		
	}
	
	
}
