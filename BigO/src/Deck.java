import java.util.ArrayList;

public class Deck< T extends Card> {
	private ArrayList<T> cards; //All cards dealt or not
	private int dealtIndex = 0 ; //
	
	public void setDeckOfCards(ArrayList<T> cards)
	{
		this.cards = cards;
	}
	public void shuffle()
	{}
	public int remainingCards()
	{
		return cards.size() - dealtIndex;
	}
	public T[] dealHand(int number)
	{
		return null;
	}
	public T  dealCard(int number)
	{
		return null;
	}
	
}
