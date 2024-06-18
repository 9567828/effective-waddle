package quiz_B;

import java.util.Scanner;

public class B13_ShuffleText {

	/*
		사용자로부터 문장을 입력받으면
		해당 문장의 순서를 랜덤으로 뒤섞은 결과를 만들어낸 후 출력해보세요
		(문장 내에 공백이 포함되어 있으면 제거할 것)
		
		ex> 오늘 나는 지하철을 타고 왔다
		 -> 타왔다고는오...

		1. 문장을 입력 받으면 공백을 제거한 배열로 만들고싶다
		   
		   (1) 배열을 만들기 위해서 정확한 배열의 크기를 알아야 한다
		   (2) 입력받은 문장에서 공백이 아닌 문자의 개수를 알아야 배열의 크기를 설정할 수 있다
		   (3) 문자열에 들어있는 공백이 아닌 문자들을 배열로 옮겨 담는다
		   
		2. 완성된 배열을 랜덤으로 섞어준다


	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String enterStr = sc.next();
		String enterStr = "택시가 길을 돌아갔다";
		
		
		int len = enterStr.length();
				
		int cnt = 0;
		for(int i = 0; i < len; ++i) {
			char ch = enterStr.charAt(i);
			int[] index = new int[ch];
//			System.out.println((int)ch);
			if(ch == ' ') {
				++cnt;
			index = new int[(int)(Math.random() * ch) - cnt];
				System.out.println(cnt);
			}
			
			for(int j = 0; j < index.length; ++j) {
				System.out.println(j);
			}
				
		}
		
	}
	
}
