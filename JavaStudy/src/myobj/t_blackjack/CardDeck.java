package myobj.t_blackjack;

public interface CardDeck {
	void shuffle();
	
	// 카드 타입으로 리턴
	Card draw();
}
