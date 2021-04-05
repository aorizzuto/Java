import java.util.*;

public class Program {
	public static String[] isFourLetters(String[] s) {
		List<String> lst = new ArrayList<>();
		
		for (String word:s)     // Loop on array input
		{
			if (word.length() == 4) // Check if is 4 letter word
			{
				lst.add(word);
			}
		}
		String[] arr = new String[lst.size()];
    arr = lst.toArray(arr);
		
		return arr;
	}
}
