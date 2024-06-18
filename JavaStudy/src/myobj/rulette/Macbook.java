package myobj.rulette;

public class Macbook extends Rulette {
	String name = "맥북";
	int qty = 1;
	int price = 3000000;

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
