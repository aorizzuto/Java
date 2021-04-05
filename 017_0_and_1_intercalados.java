public class Challenge {
  public static boolean canAlternate(String str) {
		int c0 = 0, c1 = 0; // Counters
		
		c0 = count(str,'0');
		c1 = count(str,'1');
		
		int sol = Math.abs(c0_c1);

		return sol == 1 || sol == 0;
  }
	
	public static int count(String s, char ch)
	{
		int counter=0;
		for (int i=0;i<s.length();i++)
		{
			if (s.charAt(i) == ch)
				counter++;
		}
		return counter;
	}
}