package quiz;

import myobj.rulette.AirFryer;
import myobj.rulette.Fishflop;
import myobj.rulette.GiftCard;
import myobj.rulette.Ipad;
import myobj.rulette.IphoneCase;
import myobj.rulette.Macbook;
import myobj.rulette.Rulette;

// 25.05.10

public class C09_PrizeDraw {

	/*
	 	돌림판을 돌려서 경품을 추첨하는 프로그램을 만들어보세요
	 	
	 	1. 경품들은 경품의 보유 가치와 한정된 수량이 있다
	 	
	 	2. 돌림판 인스턴스를 생성한 후 돌림판에 여러 종류의 경품을 추가할 수 있어야 한다
	 	
	 	   돌림판 돌 = new 돌림판();
	 	   돌.add(경품);
	 	
	 	3. 돌림판 인스턴스에 추가되어 있는 경품들의 당첨 확률을 수정할 수 있어야 한다
	 	   돌림판의 각도에 따라 확률이 달라진다
	 	
	 	4. 만약 수량 모두 소진 된 상품에 걸린다면 돌림판을 다시 돌린다
	*/
	public static void main(String[] args) {
		for (int i = 0; i < 1; ++i) {
			Rulette rul;
			
			switch ((int)(Math.random() * 6)) {
				case 0:
					rul = new AirFryer();
					break;
				case 1:
					rul = new Ipad();
					break;
				case 2:
					rul = new IphoneCase();
					break;
				case 3:
					rul = new GiftCard();
					break;
				case 4:
					rul = new Macbook();
					break;
				default:
					rul = new Fishflop();
					break;
			}
			rul.printDetail(rul);
		}
	}
}
