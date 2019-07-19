import java.util.ArrayList;
import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
		
		Integer l ,r;
		
		l = Integer.valueOf( in.nextLine());
		
		r = Integer.valueOf( in.nextLine());
		
		int[] arr = oddNumbers(l, r);
		
	}

	public static int[] oddNumbers( int l ,int r)
	{
		ArrayList<Integer> items = new ArrayList();
		
		for(int i = l ; i<= r ; i++)
		{
			if( (i % 2) == 1 )
			{
				System.out.println(i);
				items.add(i);
			}	
		}
		
		int[] arr = new int[items.size()];
		
		for (int i=0 ;i< items.size(); i++ ) {
			arr[i] = items.get(i);
		}
		return arr;
	}
}
