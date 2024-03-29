
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class OddNumbers2 {
	static List<Integer> oddNumbers(int l, int r) {

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
		return items;
    }
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> res = oddNumbers(l, r);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
	}

}
