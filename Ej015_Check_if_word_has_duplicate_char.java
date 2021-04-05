import java.util.*;
public class Ej015_Check_if_word_has_duplicate_char {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
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
