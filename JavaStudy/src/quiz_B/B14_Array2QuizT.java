package quiz_B;

import java.util.Arrays;

// 24. 05. 01
// 풀이

public class B14_Array2QuizT {

	public static void main(String[] args) {
		
		int[][] myArr = {
				new int[5],
				new int[7],
				new int[3],
				new int[10],
				{1, 1, 1, 1},
		};
		
		// 1. myArr의 모든 값을 100 ~ 200 사이의 랜덤 정수로 바꾸기
		for (int i = 0; i < myArr.length; ++i) {
			for(int j = 0; j < myArr[i].length; ++j) {
				myArr[i][j] = (int)(Math.random() * 101 + 100);
			}
			System.out.println(Arrays.toString(myArr[i]));
		}
		
		System.out.println("--------------------------------");
		
		// 2. 랜덤으로 바뀐 모든 값의 총함과 평균을 구하기
		
		int sum = 0;
		double cnt = 0;
		for (int i = 0; i < myArr.length; ++i) {
			cnt += myArr[i].length;
			for(int j = 0; j < myArr[i].length; ++j) {
				sum += myArr[i][j];
			}
		}
		System.out.printf("총합: %d, 평균: %.2f\n", sum, sum / cnt);
		
		System.out.println("--------------------------------");
		
		// 3. 각 행(row)의 합을 구해서 출력하기
		int[] rowSum = new int[myArr.length];
		
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				rowSum[i] += myArr[i][j];
			}
		}
		
		for (int i = 0; i < rowSum.length; ++i) {
			System.out.printf("%d행의 합: %d\n", i, rowSum[i]);
		}
		
		System.out.println("--------------------------------");
		
		// 4. 각 열(col)의 합을 구해서 출력하기
		int maxColSize = 0;
		
		// 배열 중에 가장 길이가 긴 배열의 길이를 구하는 식
		for (int i = 0; i < myArr.length; ++i) {
			maxColSize = maxColSize < myArr[i].length ? myArr[i].length : maxColSize;
		}
		
		// 열의 합의 개수는 가장 열이 많은 행의 길이가 된다
		int[] colSum = new int[maxColSize];
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				colSum[j] += myArr[i][j];
			}
		}
		
		for (int i = 0; i < colSum.length; ++i) {
			System.out.printf("%d열의 합: %d\n", i, colSum[i]);
		}
		
//		for (int i = 0; i < myArr.length; ++i) {
//			System.out.print("{ ");
//			for (int j = 0; j < myArr[i].length; ++j) {
//				System.out.printf("%03d ", myArr[i][j]);
//			}
//			System.out.println("}");
//		}
		
		
	}
	
}
