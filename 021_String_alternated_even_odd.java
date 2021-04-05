public class Challenge {
	public static String indexShuffle(String str) {
		String s="";
		
		for (int i=0;i< str.length();i=i+2)   // Even
		{
			s+=str.charAt(i);
		}
		for (int i=1;i< str.length();i=i+2)   // Odd
		{
			s+=str.charAt(i);
		}
		return s;
	}
}
