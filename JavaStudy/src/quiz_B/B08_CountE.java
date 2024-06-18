package quiz_B;
// 24.04.24

import java.util.Scanner;

public class B08_CountE {

	/*
	 	사용자가 문장을 입력하면 해당 문장에 포함 된 
	 	알파벳 e의 개수를 출력하는 프로그램을 만들어보세요
	 	(대/소문자 모두 개수에 포함 시켜야 한다)
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어로 아무말: ");
		
		String text = sc.nextLine();
		
		
		int cnt = 0;
		for(int i = 0; i <= text.length(); ++i) {
//			System.out.println(i);
			if (text.charAt(i) == 'e' || text.charAt(i) =='E') {
				++cnt;
			}
		}
		System.out.printf("입력하신 문장 중 'e'또는 'E'의 개수는 %d개입니다\n", cnt);
		
		
		
	}
	
	
}
