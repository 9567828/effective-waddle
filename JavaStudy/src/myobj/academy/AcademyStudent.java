package myobj.academy;

import java.util.Arrays;

public class AcademyStudent {
	char[] lastName = {'김', '이', '박'};
	char[] firstName = {'철', '수', '영', '희', '미', '자'};
	int score;
	double avg;
	int totalScore;
	
	public AcademyStudent() {
		getStudentsName();
		getStudentScore();
	}
	
	public void getStudentsName() {		
		for(int i = 0; i < lastName.length; ++i) {
			for(int j = 0; j < firstName.length; ++j) {
				for(int k = 0; k < j; ++k) {
					if(firstName[j] == firstName[k]) {
						--j;
						break;
					}
//					System.out.printf("%s%s%s\n", lastName[i], firstName[j], firstName[k]);
				}
			}
		}
	}
	
	public void getStudentScore() {
		for(int i = 0; i < 100; ++i) {
			score = (int)(Math.random() * 100 + 1);
		}
	}
	
	public void print() {
		System.out.println(score);
	}
	
	public static void main(String[] args) {
		AcademyStudent s1 = new AcademyStudent();
		
		s1.print();
	}


}
