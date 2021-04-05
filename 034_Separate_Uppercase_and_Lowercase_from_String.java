import java.lang.*;

public class Challenge {
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
