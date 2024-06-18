package myobj.rulette;	

public class Rulette3 {
	PrizesGenerator[] prizeList;
	PrizesGenerator[] box;
	int total;
	
	public Rulette3() {
		prizeList = new PrizesGenerator[6];
		
		prizeList[0] = new PrizesGenerator("물고기슬리퍼", 5000, 100);
		prizeList[1] = new PrizesGenerator("아이폰15케이스", 15000, 80);
		prizeList[2] = new PrizesGenerator("에어프라이어", 30000, 10);
		prizeList[3] = new PrizesGenerator("신세계상품권", 10000, 5);
		prizeList[4] = new PrizesGenerator("아이패드", 90000, 2);
		prizeList[5] = new PrizesGenerator("맥북", 3000000, 1);
	}
	
	public int getTotal() {
		for(int i = 0; i < prizeList.length; ++i) {
			total += prizeList[i].qty;
		}
		return total;
	}
	
	public double getRate() {
		int index = 0;
		for(int i = 0; i < prizeList.length; ++i) {
			index = (int) (Math.random() * prizeList.length);
			
		}
		return 1.0;
	}
	
}
