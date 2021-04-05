public class Ej002_Count_number_of_char_in_String {

	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }

  	public static boolean getXO (String str) {
		int count_x = 0, count_o = 0;   // Counters

		String s = str.toLowerCase();   // String to lowercase
		
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i) == 'x')       // Count if char is X
					count_x++;
			if (s.charAt(i) == 'o')       // Count if char is O
					count_o++;
		}
		
		return count_x == count_o;      // Return comparation between counters
  }
}
