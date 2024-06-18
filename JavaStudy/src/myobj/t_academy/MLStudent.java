package myobj.t_academy;

//3. 머신러닝반 학생들은
//국어, 영어, 수학, 통계학, 파이썬, NO-SQL 점수가 있다

public class MLStudent extends AcademyStudent {
	String className = "머신러닝반";
	static String[] subjectNames = {"국어", "영어", "수학", "통게학", "파이썬", "NO-SQL"};
	int[] scores = new int[subjectNames.length];
	
	public MLStudent() {
		
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
		return getTotal() / (double)scores.length;
	}
	
	@Override
	public String getScores() {
		String str = "";
		for (int i = 0; i < scores.length; ++i) {
			str += String.format("%s: %d\n", subjectNames[i], scores[i]);
		}
		return str;
	}
}
