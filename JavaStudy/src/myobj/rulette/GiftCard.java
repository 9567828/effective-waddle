package myobj.rulette;

public class GiftCard extends Rulette {
	String name = "신세계상품권";
	int qty = 5;
	int price = 100000;

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
