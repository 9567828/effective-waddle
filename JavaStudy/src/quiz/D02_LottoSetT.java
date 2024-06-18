package quiz;

import java.util.HashSet;

// 24. 05. 14

public class D02_LottoSetT {
	
	/*
 		HashSet을 사용해 1 ~ 45 사이의 중복없는 7개의 랜덤 숫자를 생성해보세요
	*/
	
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		
		// 7개가 안되는 이유 = 중복이 걸리면 삭제하기 때문에
		
//		lotto.add((int)(Math.random() * 45 + 1));
//		lotto.add((int)(Math.random() * 45 + 1));
//		lotto.add((int)(Math.random() * 45 + 1));
//		lotto.add((int)(Math.random() * 45 + 1));
//		lotto.add((int)(Math.random() * 45 + 1));
//		lotto.add((int)(Math.random() * 45 + 1));
//		lotto.add((int)(Math.random() * 45 + 1));
		
		while (lotto.size() != 7) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		
		System.out.println(lotto);
		
	}
}
