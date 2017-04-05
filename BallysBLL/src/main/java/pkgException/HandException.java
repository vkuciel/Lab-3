package pkgException;

import pkgPokerBLL.Hand;

public class HandException extends Exception {
	private Hand hand;
	public Hand getHand() {
		return hand;
		
	}
	public HandException(Hand h) {
		this.hand = hand;
	}

}
