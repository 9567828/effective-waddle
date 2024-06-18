package myobj.rulette;

public class Fishflop extends Rulette {
	String name = "물고기슬리퍼";
	int qty = 100;
	int price = 5000;

	@Override
	public String getPrize() {
		return name;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
	@Override
	public int getQty() {
		return qty;
	}
	
	@Override
	public int checkQty() {
		for (int i = 0; i < 6; ++i) {
			--qty;			
		}
		return qty;
	}
}
