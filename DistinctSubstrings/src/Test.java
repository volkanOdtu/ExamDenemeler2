import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
		Integer N ,K ,L ,M;
		N = Integer.valueOf( in.nextLine());
		
		String KLM = String.valueOf( in.nextLine());
		String KLMArr[] = KLM.split(" ");
		
		K = Integer.valueOf( KLMArr[0]) ;
		L = Integer.valueOf( KLMArr[1]) ;
		M = Integer.valueOf( KLMArr[2]) ;
		
		String s = in.nextLine();  
		//2 for loop olucak 
		//ilk minimum length ile baslicaz string in basindan itibaren 1 er 1 er artitriz ,
		//tüm string de bunu aricaz
		String wholeStr = s;
		
		
		int occurence =0;
		
		
		String searchedStr = "" ;
		
		int currentIndex =0;
		int max =0;
		int occurrence =0;
		
		for(int  currentLengthStr =K ; currentLengthStr <= L ;currentLengthStr++)
		{
			for(int i= 0; i < wholeStr.length() ;i++ )
			{	
				wholeStr = s; occurence =0;
				
				if( i + currentLengthStr > wholeStr.length()) break;
					
				searchedStr = wholeStr.substring(i, i + currentLengthStr);
				
				occurrence = findOccurrence(searchedStr ,wholeStr);
				
				if(occurrence > max ) max = occurrence;
						
			}		
		}
		
		System.out.println( "Max occurrence :" + max);
				
		
	}
	
	public static int findOccurrence(String searchedStr ,String wholeStr)
	{
		int occurence =0; 
		
		while((wholeStr != null ) && (wholeStr.length() >= searchedStr.length()) )
		{
			if(wholeStr.startsWith(searchedStr) ) 
			{
				occurence++;
				wholeStr = wholeStr.substring(searchedStr.length()); 
			}
			else
				wholeStr = wholeStr.substring(1);
		}
		System.out.println( searchedStr + " :" + occurence );
		
		return occurence;
	}
	

}
