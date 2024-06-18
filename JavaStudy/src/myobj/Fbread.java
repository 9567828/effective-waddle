package myobj;
// 풀이

public class Fbread {
	// 붕어빵을 많이 찍어내더라도 일정해야 하는 값 (final 최종확정으로 수정 불가)
	final static String [] flavorNames = {"팥","슈크림","민트초코"};
	final static int[] defaultPrices = {800, 1000, 1200};
	final static String [] qualityNames = {"상(잘익음)","중(보통)","하(덜익음)"};
	final static int[] qualityPrices = {100, 0, -100};
	
	public final static int kindOfFlavors = flavorNames.length;  
	
	// 아래 랜덤으로 결정 된 숫자로 가격과 순서를 맞춘다
	public int flavor;
	public int quality;
//	int price;
//	가격은 맛과 품질로 정해지기 때문에 없어도 된다
	
	public Fbread() {
		flavor = (int)(Math.random() * flavorNames.length);
		quality = (int)(Math.random() * qualityNames.length);
	}
	
	public int getPrice() {
		return defaultPrices[flavor] + qualityPrices[quality];
	}
	
	// 붕어빵 관련 함수이므로 붕어빵 클래스 내부에 배치하면 나중에 찾기 편하다
	public static int getTotalPrice(Fbread[] breads) {
		int sum = 0;
		for (int i = 0; i < breads.length; ++i) {
			sum += breads[i].getPrice();
		}
		return sum;
	}
}
