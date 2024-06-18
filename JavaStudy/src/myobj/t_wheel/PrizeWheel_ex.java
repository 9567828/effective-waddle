package myobj.t_wheel;

import java.util.Arrays;

public class PrizeWheel_ex {
	final private static boolean DEBUG_MODE = false;
	// boolean 타입은 값이 2개라(t/f) 어떤 상품에 당첨되었는지 알려주기 힘들다
	// boolean[] win = new boolean[360];
	
	// int를 사용하면 뽑았을 때 몇 번째 상품에 당첨 된지를 알려줄 수 있다
	int[] win = new int[360];

	// n 번째 상품 정보는 해당 배열의 n번째에 넣어놓을 예정
	String[] prizeNames = new String[5];
	int[] prizeValues = new int[5];
	int[] przieQty = new int [5];
	// 상품개수 만큼 확률을 차지하는 각도가 필요하다
	double[] prizeDegree = new double[5];
	
//	boolean[] prizeWin = new boolean[360];
	
	int currPrizeIndex = 0;
	
	public void updateWheel() {
		for(int i = 0; i < win.length; ++i) {
			// 꽝
			win[i] = -1;
		}
		
		int winIndex = 0;
		for (int i = 0; i < currPrizeIndex; ++i) {
			for (int j = 0; j < prizeDegree[i]; ++j) {
				win[winIndex++] = i;
			}
		}
		
		if(DEBUG_MODE) {
			System.out.println("업데이트 된 확률배열의 정보");
			System.out.println(Arrays.toString(win));			
		}
	}
	
	/**
	
	@return -1: 꽝, -2: 당첨되었으나 수량 소진, 그외: 당첨된 상품번호
	
	*/
	
	public int draw() {
		// 뽑았을 때 상품이 무엇인지 출력해주기
		int prizeNum = win[(int)(Math.random() * win.length)];
		if(prizeNum == -1) {
			return -1;
		} else if (przieQty[prizeNum] == 0) {
			return -2; // 수량이 모두 소진
		}
		
		--przieQty[prizeNum];
		
		return prizeNum;
	}
	
//	public double getRate(double prizeNum) {
//		prizeWin[(int) prizeNum] = true;
//		prizeWin[(int) prizeNum] = true;
//		prizeWin[(int) prizeNum] = true;
//		prizeWin[(int) prizeNum] = true;
//		prizeWin[(int) prizeNum] = true;
//		
//		int winCount = 0;
//		for (int i = 0; i < 100; ++i) {
//			int ran = (int)(Math.random() * prizeWin.length);
//			if(prizeWin[ran]) {
//				++winCount;
//			}
//		}
//		return prizeWin.length * 100;
//	}
	
	public void printPrizeInfo(int prizeNum) {
		System.out.printf("%d원 상당의 %s[남은 수량: %d, 당첨확률: %.2f%%]\n", 
				prizeValues[prizeNum], prizeNames[prizeNum], przieQty[prizeNum], prizeDegree[prizeNum] / win.length * 100);
	}
	
	public void addPrize(String name, int value, int qty, int degree) {
		prizeNames[currPrizeIndex] = name;
		prizeValues[currPrizeIndex] = value;
		przieQty[currPrizeIndex] = qty;
		prizeDegree[currPrizeIndex] = degree;
		
		// 상품이 추가할 때 마다 인덱스를 올려준다
		++currPrizeIndex;
		
		updateWheel();
	}
	
	public static void main(String[] args) {
		PrizeWheel_ex wheel = new PrizeWheel_ex();
		
		wheel.addPrize("선풍기", 35000, 35, 20);
		wheel.addPrize("세탁기", 2000000, 10, 5);
		wheel.addPrize("츄파츕스", 100, 5000, 100);
		
		for (int i = 0; i < 100; ++i) {
			int prizeNum;
			switch (prizeNum = wheel.draw()) {
			case -1:
				System.out.println("꽝입니다!");
				break;
			case -2:
				System.out.println("당첨되었지만 수량이 모두 소진 되었습니다! 기회가 한번 더 주어집니다!");
				break;
			default:
				wheel.printPrizeInfo(prizeNum);
				break;
			}
		}
	}
	
}
