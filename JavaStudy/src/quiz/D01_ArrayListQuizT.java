package quiz;

import java.util.ArrayList;

// 24.05.14
public class D01_ArrayListQuizT {

	/*
	 	1. 리스트에 1000 ~ 1999 사이의 랜덤 정수 100개 추가하기
	 	
	 	2. 원본에서 짝수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	 	
	 	3. 2번의 결과에서 홀수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	*/
	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		
		for (int i = 0; i < 100; ++i) {
			num.add((int)(Math.random() * 1000 + 1000));
		}
		
		System.out.println(num);
		int i = 0;
		while (i < num.size()) {
			if (num.get(i) % 2 == 0) {
				num.remove(i);
				continue;
			}
			++i;
		}

		System.out.println(num);
		System.out.println("남은 개수 " + num.size());
		
		i = 0;
		while (i < num.size()) {
			if (num.get(i) % 2 != 0) {
				num.remove(i);
				continue;
			}
			++i;
		}
		
		System.out.println(num);
		System.out.println("남은 개수 " + num.size());
		
		// 리스트를 활용해 짝수 리스트와 홀수 리스트를 만들어서 처리하기
		
		ArrayList<Integer> origin = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		for (i = 0; i < 100; ++i) {
			origin.add((int)(Math.random() * 1000 + 1000));
		}
		
		System.out.println("원번: " + origin);
		
		int len = origin.size();
		for (i = 0; i < len; ++i) {
			int value;
			switch ((value = origin.get(i)) % 2) {
				case 0:
					even.add(value);
					break;
				case 1:
					odd.add(value);
					break;
			}
		}
		
		System.out.println("짝수" + even);
		System.out.println("헐수" + odd);
	}
	
}
