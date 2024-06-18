package myobj.blackJack;

public class BlackJackPlayer {
	String name;
	int scores;
	
	
	public BlackJackPlayer(String name) {
		this.name = name;
	}
	
	public void getScore(int score) {
		this.scores += score;
	}
}
