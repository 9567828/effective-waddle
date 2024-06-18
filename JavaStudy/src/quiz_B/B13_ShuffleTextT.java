package quiz_B;

import java.util.Scanner;

public class B13_ShuffleTextT {

	/*
		사용자로부터 문장을 입력받으면
		해당 문장의 순서를 랜덤으로 뒤섞은 결과를 만들어낸 후 출력해보세요
		(문장 내에 공백이 포함되어 있으면 제거할 것)
		
		ex> 오늘 나는 지하철을 타고 왔다
		 -> 타왔다고는오...
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무말이나 입력>> ");
		String text = sc.nextLine();
		
		String spaceRemoved = "";
				
		// len을 여러번 사용하고 싶을 때 for문에 넣어서 한 번만 실행 되도록 하는 방법
		// 공백이 아니면 spaceRemoved에 ch를 붙여서 누적시킨다
		for (int i = 0, len = text.length(); i < len; ++i) {
			char ch = text.charAt(i); 
			if (ch != ' ') {
				spaceRemoved += ch;
			}
		}
		
		char[] arr = new char[spaceRemoved.length()];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = spaceRemoved.charAt(i);
		}
		
//		섞기 (랜덤한 위치를 뽑으려 하면 같은 위치가 자꾸 걸려서 문제가 된다)
//		for (int i = 0; i < arr.length; ++i) {
//			arr[i] = text.charAt((int)(Math.random() * arr.length));
//			arr[i] = arr[(int)(Math.random() * arr.length)]; 이렇게 써도 됨
//		}
//		System.out.println(arr);
		
		
//		화투처럼 섞기 (0번 위치와 랜덤 위치의 값을 1000번 교환한다)
		
		/*
		 	length : 5
		 	      0    1    2    3    4
		 	arr {'H', 'e', 'l', 'l', 'o'}
		 	
		 	temp ''
		 	
		 	temp가 [0] 자리로 들어가고 기존 [0]은 인덱스에 아무자리나 들어가서 채워짐 이걸 천번 반복해서 섞인다는 뜻
		*/
		for(int i = 0; i < 1000; ++i) {
			// 1부터 돌아가게 하기 위해서 length에 -1을 한 후 다시 +1을 한다
			int randomIndex = (int)(Math.random() * (arr.length -1) +1);
			
			char temp = arr[0];
			arr[0] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
		System.out.println(arr);
		
		
		
		
	}
	
}
