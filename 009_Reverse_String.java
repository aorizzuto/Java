public class ReverseOrder {
  public static String reverse(final String str) {
    String s="";
		
		for (int i=str.length()-1 ; i>=0 ; i--)
		{
			s+=str.charAt(i);
		}
		
		return s;		
  }
}
