package quiz;

import java.util.ArrayList;

// 24.05.14
public class D01_ArrayListQuiz {

	/*
	 	1. 리스트에 1000 ~ 1999 사이의 랜덤 정수 100개 추가하기
	 	
	 	2. 원본에서 짝수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	 	
	 	3. 2번의 결과에서 홀수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	*/
	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
//		int even = 0;
//		int odd = 0;
		int cnt = 0;
		for (int i = 0; i < 100; ++i) {
			num.add((int)(Math.random() * 1000) + 1000);
			for (int j = 0; j < i; ++j) {
				if (num.get(i) == num.get(j)) {
					--i;
					break;
				}
			}
		}
		System.out.println("원본: " + num);

		for (int i = 0; i < num.size(); ++i) {
			if (num.get(i) % 2 == 0) {
				num.remove(i);
				continue;
			}
			++cnt;
		}
		System.out.println(num);
		System.out.println("짝수제거" + num.size());
		
		
//		for (int i = 0; i < num.size(); ++i) {
//			if(num.get(i) % 2 == 0) {
//				even.add(num.get(i));
//			} else if (num.get(i) % 2 != 0) {
//				odd.add(num.get(i));
//			}
//		}
//		System.out.println(even);
//		System.out.println(odd);
//		
//		for (int i = 0; i < num.size(); ++i) {
//			even.addAll(odd);
//			even.removeAll(odd);			
//		}
//		
//		System.out.println(cnt);
		
		
//		System.out.println("짝수제거: " + even);
//		System.out.println("홀수제거: " + odd);
		
	}
	
}
