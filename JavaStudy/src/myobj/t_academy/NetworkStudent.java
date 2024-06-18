package myobj.t_academy;

public class NetworkStudent extends AcademyStudent {
	// 생성자를 넣어서 부모클래스 호출(super())을 넣어준다
	// 상속 받아서 오버라이드 해야 할 것 들을 찾아라
	String className = "네트워크반";
	int kor;
	int eng;
	int linux;
	int network;
	int ccna;
	
	public NetworkStudent() {
		super();
		kor = generateRandomScore();
		eng = generateRandomScore();
		linux = generateRandomScore();
		network = generateRandomScore();
		ccna = generateRandomScore();
	}
	
	@Override
	public String getClassName() {
		return this.className;
	}
	
	@Override
	public int getTotal() {
		return kor + eng + linux + network + ccna;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 5.0;
	}
	
	@Override
	public String getScores() {
		return String.format("국어: %d\n영어: %d\n리눅스: %d\n"
				+ "네트워크: %d\nCCNA: %d\n", kor, eng, linux, network, ccna);
				
	}

}
