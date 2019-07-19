
public class GCD {

	public int generalizedGCD(int num ,int[] arr)
	{
		int maxDivider = 1;
		boolean isDivided = true;
		
		//oncelikle sort edeicez arrayi 
		int[] sortedArr = selectionSort(arr);
		
		//we go untill the minimum value of array
		for(int k = 2 ; k <= sortedArr[0] ;k++ )
		{
			isDivided = true;
			
			for(int i= 0 ; i< num ;i++ )
			{
				if(! (( arr[i] %  k ) == 0))
				{
					isDivided = false;
					break;
				}
			}
			
			if( isDivided) //Demek ki hepsini boldu 
				maxDivider = k;
		}
		
		return maxDivider;
	}
	
	public int[] selectionSort(int[] theArray)
	{
		int minimum;
		int minimumIndex;
		int arraySize = theArray.length;
		
		for( int x =0 ; x < arraySize ; x++)
		{
			minimum =  theArray[x];
			minimumIndex = x;
			//Bu for loop tum dizideki minimum elemani buluyor
			for( int y = x ; y < arraySize ; y++)
			{
				if( theArray[y] < minimum  )
				{
					minimum = theArray[y];
					minimumIndex  = y;
				}
			}
			swapValues(x, minimumIndex,theArray);
		}
		
		return theArray;
	}

	public  void swapValues(int indexOne ,int indexTwo,int[] theArray)
	{
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}

}
