// 24. 05. 27
public class E01_Exception {

	/*
 		# 예외 (Exception)
 		
 		- 우리가 에러라고 생각했던 빨간 글씨들을 예외라고 부른다
 		- 프로그래머는 발생할 수 있는 예외에 대해서 미리 예상하고 대비해둘 수 있다 (예외처리)
 		- 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러라고 부른다
 		
 		# 예외 처리 (try-catch)
 		
 		- 예외가 발생할 수도 있는 코드를 try문 내부에 포함시킨다
 		- try문 내부에서 예외가 발생하지 않으면 catch문으로 이동한다
 		- try문 내부에서 예외가 발생하는 경우 발생한 예외에 대한 catch문으로 이동한다
 		- 예외가 발생했을 때 예외처리가 되어있지 않은 경우 프로그램이 강제종료 되지만
 		  해당 예외에 대한 처리가 되어있는 경우 프로그램이 강제종료되지 않는다
 		- 예외가 발생하여 해당 catch문에 도착할 때 발생한 예외에 대한 정보를 담고 있는
 		  인스턴스가 함께 도착한다
 		- 예외처리를 하지 않았을 때의 기본 동작은 e.printStackTrace()후 강제 종료이다
 		
 		# finally
 		
 		- try문 내부에서 예외가 발생하든 안하든 무조건 실행하게 되는 문법
 		
	*/
	
	public static void main(String[] args) {
		
		try {
			int size = 10; // 발생가능한 예외 1
			int[] arr = new int[size];
			System.out.println(arr[-1]); // 발생 가능한 예외 2
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 잘못된 숫자입니다");
		} catch (java.lang.ArithmeticException e) {
//			System.out.println(e.getLocalizedMessage());
			// 예외가 발생했을 당시의 스택 상황을 출력하는 메서드 (예외처리 기본동작)
			e.printStackTrace();
			
			// 프로그램을 강제로 종료한다 (예외처리 기본 동작2)
			// 예외 처리를 안한 것과 다름이 없다.
			// -1: 비정상 종료를 알려주는 의미
			System.exit(-1);
		}
		
		// 스택
		try {
			System.out.println(plus(10));
			
		} catch (java.lang.ArithmeticException e) {
			e.printStackTrace();
		}
		
		
		try {
			int[] nums = new int [3];
			nums[(int)(Math.random() * 5)] = 7;
			
		} catch (Exception e) {
			// Exception은 모든 예외객체의 조상 클래스이기 때문에
			// 모든 예외가 이 catch문으로 도착할 수 있다
			System.out.println("예외가 발생했다");
			
		} finally {
			// try문 내부에서의 예외 발생 여부와 관계없이 무조건 실행하고 싶은 코드를
			// finally에 적는다
			System.out.println(" /)/)");
			System.out.println("( ..)");
			System.out.println("( >$");
		}
		
		System.out.println("프로그램이 정상 종료되었습니다.");
	}
	
	public static int plus(int a) {
		return plus2(a + 10);
	}
	
	public static int plus2(int a) {
		return plus3(a + 10);
	}

	public static int plus3(int a) {
		return a / 10;
	}
	
}
