package myobj.academy;

import java.util.Arrays;

public class MachineLearingClass extends Academy {
	int statsScore;
	int pythonScore;
	int sqlScore;
	int[] subjects = new int[6];
	
	public MachineLearingClass() {
		super();
		getScores();
	}
	
	public MachineLearingClass(String subjectName) {
		super(subjectName);
	}
	
	public void getScores() {
		super.korScore = (int)(Math.random() * 101);
		super.engScore = (int)(Math.random() * 101);
		super.mathScore = (int)(Math.random() * 101);
		statsScore = (int)(Math.random() * 101);
		pythonScore = (int)(Math.random() * 101);
		sqlScore = (int)(Math.random() * 101);
	}
	
	public static void main(String[] args) {
		MachineLearingClass mc = new MachineLearingClass();
		
		mc.getScores();
	}
}
