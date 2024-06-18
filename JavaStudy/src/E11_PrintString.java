// 24. 05. 30

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class E11_PrintString {

	/*
		# PrintStream, PrintWriter
		
	 	- 문자를 훨씬 편리하게 출력할 수 있는 메서드들이 추가된 클래스
	 	- println(), printf(), print() 등의 메서드를 사용할 수 있다
	 	- Beffered -> 성능 증가
	 	- Print -> 편리함 증가 
	*/
	
	public static void main(String[] args) {
		File f = new File("myfiles/print.txt");
		
		try (
			// false = 덮어쓰기 가능
			FileOutputStream fout = new FileOutputStream(f, false);
			PrintStream out = new PrintStream(fout);
		
		) {
			out.printf("%s: %d\n", "Age", 25);
			out.println("Hello, world~~~~!");
			out.println("한그르르르르르를");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
