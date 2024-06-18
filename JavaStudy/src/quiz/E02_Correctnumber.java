package quiz;

import java.util.Arrays;
import java.util.Scanner;

// 24. 05. 27

public class E02_Correctnumber {
	/*
	 	예외처리 방식을 사용하여 다음을 구현하세요
	 	
	 	1. 사용자가 중복없는 네개의 숫자를 한 글자씩 입력해야 한다
	 	
	 	2. 사용자가 입력한 숫자가 0 ~ 9 사이의 숫자가 아닌 경우 예외가 발생해야 한다
	 	
	 	3. 사용자가 입력한 숫자가 이미 입력했던 숫자인 경우 예외가 발행해야 한다
	 	
	 	4. 숫자 4개를 모두 입력하고 나면 입력했던 숫자를 다시 한 번 하나씩 입력하여 확인해야 한다
	 	
	 	5. 사용자가 입력했던 숫자와 이번에 입력한 숫자가 다르다면 예외가 발생해야 한다
	*/
	
	public static int[] getNumber(int a, int b, int c, int d) throws CheckNumber, CheckDuplication  {
		int[] num = {a, b, c, d};
		
		for (int i = 0; i < num.length; ++i) {
			if (num[i] < 0 || num[i] > 9) {
				throw new CheckNumber();
			}
		}
		
		for (int i = 0; i < num.length; ++i) {
			for (int j = i + 1; j < num.length; ++j) {
				if (num[i] == num[j]) {
					throw new CheckDuplication();
				}
			}
		}
		
		return num;
	}
	
	public static void compareNumber(int a, int b, int c, int d, int[] getNumber) 
						throws CheckTwice
	{
		int[] num = {a, b, c, d};
		
//		if (!Arrays.equals(num, getNumber)) {
//			throw new CheckOrder();
//		}
//		
//		for (int i = 0; i < num.length; ++i) {
//			for (int j = i + 1; j < num.length; ++j) {
//				if (num[i] == num[j]) {
//					throw new CheckDuplication();
//				}
//			}
//		}
		
		boolean istrue;
		int cnt = 0;
		for (int i = 0; i < num.length; ++i) {
			istrue = false;
			for (int j = 0; j < getNumber.length; ++j) {
				if (num[i] == getNumber[j]) {
					istrue = true;
					break;
				}
			}
			if (!istrue) {
				throw new CheckTwice();
			}
		}
		

		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] firstInput = new int[4];
		
		while (true) {
			try {
				System.out.print("숫자 4자리를 입력>> ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				firstInput = getNumber(a, b, c, d);
				System.out.println(Arrays.toString(firstInput));
			} catch (CheckNumber e) {
				System.out.println("0 ~ 9 사이에 숫자를 입력하세요");
				sc.nextLine();
				continue;
			} catch (CheckDuplication e) {
				System.out.println("이미 입력된 숫자 입니다");
				sc.nextLine();
				continue;
			}
			
			try {
			System.out.print("숫자 4자리 다시 입력>> ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int[] num = {a, b, c, d};
			compareNumber(a, b, c, d, firstInput);
			System.out.println("입력한 숫자: " + Arrays.toString(num) + "이전 숫자와 같음");
			break;
		} catch (CheckTwice e) {
			System.out.println("이전 입력숫자와 다름");
		}
			
		}

		
	}
	

}

class CheckNumber extends Exception {
	public CheckNumber() {
		super ("0 ~ 9 사이의 숫자를 입력하세요");
	}
}

class CheckDuplication extends Exception {
	public CheckDuplication() {
		super ("이미 입력한 숫자 입니다");
	}
}

class CheckTwice extends Exception {
	public CheckTwice() {
		super ("먼저 입력한 값과 다르다");
	}
}

class CheckOrder extends Exception {
	public CheckOrder() {
		super ("순서가 틀리다");
	}
}