package myobj.academy;

import java.util.Arrays;

public class Academy {
	char grades;
	String classRoomName;
	String subjectName;
	int[] studentsNum = new int [20];
	int[] studentsID = new int [studentsNum.length];
	int korScore;
	int engScore;
	int mathScore;
	
	public Academy() {
		getStudents();
		getStudentsId();
	}
	
	public Academy(String subjectName) {
		this.subjectName = subjectName;
	}
	
	void getStudents() {
		for(int i = 0; i < studentsNum.length; ++i) {
			studentsNum[i] = (int)(Math.random() * studentsNum.length);
			
			for(int j = 0; j < i; ++j) {
				if(studentsNum[i] == studentsNum[j]) {
					--i;
					break;
				}
			}
		}
	}
	
	public void getStudentsId() {
		for(int i = 0; i < studentsNum.length; ++i) {
			studentsID[i] = i + 1;
		}
	}
	
	public void print() {
		System.out.println(Arrays.toString(studentsID));
	}
	
	public static void main(String[] args) {
		Academy a1 = new Academy();
			a1.print();
	}
}
