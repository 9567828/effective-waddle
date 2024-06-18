package myobj.t_wheel;

public class PrizeWheel {
	
	// 돌림판의 확률을 결정하는 배열
	Prize[] win = new Prize[360];
	
	// 돌림판의 상품 목록 배열
	Prize[] prizeList = new Prize[5];
	int currIndex = 0;
	
	// 총 각도가 360도를 넘는 지 확인하기 위한 메서드
	private int getTotalDegree() {
		int sum = 0;
		for (int i = 0; i < currIndex; ++i) {
			sum += prizeList[i].getDegree();
		}
		return sum;
	}
	
	// prize를 추가 했을 때 총 각도가 360도를 넘으면 안된다
	public void add(Prize prize) {
		if(prize.getDegree() < 0) {
			System.out.printf("추가하려는 상품 \"%s\"의 각도가 음수\n", prize);
			return;
		} 
		
		if (getTotalDegree() + prize.getDegree() > 360) {
			System.out.printf("\"%s\"를 추가하지 못했음. (각도 초과!)\n", prize);
			return; // 메서드 강제종료 (void 에서만)
		}
		
		prizeList[currIndex++] = prize;
		// 상품 추가할 때 마다 업데이트를 진행하겠다
		update();
	}
	
	// prize를 수정했을 때 총 각도가 360도를 넘으면 안된다
	// 몇 번째 상품의 각도를 수정할거냐?
	public void modifyDegree(int prizeIndex, int degree) {
		if (prizeIndex >= currIndex || prizeIndex < 0) {
			System.out.println("[WARN] 상품수정 도중 에러가 발생 했습니다. (인덱스가 올바르지 않음)");
			return; // 현재 메서드 강제종료
		}
		
		// [연습] 수정하려는 prize의 각도가 올바른지에 대한 처리
		
//		if (degree < 0) {
//			System.out.printf("수정하려는 상품 %s의 각도가 음수입니다", prizeList[prizeIndex]);
//			return;
//		}
//		if (getTotalDegree() + degree > 360) {
//			System.out.printf("상품 %s 각도 수정 실패. 총 각도초과", prizeList[prizeIndex]);
//			return;
//		}
//		if (degree > 0) {
//			System.out.printf("상품 %s 각도 %d 수정완료", prizeList[prizeIndex], degree);
//			return;
//		}
		
//		 풀이
		
		Prize toModify = prizeList[prizeIndex];
		
		if (degree < 0) {
			System.out.println("[ERROR] 수정하려는 각도가 음수입니다");
			return;
		} else if (getTotalDegree() - toModify.getDegree() + degree > 360) {
			System.out.printf("[ERROR]\"%s\"의 각도를 %d에서 %d로 수정할 수 없습니다. (360도초과)\n", 
					toModify, toModify.getDegree(), degree);
			return;
		}
		
		System.out.printf("\"%s\"의 각도(%d)수정 완료\n", toModify, degree);
		toModify.setDegree(degree);
		// 디그리 수정을 전달 받으면 업데이트를 진행한다
		update();
	}
	
	public void update() {
		int winIndex = 0;
		for (int i = 0; i < currIndex; ++i) {
			int degree = prizeList[i].getDegree();
			for (int j = 0; j < degree; ++j) {
				win[winIndex++] = prizeList[i];
			}
		}
	}
	
	public Prize draw() {
		return win[(int)(Math.random() * win.length)];
	}
}
