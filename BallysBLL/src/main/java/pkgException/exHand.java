// From Hand.java class
package pkgException;

public class exHand extends Exception {
	private String hand;
	public String gethand() {
		return hand;
	}
	public exHand(String pickBestHand) {
		this.hand = pickBestHand;
	}

}
