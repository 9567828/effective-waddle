package quiz;

public class A01_Info {

	//public static void main() 한 줄씩 출력
	
	public static void main(String[] args) {
		// 방법1: 한 줄씩 출력
		System.out.println("            #### 회비 정보 ####");
		System.out.println("==========================================");
		System.out.println("이름\t나이\t전화번호\t\t회비");
		System.out.println("==========================================");
		System.out.println("홍길동\t\"15\"\t010-123-1234\t￦20,000");
		System.out.println("임꺽정\t\"20\"\t010-234-2345\t￦30,000");
		System.out.println("김말이\t\"28\"\t010-345-3456\t￦50,000");
		System.out.println("------------------------------------------");
		System.out.println("총합계\t\t\t\t￦100,000");
		System.out.println("==========================================");
		
		System.out.println("\n\n");
		
		// 방법2: 문자열 하나로 합쳐서 출력해보기
		System.out.println(
				  "           #### 회비 정보 ####\n"
				+ "==========================================\n"
				+ "이름\t나이\t전화번호\t\t회비\n"
				+ "홍길동\t\"15\"\t010-123-1234\t￦20,000\n"
				+ "임꺽정\t\"20\"\t010-234-2345\t￦30,000\n"
				+ "김말이\t\"28\"\t010-345-3456\t￦50,000\n"
				+ "------------------------------------------\n"
				+ "총합계\t\t\t\t￦100,000\n"
				+ "==========================================\n"
		);

	}

}
