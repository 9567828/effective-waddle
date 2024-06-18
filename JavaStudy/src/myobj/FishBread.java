package myobj;

public class FishBread {
	int price;
	int menuCount;
	Tastes[] ts = new Tastes [3];
	quality[] qul = new quality [3];
	
	public void tasteAndqulity() {
		for (int i = 0; i < ts.length; ++i) {
			System.out.println(ts[i]);
			for (int j = 0; j < qul.length; ++j) {
				if(i != j) {
					System.out.println(qul[j]);
				}
			}
		}
	}
	
//	public void printInfo() {
//		for (int i = 0; i < menu.length; ++i) {
//			if(menu[i] != null) {
//				System.out.printf("%d = %d\n", menu[i].rb, menu[i].cr, menu[i].mt, 
//						menu[i].tp, menu[i].md, menu[i].bt);				
//			} else {
//				System.out.println(menu[i]);
//			}
//		}
//	}
	
//	void addMenu() {
//		FishBreadMenu toAdd = new FishBreadMenu();
//		
//		toAdd.readbean = readbean;
//		toAdd.cream = cream;
//		toAdd.mint = mint;
//		toAdd.top = top;
//		toAdd.middle = middle;
//		toAdd.bottom = bottom;
//		
//		
//		this.menu[this.menuCount++] = toAdd;
//	}
}

class Tastes {
	String[] taste = {"readbean", "cream", "mint"};
}
class quality {
	String tp = "top";
	String md = "middle";
	String bt = "bottom";
}