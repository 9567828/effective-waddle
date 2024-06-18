package myobj.baskin;

public class BaskinPlayer {
	int playerSize;
	
	public BaskinPlayer(int playerSize) {
		this.playerSize = playerSize;
	}
	
	public int getplayerNum(int turn) {
		return turn % playerSize + 1;
	}
	
}
