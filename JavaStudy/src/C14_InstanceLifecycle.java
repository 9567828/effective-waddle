// 24. 05. 13
// 순서대로 실행된다

public class C14_InstanceLifecycle {
	int [] arr = new int[10];
	
	static {
		// 스태틱 블록
		System.out.println("스태틱블록1 실행됨");
		
		// 공동영역에 있는 인스턴스 변수는 static안에서 수정할 수 없다.
//		arr[0] = 10;
	}

	static {
		// 스태틱 블록
		System.out.println("스태틱블록2 실행됨");
	}
	
	{
		// 인스턴스 블록
		System.out.println("인스턴스블록1 실행됨");
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = i * 10;			
		}
	}
	
	{
		// 인스턴스 블록
		System.out.println("인스턴스블록2 실행됨");
	}
	
	public C14_InstanceLifecycle() {
		// 생성자
		System.out.println("생성자 실행됨");
	}
	
	public static void main(String[] args) {
		new C14_InstanceLifecycle();
	}
}
