
public class StringUtility {
	
	public static boolean hasStringAllVowels(String s)
	{
		boolean result = true;
		
		if(!s.contains("a") )
			result = false;
		
		if(!s.contains("e") )
			result = false;
		
		if(!s.contains("i") )
			result = false;
		
		if(!s.contains("o") )
			result = false;
		
		if(!s.contains("u") )
			result = false;
		
		return result;
	}
	
	public static boolean isAllVowelsOrdered(String s)
	{
		boolean result = true;
		
		String restOfText = getRestOftheWord("a", s);
		if (restOfText.equals("")) return false; 
		
		restOfText = getRestOftheWord("e", restOfText);
		if (restOfText.equals("")) return false; 
		
		restOfText = getRestOftheWord("i", restOfText);
		if (restOfText.equals("")) return false; 
		
		restOfText = getRestOftheWord("o", restOfText);
		if (restOfText.equals("")) return false; 
		
		int indexOfLetter = restOfText.indexOf("u");
		if( indexOfLetter < 0 )  return false;
		
		return result;
	}
	
	public static String getRestOftheWord(String letter ,String s)
	{
		String resultStr = "";
		
		int indexOfLetter = s.indexOf(letter);
		
		if( indexOfLetter < 0 )  
			return resultStr ;
		
		return  s.substring(indexOfLetter + 1, s.length() ) ;
		
	}
	

	//String s = "aeiaaioooaauuaeiou";
	//String searchedLetters= "aeiou"
	public static String startProcessing(String str )
	{
		String[] letters = {"a" ,"e" ,"i" ,"o" ,"u" ,""} ;
		String result = "";
		int i= 0 ;
		for( ;i< letters.length ; )
		{
			String currentLetter = letters[i]; 
			if(currentLetter.equals("")) break;
			
			while( true)
			{
				if(str.equals("")) return result;
				
				if( str.substring(0, 1).equals( letters[i]))
				{
					result += letters[i]; // currentSearchedLetter degismemeli
					str = str.substring(1 ,str.length());
				}
				else if( str.substring(0, 1).equals( letters[i+ 1]))
				{
					i++ ;
					break;// harfi degistirelim demek ki
				}
				else
				{
					i= 0;//basa donduk demek
					if(!str.substring(0 ,1).equals("a"))
						str = str.substring(1 ,str.length());
					
					result = "";
					break;
				}
			}
			
		}
		
		return result;
		
		
	}
	
}
