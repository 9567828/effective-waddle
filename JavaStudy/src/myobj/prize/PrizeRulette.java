package myobj.prize;

public class PrizeRulette {

	PrizeList[] win = new PrizeList [360];
	PrizeList[] prize = new PrizeList[5];
	int currIndex = 0;
	
	public int getTotalDegree() {
		int sum = 0;
		for (int i = 0; i < currIndex; ++i) {
			sum += prize[i].getDegree();
		}
		return sum;
	}
	
	public void add(PrizeList prizeList) {
		if (prizeList.getDegree() < 0) {
			System.out.printf("상품 %s 추가불가 [각도음수]", prizeList);
			return;
		}
		if (getTotalDegree() + prizeList.getDegree() > 360) {
			System.out.printf("상품 %s 추가불가 [360도초과]", prizeList);
			return;
		}
		
		System.out.printf("상품 \"%s\" 추가완료", prizeList);
		
		prize[currIndex++] = prizeList;
		update();
	}
	
	public void moidifyDegree(int prizeIndex, int degree) {
		if (prizeIndex >= currIndex || prizeIndex <0) {
			System.out.println("상품수정 불가 [인덱스번호 틀림]");
			return;
		}
		
		if (degree < 0) {
			System.out.printf("상품 %s 수정불가 [각도음수]", prize[prizeIndex].getName());
			return;
		}
	}
	
	public void update() {
		int winIndex = 0;
		for (int i = 0; i < currIndex; ++i) {
			int degree = prize[i].getDegree();
			for (int j = 0; j < degree; ++j) {
				win[winIndex++] = prize[i];
			}
		}
	}
	
	public PrizeList draw() {
		return win[(int)(Math.random() * win.length)];
	}
		
}