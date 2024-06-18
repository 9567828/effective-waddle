package quiz_B;

import java.util.Scanner;

// 24.04.22

public class B04_ScoreToGrade {

	/*
	 	국어, 영어, 수학 점수를 차례대로 입력 받아 평균 점수를 구한 후에
	 	평균 점수와 등급을 출력해주는 프로그램을 만들어 보세요.
	 	
	 	(※ 각 과목의 유효 점수는 0 ~ 100점 이고,
	 	 유효하지 않은 점수가 하나라도 있다면 평균 점수는 0점, 등급 F로 나와야 한다)
	 	
	 	 * 평균점수로 등급을 냄
	 	 1. 평균점수 90점 이상 A
	 	 2. 평균점수 80점 이상 B
	 	 3. 평균점수 70점 이상 C
	 	 4. 평균점수 60점 이상 D
	 	 그외 F 
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int korean = sc.nextInt();
		
		System.out.print("영어점수: ");
		int english = sc.nextInt();
		
		System.out.print("수학점수: ");
		int math = sc.nextInt();
		
		double average = (korean + english + math) / 3;
		
		
		char grades;

		if (korean < 0 || korean > 100 || english < 0 || english > 100 || math < 0 || math > 100) {
			grades = 'F';
			average = 0;
			System.out.println("점수가 유효하지 않습니다.");
		} else if(average >= 90) {
			grades = 'A';
		} else if (average >= 80) {
			grades = 'B';
		} else if (average >= 70) {
			grades = 'C';
		} else if (average >= 60) {
			grades = 'D';
		} else {
			grades = 'F';
		}
		
		if (average >= 0) {
			System.out.printf("평균점수는 %.2f점 입니다. 등급은 \'%s\' 입니다", average, grades);	
		}else {
			System.out.printf("점수 무효 등급은 \'%s\' 입니다", grades);
			// 이게 출력이 안된다 ㅡㅡ
		}
		
		
	}
	
}
