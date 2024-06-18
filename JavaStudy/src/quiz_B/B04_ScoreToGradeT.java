package quiz_B;

import java.util.Scanner;

// 24.04.22
// 선생님 풀이

public class B04_ScoreToGradeT {

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
		
		Scanner sc = new Scanner(System.in); // Ctrl + Shift + O
		// 변수 선언을 위로 몰고 아래에 초기화 하는 것이 올바른 코드
		int kor, eng, math;
		
		System.out.print("국/영/수 점수입력 > ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		 // || eng < 0 || eng > 100 || math < 0 || math > 100
		// 아래 문제를 else if를 이으면 첫 번째 문제만 확인 된다

		// 이상한 값의 존재 여부를 판단해 준다 (이상한 값이 있을 때 true로 변경할 예정인 변수)
		boolean cheat = false;
		
		if (kor  < 0 || kor > 100) {
			System.out.println("국어점수가 이상하다");
			cheat = true;
		} 
		if (eng < 0 || eng > 100) {
			System.out.println("영어점수가 이상하다");
			cheat = true;
		}
		if (math < 0 || math > 100) {
			System.out.println("수학점수가 이상하다");			
			cheat = true;
		}

		
		double avg;
		char garde;
		
		// 이상한 점수가 없으면 평균점수를 계산
		// 이상한 점수가 있으면 그냥 점수를 넣음
		
		if (cheat) {
			avg = 0;
			garde = 'F';
			
		} else {
			avg = (kor + eng + math) / 3.0; // 평균 점수를 구할 때는 실수로 나눈다 (0.0)
			
			if (avg >= 90) {
				garde = 'A';
			} else if (avg >= 80) {
				garde = 'B';
			} else if (avg >= 70) {
				garde = 'C';
			} else if (avg >= 60) {
				garde = 'D';
			} else {
				garde = 'F';
			}
		}
		
		if (cheat) {
			System.out.println("점수 오류로 인해 0점 처리 되었습니다");
			System.out.printf("등급은 \'%c\'입니다 ",garde);
		} else {
			System.out.printf("평균 점수 '%.2f'점으로 '%c'등급입니다.\n", avg, garde);
		}
		
	}

	
}
