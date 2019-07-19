import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSteakHouses =3 ;
		List< List<Integer>> allLocations = new ArrayList<List<Integer>>();
		
		List<Integer> row = new ArrayList<Integer>(2);
	    row.add(1);row.add(2);
	    allLocations.add(row);
	    
	    List<Integer> row2 = new ArrayList<Integer>(2);	    
	    row2.add(3);row2.add(4);
	    allLocations.add(row2);
	    
	    List<Integer> row3 = new ArrayList<Integer>(2);	    
	    row3.add(1);row3.add(-1);
	    allLocations.add(row3);
	    
		
		
		int numSteaks = 2;
		
		nearestXsteakHouses(totalSteakHouses, allLocations, numSteaks);
	}

	public static  List<List<Integer>> nearestXsteakHouses(int totalSteakHouses ,List< List<Integer>> allLocations ,int numSteaks)
	{
		List<Integer> currentCoor;
		Double distance;
		double[] totalDistance = new double[totalSteakHouses];
		List<Double> allRealDistance=  new ArrayList<Double>();
		
		Hashtable<Integer, Double> hashtable = 
	              new Hashtable<Integer, Double>();
		
		//allRealDistance.sort(c);
		//Every coordinates is determined
		 for (int i=0; i< allLocations.size();i++)
		 {
			     distance =findDistanceOfTwoPoint(allLocations.get(i));
		         hashtable.put(i, distance);		        
		 }
		 
		 List<Integer> lastSteakHouses = new ArrayList<Integer>();
		 
		 double closestCoorInHashTable = 999999999 ;
		 int posInHashTable = 0;
		 
		 for(int i = 0 ; i< numSteaks ; i++)
		 {
			 for(int k =0 ; k < hashtable.size() ; k++)
			 {
				 if( hashtable.get(k) < closestCoorInHashTable )
				 {
					 closestCoorInHashTable = hashtable.get(k);
					 posInHashTable =k;
				 }
			 }
			 
			 lastSteakHouses.add(posInHashTable);
			 hashtable.replace(posInHashTable, 999999999.0);
			 closestCoorInHashTable = 999999999.0;
		 }
			 
		 
		 List< List<Integer>> resultLocations = new ArrayList<List<Integer>>();
		
		 
		 for(int i=0 ;i < lastSteakHouses.size(); i++)
		 {
			 List<Integer> row = allLocations.get( lastSteakHouses.get(i) );
			 resultLocations.add(row);					     
		 }
			
		
		 
		return null;
	}
	
	public static Double findDistanceOfTwoPoint(List<Integer> currentCoor)
	{
		Double result = 0.0;
		
		int x = currentCoor.get(0);
		int y = currentCoor.get(1);
		
		result= Math.sqrt( (x * x) + (y * y) );
		
		return result;
	}
	
}
