public class Challenge {
	public static String cardHide(String card) {
		int len = card.length();  // Length from card number
		String s = "";
		
		for (int i=0;i<len-4;i++) // Create a string with length equal to card number length minus last 4 numbers
			s += "*";
		
		return s+card.substring(len-4);
	}
}
