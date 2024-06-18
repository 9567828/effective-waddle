package myobj.prize;

public class PrizeList {
	private String name;
	private int value;
	private int qty;
	private int degree;
	
	public PrizeList(String name, int value, int qty, int degree) {
		this.name = name;
		this.value = value;
		this.qty = qty;
		this.degree = degree;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getQty() {
		return qty;
	}
	
	public int getDegree() {
		return degree;
	}
	
	@Override
	public String toString() {
		return String.format("%d원 상당의 상품 %s에 당첨 되셨습니다", this.value, this.name);
	}
	
}