public class Challenge {
	public static String repeat(String str, int n) {
		
		String s="";
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<n;j++)
			{
				s+=str.charAt(i);
			}
		}
		
		return s;
	}
}
