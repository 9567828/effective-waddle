package myobj.rulette;

public class Rulette {
	int probability;
	int totalQty;

	public String getPrize() {
		return null;
	}
	
	public int getPrice() {
		return -1;
	}
	
	public int getQty() {
		return -1;
	}
	
	public int getTotalQty() {
		for (int i = 0; i < 6; ++i) {
			totalQty += getQty();			
		}
		return totalQty;
	}
	
	public int checkQty() {
		return -1;
	}
	
	public double getChaces() {
		return probability %= totalQty;
	}
	
	public void printDetail(Rulette rul) {
		System.out.println("경품: " + rul.getPrize());
		System.out.println("가치: " + rul.getPrice());
		System.out.println("개수: " + rul.getQty());
	}
	
	public static void main(String[] args) {
		Rulette rul = new Rulette();
		
		rul.printDetail(rul);
	}

}
