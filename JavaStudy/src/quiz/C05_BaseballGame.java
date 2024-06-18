package quiz;

import myobj.BaseBallRule;

public class C05_BaseballGame {
	
	/*
		# 숫자 야구 게임 만들기
		
		1. 게임이 시작되면 정답이 랜덤으로 생성된다
		   (정답은 랜덤 4자리의 중복없는 숫자)
		
		2. 플레이어는 9번의 기회가 주어지고 4자리의 숫자를 마음대로 입력할 수 있다
		
		3. 플레이어가 입력한 숫자와 위치가 정답의 것과 모두 일치하면 스트라이크
		
		4. 플레이어가 입력한 숫자는 일치하고 위치가 다르면 볼
		
		5. 9번의 기회 안에 모든 숫자와 위치를 맞추면 사용자의 승리
		
		6. 모든 기회 소진 시 플레이어의 패배
		
		ex> 정답 2591
		    플레이어 - 2988 입력하면 1스트라이크 1볼
	*/
	
	public static void main(String[] args) {
		BaseBallRule baseballGame = new BaseBallRule();
		
		baseballGame.enterAnswer("2468");
		System.out.println(baseballGame.makeBaseBallNum(0));
		
		
	}

}
