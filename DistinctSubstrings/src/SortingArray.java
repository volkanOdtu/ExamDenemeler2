import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
		
		Integer arrLength ,searchedItem;
		
		arrLength = Integer.valueOf( in.nextLine());
		
		Integer[] arr = new Integer[arrLength] ;
				
		for(int i=0 ; i< arrLength ;i++)
		{
			arr[i] = Integer.valueOf( in.nextLine());			 
		}
		
		searchedItem = Integer.valueOf( in.nextLine());
		
		Integer[] sortedArr = selectionSort(arr);
		
		for (Integer item : sortedArr) {
			if(item == searchedItem)
			{
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");
		
	}
	

	public static Integer[] insertionSort(Integer[] theArray)
	{
		int arraySize = theArray.length;
		
		for( int i = 1 ; i < arraySize ;i++)
		{
			int j = i;
			int toInsert = theArray[i];
			while( (j > 0) && (theArray[i] > toInsert ) )
			{
				theArray[j] = theArray[j - 1];
				j--;
			}
			theArray[j] = toInsert;
		}
		
		return theArray;
	}

	public static Integer[] selectionSort(Integer[] theArray)
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

	public static void swapValues(int indexOne ,int indexTwo,Integer[] theArray)
	{
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}

}
