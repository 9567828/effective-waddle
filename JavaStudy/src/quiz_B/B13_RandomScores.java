package quiz_B;

public class B13_RandomScores {

	/*
		1. 100개의 점수를 랜덤으로 생성하여 배열에 저장
		   (점수는 0 ~ 100점)
		   
		2. 배열에 저장된 값을 한 줄에 10개씩 출력
		   (단, 60점 미만인 점수는 X로 표시)
		  
		3. 모든 점수의 평균 점수를 출력(소수 둘째 자리까지 출력)
		
		4. 생성된 랜덤 점수 중 가장 높은 점수와 가장 낮은 점수를 출력
		
		※ 모든 과정을 하나의 반복으로 처리하는 것은 금지
	 */
	public static void main(String[] args) {

		int[] scores = new int[100];
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = (int)(Math.random() * 100 + 1);

		}
		for (int i = 0, cnt = 0; i < scores.length; ++i) {
			if (scores[i] < 60) {
				System.out.printf("%d점X\t", scores[i]);
			} else if (scores[i] >= 60) {
				System.out.printf("%d점\t", scores[i]);
			}
			++cnt;
			if (cnt % 10 == 0) {
				System.out.println();
			}	
		}
		int total = 0;
		for (int i = 0; i < scores.length; ++i) {
			total += scores[i];

		}			
		System.out.printf("평균 점수: %.2f점", total / 100.0);

	}
}
