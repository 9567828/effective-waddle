package quiz;

import java.util.Scanner;

import myobj.PirateRule2;

public class C05_PirateGame2 {

	/*
		통아저씨 게임을 만들어보세요
		
		1. 게임이 시작되면 꽝 자리가 정해진다
		
		2. 플레이어는 아저씨가 튀어나올 때 까지 돌아가면서 계속 자리를 선택해야 한다
		   (플레이어는 4명으로 고정한다)
		
		3. 칼을 찌를 수 있는 홈은 20개가 있고 그 중 4개가 꽝이 된다
		   (꽝의 위치는 매 판 시작 시 랜덤으로 설정된다)
		
		4. 아저씨가 발사되면 해당 플레리어의 점수를 깎고 나머지의 점수를
		   찌르는데 성공한 횟수에 비례하여 증가시킨다
		
		5. 게임을 그만하겠다고 할 시 모든 플레이어의 최종 점수와 순위를 출력해준다
		   순위에 따라 소지금이 변동 된다
		   (1위 +1000원, 2위 +500원, 3위 -500원, 4위 -1000원)
		
		6. 게임을 그만하겠다고 하거나 또는 한 사람의 소지금이 -가 된다면 게임이 종료 된다
		   게임이 종료 되면서 최종 스코어를 출력해준다
		   (이름, 점수, 남은 소지금(+얼마 벌었나) 등)
	*/
	
	public static void main(String[] args) {
		PirateRule2 user1game = new PirateRule2();
		PirateRule2 user2game = new PirateRule2();
		PirateRule2 user3game = new PirateRule2();
		PirateRule2 user4game = new PirateRule2();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			user1game.printAnswer();
			
			
			user1game.addResult("p1", 0, 0);
			user1game.printGameInfo();
			
			user2game.addResult("p2", 0, 0);
			user3game.addResult("p3", 0, 0);
			user4game.addResult("p4", 0, 0);
			
			System.out.print("p1 숫자입력0~9까지>> ");
			int a = sc.nextInt();
			user1game.getNumber(a);

			System.out.print("p2 숫자입력0~9까지>> ");
			int b = sc.nextInt();
			user1game.getNumber(b);
			
			System.out.print("p3 숫자입력0~9까지>> ");
			int c = sc.nextInt();
			user1game.getNumber(c);
			
			System.out.print("p4 숫자입력0~9까지>> ");
			int d = sc.nextInt();
			user1game.getNumber(d);
			
		}

	}
	
}