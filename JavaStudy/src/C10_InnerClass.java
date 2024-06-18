// 24. 05. 13
public class C10_InnerClass {
	/*
	 	# 클래스 내부에도 클래스를 만들 수 있다
	 	
	 	- 해당 클래스의 인스턴스 변수에 영향을 받는 클래스를 만들 수 있다
	 	- 클래스내부의 스태틱클래스는 인스턴스와는 무관하지만
	 	  스태틱 변수에는 영향을 받을 수 있다
	*/
	int n;
	
	int l = 7;
	static int m = 8;
	
	public C10_InnerClass(int num) {
		this.n = n;
	}
	
	class Bus {
		int fee;
		int num = n;
		int type;
	}
	
	static class Subway {
		int line;
		int color;
	}
	
	public static void main(String[] args) {
//		new Bus(); 뉴버스 안됨
//		바깥 클래스의 실체가 생겨야 내부에 있는 설계도의 실체가 생긴다
//		대문자 . 대문자의 형태가 나타났을 때 이너클래스 라고 생각하면 됨
		C10_InnerClass inner1 = new C10_InnerClass(13);
		C10_InnerClass inner2 = new C10_InnerClass(55);
		
		C10_InnerClass.Bus bus1 = inner1.new Bus();
		C10_InnerClass.Bus bus2 = inner2.new Bus();
		
		System.out.println(bus1.num);
		System.out.println(bus2.num);
		
		bus1 = bus2;
		
		// 클래스 내부의 스태틱 클래스는
		// 바깥 클래스의 인스턴스 없이도 바로 사용할 수 있다
		C10_InnerClass.Subway subway = new C10_InnerClass.Subway();
		System.out.println(subway.line);
		
		
		Candy candy = new CandyFactory(1, 0).getCandy();
		System.out.println(candy.flavor);
		
	}
}

class Candy {
	String flavor;
}

class CandyFactory {
	String[] koreanNames = {"레못맛", "딸기맛", "사과맛"};
	String[] englishNames = {"Lemon", "StrawBerry", "Apple"};
	
	int language;
	int fnum;
	
	private class MyCandy extends Candy {
		public MyCandy() {
			switch (language) {
			case 0:
				flavor = koreanNames[fnum];
				break;
			default:
				flavor = englishNames[fnum];
				break;
			}
		}
		
	}
	
	public CandyFactory(int fnum, int language) {
		this.fnum = fnum;
		this.language = language;
	}
	
	public Candy getCandy() {
		return new MyCandy();
	}
	
}