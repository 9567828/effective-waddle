package quiz_B;

import java.util.Arrays;
import java.util.Random;

public class B13_SortT {
	
	/*
	 	1 ~ 1000 사이의 랜덤 정수 값이 30개 들어잇는 배열을 하나 생성한 후
	 	
	 	해당 배열의 내용을 작은 값 부터 차례대로 저장한 새로운 배열을 만들어 원본과 함께 출력
	*/
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] nums = new int [10];
		
		for(int i = 0; i < nums.length; ++i) {
			nums[i] = ran.nextInt(1000) + 1;
		}

		System.out.println("원본: " + Arrays.toString(nums));
		
		/*
		 	1. 제일 작은 수(i)를 찾는다
		 	2. 맨 앞(i)에 넣는다
		 	3. 위의 과정을 숫자 개수만큼 반복한다
		*/
		
		int[] sorted1 = new int[nums.length];
		
		// sorted1번에 원본 nums의 값을 그대로 복사한다
		for (int i = 0; i < nums.length; ++i) {
			sorted1[i] = nums[i];
		}
		// 반복을 줄이기 위해서 마지막 자리는 찾을 필요 없기 때문에 -1을 한다.
		for(int i = 0; i < nums.length - 1; ++i) {
			// 제일 작은 값과 제일 작은 값이 있던 위치를 찾는다
			int min = sorted1[i];
			int minIndex = i;
			
			for (int j = i + 1; j < nums.length; ++j) {
				if(min > sorted1[j]) {
					min = sorted1[j];
					minIndex = j;
				}
			}
			
			// i번째 값과 찾아낸 제일 작은 값을 교환한다
			int temp = sorted1[i];
			sorted1[i] = sorted1[minIndex];
			sorted1[minIndex] = temp;
			
			System.out.printf("%d번째 정렬 후: %s\n", i, Arrays.toString(sorted1));
			
		}
		
		System.out.println("------------------------------------------------");
		
		/*
		 	1. 맨 앞의 값을 계속 교환하며 제일 큰 값을 맨 뒤로 보낸다
		 	2. 위의 과정을 len - 1번 반복한다
		*/
		
		// Arrays.copyOf(원본배열, 원하는길이) : 전달한 원본배열의 복사본을 반환한다
		// 먼저 수동복사 한 것과 똑같이 돌려주는 것
		int[] sorted = Arrays.copyOf(nums, nums.length);
		
		for (int i = 0; i < sorted.length - 1; ++i) {
			for (int j = 0; j < sorted.length - 1 - i; ++j) {
				
				int a = j;
				int b = j + 1;
				
				if(sorted[a] > sorted[b]) {
					int temp = sorted[a];
					sorted[a] = sorted[b];
					sorted[b] = temp;
				}
			}
			System.out.printf("%d번째 정렬 후: %s\n", i, Arrays.toString(sorted));
		}
		
		
	}

}
