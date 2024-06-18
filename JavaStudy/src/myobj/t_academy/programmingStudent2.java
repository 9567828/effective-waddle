package myobj.t_academy;

public class programmingStudent2 {
//	1. 프로그래밍 반 학생들은
//	   국어, 영어, 수학, C언어, 운영체제, 자료구조 점수가 있다
//	   * 값이 발생할 때 모두 랜덤으로 생성 되어야 한다
	
	// 이름은 바꿀 필요가 없기 때문에 static으로 들어간다
	static String[] lastNamesCandidates = {"김", "이", "박", "최", "안", "한"};
	static String[] firstNamesCandidates = {"영식", "영수", "영철", "영호", "광수", "상철", "영숙", "옥순", "영자", "순자", "정숙", "현숙"};
	
	// 학번은 계속 누적되어야 하는 값
	static int stuCount = 0;
	
	String stuName;
	String stuNum;
	int kor;
	int eng;
	int math;
	int c;
	int op; // operator
	int ds; // data structure
	
	public programmingStudent2() {
		this.kor = getRandomScore();
		this.eng = getRandomScore();
		this.math = getRandomScore();
		this.c = getRandomScore();
		this.op = getRandomScore();
		this.ds = getRandomScore();
		// 서식을 맞춰서 문자열을 생성하는 방법
		// String.format("format", values...): 서식을 활용해 원하는 문자열을 생성하는 메서드
		// 프린트와 달리 생성해서 return을 해준다.
		// 생성자가 돌 때 마다 카운트를 올려준다 ++stuCount; 메인에 for문으로 100번 돌고있음
		this.stuNum = String.format("EZEN%06d", ++stuCount);
		this.stuName = getRandomName2();		
		
	}
	
	// 랜덤 점수를 생성하는데 반복(math.random)이 일어나니까 함수로 만들어준다 (private 등으로도 만들 수 있음)
	// return 으로 값을 출력한다
	public static int getRandomScore() {
		return (int)(Math.random() * 101);
	}
	
	// 스트링 배열을 만들어서 리턴한다
	// getRandomName을 더 짧게 만드는 방법
	public static String selectRandomOne(String[] arr) {
		return arr[(int)(Math.random() * arr.length)];
	}
	
	public static String getRandomName2() {
		return selectRandomOne(lastNamesCandidates)
				+ selectRandomOne(firstNamesCandidates);
	}
	
//	public static String getRandomName() {
//		return lastNamesCandidates[(int)(Math.random() * lastNamesCandidates.length)]
//			   + firstNamesCandidates[(int)(Math.random() * firstNamesCandidates.length)];
//	}
	
	// static이 없으면 현재인스턴트(this.)를 활용해 프린트 할 수 있다 (매개변수를 받지 않아도 된다)
	// static이 있으면 현재 인스턴스를 활용할 수 없는 대신 매개변수로 인스턴스를 전달받아 프린트 할 수 있다
	//         this를 찍지 못하기 때문에 매개변수. 찍고 변수를 넣는다
	public static void printDetatil(programmingStudent2 stu) {
		System.out.println("------------- 성적표 --------------");
		System.out.println("---------------------------------");
		System.out.println("학번: " + stu.stuNum);
		System.out.println("이름: " + stu.stuName);
		System.out.println("---------------------------------");
		System.out.println("국어: " + stu.kor);
		System.out.println("영어: " + stu.eng);
		System.out.println("수학: " + stu.math);
		System.out.println("C언어: " + stu.c);
		System.out.println("운영체제: " + stu.op);
		System.out.println("자료구조: " + stu.ds);
		System.out.println("---------------------------------");
		System.out.println();
	}
	
	// String 타입을 오버라이드 해서 포맷 형식을 바꿔준다
	@Override
		public String toString() {
			return String.format("%s-%s", stuNum, stuName);
		}
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; ++i) {
			programmingStudent2 stu = new programmingStudent2();
			
			// static을 붙였기 때문에 stu.print~~로 하지 않고 클래스 이름을 붙여서 출력한다
			programmingStudent2.printDetatil(stu);
		}
	}
	
}
