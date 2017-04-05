package pkgException;

import pkgPokerBLL.Deck;

public class DeckException extends Exception{
	private Deck deck;
	public Deck getDeck() {
		return deck;
		
	}
	public DeckException(Deck deck) {
		this.deck = deck;
	}

}
