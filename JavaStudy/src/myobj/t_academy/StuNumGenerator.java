package myobj.t_academy;

// 학생 번호 생성기
public class StuNumGenerator {
	String academyName;
	
	// 학번은 계속 누적되어야 하는 값
	int generateCount = 1;
	public StuNumGenerator(String academyName) {
		this.academyName = academyName;
	}
	
//	academyName앞에 this. 이 생략 된 것
	public String generate() {
		return String.format("%s%06d", academyName, generateCount++);
	}

}
