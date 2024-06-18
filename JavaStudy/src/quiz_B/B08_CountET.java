package quiz_B;
// 24.04.24
// 풀이
import java.util.Scanner;

public class B08_CountET {

	/*
	 	사용자가 문장을 입력하면 해당 문장에 포함 된 
	 	알파벳 e의 개수를 출력하는 프로그램을 만들어보세요
	 	(대/소문자 모두 개수에 포함 시켜야 한다)
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어로 아무말: ");

		// next만 하면 첫글자만 가져간다
		String text = sc.nextLine();
		
		// for문에 넣지 말고 변수로 미리 계산 때리기
		int len = text.length();
		
		// 0부터 입력한 문장의 길이 -1까지 i를 반복
		int cnt = 0;
		for(int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			if(ch == 'e' || ch == 'E') {
				++cnt;
			}
		}
		System.out.println("e또는 E가 나온 횟수: " + cnt);
	
		
		
		
	}	
}
