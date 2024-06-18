package myobj.t_academy;

// 학생으 정보만 들어간다
public class AcademyStudent {
	// static으로 두고 private으로 숨겨둔다
	private static NameGenerator nameGen = new NameGenerator();
	private static StuNumGenerator stunumGen = new StuNumGenerator("EZEN");
	
	// 인스턴스 변수에 직접 접근하는 것 보다는 getter를 생성하여 읽을 수 있게 해두는 것이
	// 인스터는 변수의 부분별한 수정을 박는 방법이다
	private String stuName;
	private String stuNum;

	protected AcademyStudent() {
		this.stuName = nameGen.generate();
		this.stuNum = stunumGen.generate();
	}
	
//	성적표 메서드
//	리턴이 필요없을 때 void
	public static void printDetail(AcademyStudent stu) {
		System.out.println("------------- 성적표 --------------");
		System.out.println("---------------------------------");
		System.out.println("학번: " + stu.stuNum);
		System.out.println("이름: " + stu.stuName);
		System.out.println("반: " + stu.getClassName());
		System.out.println("---------------------------------");
		System.out.println(stu.getScores());
		System.out.println("---------------------------------");
		System.out.println("총점 " + stu.getTotal());
		System.out.printf("평균 %.2f\n" , stu.getAvg());
		System.out.println("등급 " + stu.getGrade());
		System.out.println("---------------------------------");
		System.out.println();
	}
	
//	퍼블릭은 쓰고 싶지 않고 상속받은 친구들까지 사용하려면 프로텍티드를 넣어준다 (private은 본인만 쓸수 있어서 안됨)
//	디폴트도 사용 가능하지만 외부에서는 사용불가
	protected static int generateRandomScore() {
		return (int)(Math.random() * 101);
	}
	
//	읽는 것은 가능하다
	public String getStuName() {
		return this.stuName;
	}
	
	public String setStuNum() {
		return this.stuNum;
	}
	
//	학생은 모두 공통적으로 과목별점수/총점/평균/등급을 알 수 있는 기능이 있다
//	하지만 세부적인 구현은 모두 달라야 한다 -> 상속 받아서 오버라이드 해서 쓰겠다
	public String getScores() {
		return null;
	}
	
	public int getTotal() {
		return -1;
	}
	
	public double getAvg() {
		return -1.0;
	}
	
	public String getClassName() {
		return null;
	}
	
	public String getGrade() {
//		현재 인스턴스가 무엇인지에 따라 오버라이딩 된 getAvg()를 가져다 사용한다
		double avg = getAvg();
		
		if (avg >= 90) {
			return "A";
		} else if (avg >= 80) {
			return "B";
		} else if (avg >= 70) {
			return "C";
		} else if (avg >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; ++i) {
			AcademyStudent stu = new AcademyStudent();
			
			System.out.println(stu.stuName);
			System.out.println(stu.stuNum);
		}
	}
	
}
