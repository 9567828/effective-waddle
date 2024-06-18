package quiz_B;

import java.util.Arrays;

// 24. 05. 01

public class B14_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] myArr = {
				new int[5],
				new int[7],
				new int[3],
				new int[10],
				{1, 1, 1, 1},
		};
		
		// 1. myArr의 모든 값을 100 ~ 200 사이의 랜덤 정수로 바꾸기

		// 2. 랜덤으로 바뀐 모든 값의 총함과 평균을 구하기
		
		// 3. 각 행(row)의 합을 구해서 출력하기
		
		// 4. 각 열(col)의 합을 구해서 출력하기
		
		
		for (int i = 0; i < myArr.length; ++i) {
			for(int j = 0; j < myArr[i].length; ++j) {
				myArr[i][j] = (int)(Math.random() * 101 + 100);
			}
			System.out.println(Arrays.toString(myArr[i]));
		}
		
		System.out.println("--------------------------------");
		
		int total = 0;
		double avg = 0;
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				total += myArr[i][j];
				++avg;
			}
		}
		System.out.println("총합: " + total);
		System.out.printf("평균: %.2f\n", total/avg);

		System.out.println("--------------------------------");
		
		int[] row = new int[myArr.length];
		
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				row[i] += myArr[i][j];
			}
		}
		
		for (int i = 0; i < row.length; ++i) {
			System.out.printf("%d번째 합: %d\n", i, row[i]);
		}

		System.out.println("--------------------------------");
		
		int[] col = new int[myArr.length];
		
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				col[j] += myArr[i][j];
			}
		}
		
		
		
		
	}
	
}
