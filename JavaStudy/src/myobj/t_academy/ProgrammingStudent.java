package myobj.t_academy;

public class ProgrammingStudent extends AcademyStudent {
	String className = "프로그래밍반";
	String[] subjects = {"국어", "영어", "수학", "C언어", "운영체제", "자료구조"};
	int[] scores = new int[subjects.length];
	
	public ProgrammingStudent() {
		for(int i = 0; i < scores.length; ++i) {
			scores[i] = generateRandomScore();
		}
	}
	
	@Override
	public String getClassName() {
		return this.className;
	}
	
	@Override
	public int getTotal() {
		int sum = 0;
		for (int i = 0; i < scores.length; ++i) {
			sum += scores[i];
		}
		return sum;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / (double) scores.length;
	}
	
	@Override
	public String getScores() {
		String str = "";
		for(int i = 0; i < scores.length; ++i) {
			str += String.format("%s: %d\n", subjects[i], scores[i]);
		}
		return str;
	}

}
