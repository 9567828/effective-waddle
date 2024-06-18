package quiz_B;

public class B13_Sort {
	
	/*
	 	1 ~ 1000 사이의 랜덤 정수 값이 30개 들어잇는 배열을 하나 생성한 후
	 	
	 	해당 배열의 내용을 작은 값 부터 차례대로 저장한 새로운 배열을 만들어 원본과 함께 출력
	*/
	
	public static void main(String[] args) {
		int[] num = new int [30];
		
		int minNum = 1;
		int maxNum = 1000;
		
		for (int i = 0; i < num.length; ++i) {
			num[i] = (int)(Math.random() * 1000 + 1);
		}
		
		
		for (int i = 0; i < num.length; ++i) {
			maxNum = maxNum > num[i] ? maxNum : num[i];
			maxNum = minNum < num[i] ? minNum : num[i];
		}
		System.out.println(minNum);
		
		
		
		
		
		
	}

}
