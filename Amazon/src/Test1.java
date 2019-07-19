import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] states = {1 ,1 ,1 ,0 ,1 ,1 ,1 , 1};
		
		cellCompete(states, 2) ;
	}
	public static List<Integer> cellCompete(int[] states ,int days)
	{
		List<Integer> result = new ArrayList<Integer>();
		
		Cell[] cells = new Cell[10];
		
		cells[0] = new Cell(true); cells[0].isLeftSingle = true;;  
		cells[1] = new Cell(false); 
		cells[2] = new Cell(false);
		cells[3] = new Cell(false);
		cells[4] = new Cell(false);
		cells[5] = new Cell(false);
		cells[6] = new Cell(false);
		cells[7] = new Cell(false);
		cells[8] = new Cell(false);
		cells[9] = new Cell(true); cells[9].isRightSingle = true;
		
		//putting relations
		cells[0].leftAdjacentCell = null ; cells[0].rightAdjacentCell = cells[1]; cells[0].currentState = 0; cells[0].prevState = 0; 
		cells[1].leftAdjacentCell = cells[0] ; cells[1].rightAdjacentCell = cells[2]; cells[1].currentState = states[0];
		cells[2].leftAdjacentCell = cells[1] ; cells[2].rightAdjacentCell = cells[3]; cells[2].currentState = states[1];
		cells[3].leftAdjacentCell = cells[2] ; cells[3].rightAdjacentCell = cells[4]; cells[3].currentState = states[2];
		cells[4].leftAdjacentCell = cells[3] ; cells[4].rightAdjacentCell = cells[5]; cells[4].currentState = states[3];
		cells[5].leftAdjacentCell = cells[4] ; cells[5].rightAdjacentCell = cells[6]; cells[5].currentState = states[4];
		cells[6].leftAdjacentCell = cells[5] ; cells[6].rightAdjacentCell = cells[7]; cells[6].currentState = states[5];
		cells[7].leftAdjacentCell = cells[6] ; cells[7].rightAdjacentCell = cells[8]; cells[7].currentState = states[6];
		cells[8].leftAdjacentCell = cells[7] ; cells[8].rightAdjacentCell = cells[9]; cells[8].currentState = states[7];
		cells[9].leftAdjacentCell = cells[8] ; cells[9].rightAdjacentCell = null; cells[9].currentState = 0; cells[9].prevState = 0;
		
		
		for(int i= 1; i <= days ; i++ )
		{
			for( int k =1 ; k< 9; k++ )
			{
				cells[k].dayChanged(); result.add(cells[k].currentState);
			}
			System.out.println("\n");
		}
		
		return result;
		
	}

}
