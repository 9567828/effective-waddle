package quiz_B;


public class B10_GugudanT {
	
	/*
	 	1. 구구단을 다음과 같이 가로로 출력해보세요
	 	
	 	2단: 2x1=2 2x2=4 2x3=6
	 	3단: 3x1=3 3x2=6 ...
	 	4단: ...
	 	
	 	2. 구구단을 다음과 같이 세ㅐ로로 출력해보세요
	 	
 		2단		3단		4단
 		2x1=2	3x1=3	4x1=4 ...
 		2x2=4	3x2=6	4x2=8 ...
 		...
	*/
	
	public static void main(String[] args) {
		
		for(int dan = 2; dan <= 9; ++dan) {
			System.out.print(dan + "단: ");
			for(int gop = 1; gop <=9; ++gop) {
				System.out.printf("%d x %d = %-4d ", dan, gop, dan * gop);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
		
		for (int gop = 0; gop <= 9; ++gop) {
			for (int dan = 2; dan <= 9; ++dan) {
				if (gop == 0) { // 한 줄을 추가하기 위해서 0 조건을 넣은것
					System.out.print(dan + "단\t\t");
				} else {
					System.out.printf("%d x %d = %d\t", dan, gop, dan * gop);					
				}
			}
			System.out.println();
		}
		
	}
}