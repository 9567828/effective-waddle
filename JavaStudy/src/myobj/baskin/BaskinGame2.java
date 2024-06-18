package myobj.baskin;

public class BaskinGame2 extends BaskinGame{
	// 부모 클래스에 생략 가능한 기본 생성자가 존재하지 않는 경우에는
	// 생략이 불가능 하여 반드시 명시적으로 부모의 생성자를 호출해줘야 한다
	public BaskinGame2() {
		super(31);
	}
	public BaskinGame2(int num) {
		super(num);
	}
	
	@Override
	public int next(int num) {
		int diff = num - currentNum;
		if(diff < 1 || diff > 3) {
			return -1;
		} else if (num > lastNum) {
			return -2;
		}
		return currentNum = num;
	}
	
//	예제 받은 숫자로 나타내기
//	public int next(int num) {
//	if(currentNum + 1 > num || currentNum + 3 < num) {
//		return -1;
//	} else if (num == lastNum) {
//		return -2;
//	}
//	return currentNum = num;
//}
}
