
public abstract class Card {

	boolean available = true;
	
	protected int faceValue; // A number from 2 to 10 ,J for 11 ,12 for Q ,13 for King 1 for Ace
	protected Suit suit; //renk gibi dusunelim
	
	public Card( int c ,Suit s)
	{
		faceValue = c;
		suit = s;
	}
	public abstract int value();
	
	public Suit suit() { return suit; }
	
	//Check if the card is available to be given out to someone
	public boolean isAvailable()
	{ 
		return available; 
	} 
	public void setAvailablity(boolean isAvailable) 
	{ 
		available = isAvailable; 
	}
	
}
