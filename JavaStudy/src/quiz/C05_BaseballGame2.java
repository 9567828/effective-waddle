package quiz;

import java.util.Scanner;

public class C05_BaseballGame2 {
	
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
		
		Scanner sc = new Scanner(System.in);
		
//		int[] winNums = new int[4];
//		int num = 0;
//		int index = 0;
//		
//		for(int i = 0; i < winNums.length; ++i) {
//			num = (int) (Math.random() * 9 + 1);
//			winNums[i] = (int) (Math.random() * 9 + 1);
//		}
//		
//		boolean repeat = false;
//		for(int i = 0; i < index; ++i) {
//			if(winNums[i] == num) {
//				repeat = true;
//				break;
//			}
//			if(!repeat) {
//				winNums[index] = num;
//				++index;
//			}
//		}
//		System.out.print(Arrays.toString(winNums));
		
		int[] winNums = {2, 6, 8, 1};
		
//		System.out.print(Arrays.toString(winNums));
		System.out.println();
		
		String playerNum = "2468";
		char[] arr = new char [playerNum.length()];
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = playerNum.charAt(i);
		}
//		System.out.print(Arrays.toString(arr));
		
		int maxChance = 9;
		int playerChance = 0;
		
		while(true) {
			if(maxChance == playerChance) {
				System.out.println("기회소진 ㅃ2");
				break;
			}
//			System.out.print(">> ");
//			playerNum = sc.next();
			
			++playerChance;
			
			if(maxChance > playerChance) {
				for (int i = 0; i < arr.length; ++i) {
					for (int j = 0; j < winNums.length - 1; ++j) {
						if(arr[i] == winNums[j]) {
//							System.out.println(arr[i]);
							break;
						} else if(arr[i] == winNums[j + 1]) {
							System.out.println(arr[i]);
							System.out.println(winNums[j]);
						}
					}
				}				
			}
		}
		
		
		
	}

}
