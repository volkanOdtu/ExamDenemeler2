import java.util.ArrayList;

//There are multiple possible scores for a blackjack hand ,since aces have multiple
//values.Return the highest possible score under 21 or the lowest score ,that's over
public class BlackJackHand extends Hand<BlackJackCard> {

	public int score()
	{
		ArrayList<Integer> scores = possibleScores();
		for(int score : scores)
		{
			
		}
		return Integer.MIN_VALUE;
	}
	//Return a list of all possible scores this hand could have(evaluating each ace as both 1 and 11)
	public ArrayList<Integer> possibleScores()
	{
		return null;
	}
	public boolean busted() {return score() > 21; }
	public boolean is21() {return score() == 21; }
	public boolean isBlackJack() {return false; }
	
}
