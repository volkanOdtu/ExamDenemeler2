
public class Cell {
	public int currentState;
	public int prevState;
	
	
	public boolean isSingleState =false;
	public boolean isLeftSingle = false;
	public boolean isRightSingle = false;
	
	public Cell leftAdjacentCell;
	public Cell rightAdjacentCell;
	
	public Cell(boolean isSingleState)
	{
		this.isSingleState = isSingleState ;
	}
	
	//when the day is changed ,next day states are determined here
	public void dayChanged()
	{	
		//single states wont affect
		if( !this.isSingleState )
		{
			this.prevState = this.currentState ;
			if( ( this.leftAdjacentCell.prevState == 0 &&  this.rightAdjacentCell.currentState  == 0 )
					|| ( this.leftAdjacentCell.prevState == 1 &&  this.rightAdjacentCell.currentState == 1 ))
			{
				this.currentState  = 0;//inactive			
			}
			else 
				this.currentState = 1; //active
		}
		
		System.out.print(currentState + " ") ;
	}
}
