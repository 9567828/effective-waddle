package myobj.baskin;

public class BaskinGame {
	// 인스턴스 변수는 초기화를 안하면 배열과 같이 기본값 0을 가지고 있음
	int lastNum;
	int currentNum;
	int num;
	
	// 기본생성자 : 매개변수가 아무것도 없는 생성자 (현재 없음)
	// 생성자의 형태가 아무것도 없으면 기본 생성자가 자동으로 생기지만, 
	// 매개변수가 포함된 생성자라도 있으면 기본 생성자가 없다
	
	// 매개변수가 있는 생성자는 기본 생성자가 아니다
	public BaskinGame(int lastNum) {
		this.lastNum = lastNum;
	}
	/**
	 * @param num - 사용자가 게임을 위해 선택한 숫자를 전달해 주세요
	 * @return 
	 * <b>-1</b>: 사용자가 1 ~ 3을 벗어나는 값을 입력하는 경우<br>
	 * <b>-2</b>: 사용자가 최종값을 벗어나는 숫자를 더하려고 하는 경우
	*/
	
	public int next(int num) {
		if(num < 1 || num > 3) {
			return -1;
		} else if (currentNum + num == lastNum) {
			return -2;
		}
		return currentNum += num;
	}
	
	public boolean isEnd() {
		return currentNum == lastNum;
	}

}
