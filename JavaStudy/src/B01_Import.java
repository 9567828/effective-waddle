// 24.04.19

//내가 이 소스코드에서 A03_VairableQuiz라는걸 쓸건데 quiz 패키지에 있음
import quiz.A03_VariableQuiz;

// 내가 이 소스코드에서 Scanner라는걸 갖다 쓸건데 java.util 패키지에 있다 (패키지 안에 패키지가 있는 형태이다)
import java.util.Scanner;

public class B01_Import {

	/*
 		# import
 		
 		- 다른 패키지에 속한 다른 클래스를 불러 사용하 위해서 필요한 문법
	*/
	
	public static void main(String[] args) {
		
		// 우리는 만들었던 다른 클래스를 불러 사용할 수 있다
		// null 은 위 메인에 args로 보내는 것
		A06_Print.main(null);
		B00_Scanner.main(null);
		
		// 다른 패키지에 속한 클래스를 부를 때는 패키지 명까지 적어야 한다
		// 다른 패키지에 있는 클래스를 불러올 때는 패키지명.파일명으로 들어가야 함
		quiz_B.B00_AgeCalculator.main(null);
		quiz.A02_SwapValue.main(null);
		
		// 패키지 명을 일일히 쓰기 귀찮을 때 import문을 사용한다
		A03_VariableQuiz.main(null);
	}
}
