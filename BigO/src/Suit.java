
public class Suit {
	//Club 0 ,Diamond 1 ,Heart 2 ,Spade 3
	public Suit(int v) {
		value = v; 
	}
	
	private int value;
	
	public static Suit getSuitFromValue(int value) {
		return new Suit(value);
	}
}
