import java.util.*;
public class Challenge {
	public static boolean doubleLetters(String word) {
		List<Character> lst = new ArrayList<>();
		
		for (int i=0;i<word.length();i++)
		{
			if (!lst.contains(word.charAt(i)))
			{
				lst.add(word.charAt(i));
			}
		}
		
		return lst.size() != word.length();
	}
}
