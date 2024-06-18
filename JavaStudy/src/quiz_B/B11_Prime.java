package quiz_B;

public class B11_Prime {

	/*
	 	사용자가 정수를 입력하면 1부터 입력한 숫자 사이에
	 	존재하는 모든 소수를 출력해보세요
	 	
	 	※소수(prime): 나누어 떨어지는 약수가 1과 자기 자신밖에 없는 수
	 		(2, 3, 5, 7, 11, 13, ..)
	 		
	 		2의 배수 제외
	 		3
	 		
	 		
	 				boolean num = true;

		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			if (ch >= '0' && ch <= '9') {
				continue;
			}
			num = false;
		}

		if(num) {
			System.out.println("숫자만 있다");
		} else {
			System.out.println("문자 혹은 숫자가 포함 되었다");						
		}
		
	*/
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		int num = 50;
		
		int i = 1;
		while(i <= num) {
//			System.out.println(i);
			if(i % 2 == 1 && i != 1 && i != 9 && i % 3 != 0 && i % 7 != 0 || i == 2 || i == 3 || i == 7) {
				System.out.println(i);
//				balance = true;
			}
			++i;
		}
		
		
	}
	
	
}
