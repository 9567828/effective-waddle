package myobj.rulette;

public class IphoneCase extends Rulette {
	String name = "아이폰15케이스";
	int qty = 80;
	int price = 15000;

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
