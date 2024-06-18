package quiz;

import java.util.Arrays;

import myobj.Fbread;

// 24. 05. 03
// 풀이

public class C04_CountFishBreadT {

	/*
		1. 붕어빵 클래스를 만들어 보세요
		
		- 붕어빵의 속성은 맛, 가격, 품질이 있다 
		- 맛과 품질은 인스턴스 생성시 랜덤으로 결정 됨
		- 가격은 팥 800원, 슈크림 1000원, 민트초코 1200원
		  품질에 따라 가격이 +-100원이 된다 (품질은 상/중/하)
		  
		2. 설계한 클래스를 활용하여 붕어빵을 100개 만들고
		   어떤 맛 붕어빵이 몇 개 있는지 세어보세요 
		
		3. n개의 붕어뺑 배열을 전달하면 모든 붕어빵의 가격이 얼마인지 계산해주는
		   함수를 만들어보세요
		
	*/
	
	public static void main(String[] args) {
		
		// 붕어빵 100개 만들기
		Fbread[] breads = new Fbread[100];
		
		for (int i = 0; i < breads.length; ++i) {
			breads[i] = new Fbread();
		}
		
		// 붕어빵 맛 개수 세기
		int[] flavorCount = new int[Fbread.kindOfFlavors];
		
		for (int i = 0; i < breads.length; ++i) {
			flavorCount[breads[i].flavor] += 1;
		}
		
		System.out.println(Arrays.toString(flavorCount));
		
		// 3. 가격 얼마냐
		System.out.println("총 가격: " + Fbread.getTotalPrice(breads));
	}
}



