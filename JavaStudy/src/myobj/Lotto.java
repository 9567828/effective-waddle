package myobj;

import java.util.Arrays;

public class Lotto {
	public static int winNum[] = new int[7];
	public static int userNum[] = new int[6];
	
	public Lotto() {
//		getNums();
	}
	
	public void genLottoNums() {
		for (int i = 0; i < winNum.length; ++i) {
			winNum[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; ++j) {
				if (winNum[i] == winNum[j]) {
					--i;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(winNum));
	}
	
	
	
	public static void main(String[] args) {
		Lotto check = new Lotto();
	}

}
