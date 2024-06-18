package myobj.t_wheel;

public class PrizeDrawConsole {

	public static void main(String[] args) {
		PrizeWheel wheel = new PrizeWheel();
		
		wheel.add(new Prize("에어컨", 3000000, 5, 3));
		wheel.add(new Prize("냉장고", 4000000, 3, 2));
		wheel.add(new Prize("츄파츕스", 100, 500, 100));
		
		for (int i = 0; i < 1000; ++i) {
			Prize prize = wheel.draw();
			
			if (prize == null) {
				continue;
			}
			if (prize.getQty() != 0) {
				prize.minusQty();
				System.out.printf("[%s]을/를 뽑았습니다! (남은 수량: %d개, 당첨확률: %.2f%%)\n", 
						prize, prize.getQty(), prize.getDegree() / 360.0 * 100);
			} else {
				System.out.println("[" + prize + "] 을/를 뽑았지만 수량이 모두 소진 되어 다시 뽑아야 합니다");
				--i;
			}
		}
	}
}
