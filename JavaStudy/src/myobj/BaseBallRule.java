package myobj;

public class BaseBallRule {
	
	int[] ranNums = new int[4];
	static int maxChance = 9;
	
	public int makeBaseBallNum (int ballNums) {
		int index = 0;
		int num = 0;
		for(int i = 0; i < ranNums.length; ++i) {
			num = (int)(Math.random() * 9 + 1);
		}
		
		boolean repeat = true;
		for (int i = 0; i < ranNums.length; ++i) {
			if(ranNums[i] == num) {
				repeat = false;
				break;
			}
			if(!repeat) {
				ranNums[index] = num;
				++index;
			}
		}
		return ballNums;
	}
	
	public int enterAnswer(String answerNums) {
		int currChance = 0;
		int playerNumLen = answerNums.length(); 
		
		while(true) {
			if(currChance == maxChance) {
				System.out.println("기회소진 패배");				
			}
			
			for(int i = 0; i < playerNumLen; ++i) {
				char ch = answerNums.charAt(i);
				if(ch == ranNums[i]) {
					System.out.println("정답");
				}
			}
			
		}
		
		
	}
	
}
