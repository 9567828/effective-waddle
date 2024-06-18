package myobj.rulette;

public class Rulette2 {
	
	String[] prizes = {"물고기실내화", "아이폰15케이스", "에어프라이어", "신세계상품권(10만원)", "아이패드", "맥북"}; 
	int[] qty = {100, 80, 10, 5, 2, 1};
	int[] price = {5000, 15000, 50000, 100000, 900000, 3000000};
	int totalQty;
	int probability;
	
	public Rulette2() {
		
	}
	
	
	public String[] getPrize() {
		for(int i = 0; i < prizes.length; ++i) {
		}
		return prizes;
		
	}
	
	public int[] getPrice() {
		
		return null;
	}
	
	public int[] getQty() {
		return null;
	}
	
	public int getTotalQty() {
		for (int i = 0; i < qty.length; ++i) {
			totalQty += qty[i];
		}
		return totalQty; 
	}
	
	public int getChancesQty() {
		for (int i = 0; i < prizes.length; ++i) {
			probability = totalQty % 360;
		}
		return probability;
	}
	
	public static void main(String[] args) {
		Rulette2 rul = new Rulette2();

		
	}

}
