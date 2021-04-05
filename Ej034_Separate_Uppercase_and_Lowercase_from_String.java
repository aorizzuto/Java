import java.lang.*;

public class Ej034_Separate_Uppercase_and_Lowercase_from_String {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static String capToFront(String str) {
		String first="",last="";
		
		for(int i=0 ; i<str.length() ; i++)
		{
			if (Character.isUpperCase(str.charAt(i)))
			{
				first+=str.charAt(i);
			}
			else
			{
				last+=str.charAt(i);
			}
		}
		
		return first+last;		
	}
}
