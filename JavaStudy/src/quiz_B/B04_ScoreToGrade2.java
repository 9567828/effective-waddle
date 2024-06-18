package quiz_B;

import java.util.Scanner;

// 24.04.22

public class B04_ScoreToGrade2 {

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
		int kor, eng, math;
		
		System.out.print("국어점수: ");
		kor = sc.nextInt();

		System.out.print("영어점수: ");
		eng = sc.nextInt();

		System.out.print("수학점수: ");
		math = sc.nextInt();
		
		boolean cheat = false;

		if(kor < 0 || kor > 100) {
			System.out.println("국어점수 이상");
			cheat = true;
		}
		if(eng < 0 || eng > 100) {
			System.out.println("영어점수 이상");
			cheat = true;
		}
		if(math < 0 || math > 100) {
			System.out.println("수학점수 이상");
			cheat = true;
		}
		
		System.out.println("-------------------------");

		double avg;
		char grades;
		
		if(cheat) {
			grades = 'F';
			System.out.println("점수가 잘못 됐습니다. 0점");
			System.out.printf("등급 '%c' 입니다", grades);
		}
		
		
	}
	
}
