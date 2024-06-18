package myobj.rulette;

// 경품의 보유가치와 한정 수량이 있다
public class PrizesGenerator {
	String name;
	int price;
	int qty;
	
	public PrizesGenerator(String name, int price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return String.format("[%s / %d / %d]", name, qty, price);
	}
}

