package quiz_B;

import java.util.Scanner;

public class B13_Lotto {

	/*
	 	(1) 1 ~ 45 사이의 중복없는 랜덤 숫자 7개를 생성하여
	 	    로또 당첨 번호를 만들어 보세요
	 	
	 	1. 숫자를 랜덤으로 뽑는다
	 	2. 뽑았으면 이전에 뽑았던 숫자 중에 방금 뽑은 숫자가 없는지 확인한다
	 	3. 있으면 다시 뽑고 없으면 넘어간다
	 	
	 	(2) 1등 또는 2등에 당첨 될 때 까지 랜덤 로또 번호를 계속 생성하여
	 		몇 번 만에 당첨 되었는지 출력해보라
	 		
	 		- 로또 구매자는 번호를 6개 고른다
	 		- 보너스 번호를 제외하고 모두 맞추면 1등
	 		- 보너스 번호를 포함하여 모두 맞추면 2등 
	 	
	*/
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.print("로또번호를 입력하쇼>> ");
		
		int currIndex = 0;
		
		int cnt = 0;
		
		int [] lottoNums = new int[6];
		
		int [] winNums = new int[7];
				

		while(currIndex < 7) {
			int num = (int)(Math.random() * 45 + 1);
			
			boolean repeated = false;
			for (int i = 0; i < currIndex; ++i) {
				if(winNums[i] == num) {
					repeated = true;
					break;
				}
			}
			
			if(!repeated) {
				winNums[currIndex] = num;
				++currIndex;
			}

		}
		
		System.out.println();

		while (cnt < 6) {
			int num1 = (int)(Math.random() * 45 + 1);
			
			boolean picked = false;
			for(int j = 0; j < cnt; ++j) {
				if(lottoNums[j] == num1) {
					picked = true;
					break;
				}
			}
			if(!picked) {
				lottoNums[cnt] = num1;
				++cnt;
			}
		}
		
		for (int i = 0; i < winNums.length; ++i) {
			System.out.print(" " + winNums[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < lottoNums.length; ++i) {
			System.out.print(" " + lottoNums[i]);
		}

		System.out.println();
		
		int tryCnt = 0;
		int count = 0;
		boolean firstWon = false;
		boolean secondWon = false;
		for (int i = 0; i < winNums.length; ++i) {
			for(int j = 0; j < lottoNums.length; ++j) {
				if (winNums[i] == lottoNums[j] && winNums[6] != lottoNums[j]) {
					++tryCnt;
					firstWon = true;
					break;
				}
				if (tryCnt == 1 && winNums[6] == lottoNums[j]) {
					secondWon = true;
					break;
				}
			}
		}

		if(firstWon) {
			if(tryCnt >= 6) {
				System.out.println("1등");
			}
		}
		if(secondWon) {
			System.out.println("2등");
		}
		
		
//		switch(tryCnt) {
//		case 6:
//			System.out.println("1등");
//			break;
//		case 1:
//			System.out.println("5등");
//			break;
//		}


		
	}
	
}
