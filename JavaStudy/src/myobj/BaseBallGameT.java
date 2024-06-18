package myobj;
// 풀이

import java.util.Arrays;

public class BaseBallGameT {
	
	int[] answer = new int[4];
	int chance = 9;
	
	public BaseBallGameT() {
		// 이 함수를 실행하면 정답이 초기화 된다(아래 메서드)
		genAnswer();
	}
	
	// 실행하면 새로운 정답으로 초기화 되는 메서드
	void genAnswer() {
		for (int i = 0; i < answer.length; ++i) {
			answer[i] = (int)(Math.random() * 10);
			
			// 중복을 제거하는 방법 i == j가 같으면 --i로 i 증감을 막는다
			for (int j = 0; j < i; ++j) {
				if (answer[i] == answer[j]) {
					--i;
					break;
				}
			}
		}
	}
	
	public void printAnswer() {
		System.out.println("정답: " + Arrays.toString(answer) + "입니다.");
	}
	
	// 메서드(함수) 오버로딩 ▼ 밑에 있는 함수를 가지고 와서 사용한다
	public BaseballGameResultT guessNumber(int[] guessNum) {
		int[] result = guessNumber(guessNum[0], guessNum[1], guessNum[2], guessNum[3]);
		
		return new BaseballGameResultT(result[0], result[1]);
	}
	
	// 숫자를 넣으면 스트라이크 인지 볼인지
	public int[] guessNumber(int a, int b, int c, int d) {
		int[] result = {0, 0};
		
		for (int i = 0; i < answer.length; ++i) {
			if(answer[i] == a) {
				if (i == 0) {
					++result[0]; // 스트라이크
				} else {
					++result[1]; // 볼			
				}
			}
			if(answer[i] == b) {
				if (i == 1) {
					++result[0];
				} else {
					++result[1];
				}
			}
			if(answer[i] == c) {
				if (i == 2) {
					++result[0];
				} else {
					++result[1];
				}
			}
			if(answer[i] == d) {
				if (i == 3) {
					++result[0];
				} else {
					++result[1];
				}
			}
		}
		
		return result;
	}
	
	// 위의 if문을 줄여본 것 (풀이 아님)
	public int[] guessNumber2(int a, int b, int c, int d) {
		int[] result = {0, 0};
		int [] userArr = {a, b, c, d};

		for (int i = 0; i < answer.length; ++i) {
			for (int j = 0; j < userArr.length; ++j) {
				if(answer[i] == userArr[j]) {
					if(i == j) {
						++result[0];
					} else {
						++result[1];
					}
				}
			}
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
	
	// 분리를 하는 것이 좋다
	// chance라는 인스턴스 변수를 다른 클래스에서 함부로 수정하게 두기보다는
	// 내가 정해놓은 방식으로만 움직일 수 있게 메서드에만 public을 달아두는 것이 좋다
	public void minusChane() {
		--this.chance;
	}
	
	// 변수에 직접 변화를 주지 않고 새로운 값으로 올리는 방법
	public int getChance() {
		return this.chance;
	}
	
}
