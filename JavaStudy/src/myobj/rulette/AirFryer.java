package myobj.rulette;

public class AirFryer extends Rulette {
	String name = "에어프라이어";
	int qty = 10;
	int price = 30000;

	@Override
	public String getPrize() {
		return this.name;
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
