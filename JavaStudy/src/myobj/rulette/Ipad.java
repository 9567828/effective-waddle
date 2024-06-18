package myobj.rulette;

public class Ipad extends Rulette {
	String name = "아이패드";
	int qty = 2;
	int price = 900000;

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
}
