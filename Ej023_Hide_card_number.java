public class Ej023_Hide_card_number {
	public static void main(String args[]){

		System.out.println(cardHide("123456789"));
		System.out.println(cardHide("321123321"));
		System.out.println(cardHide("111113322"));
	  }
	
	public static String cardHide(String card) {
		int len = card.length();  // Length from card number
		String s = "";
		
		for (int i=0;i<len-4;i++) // Create a string with length equal to card number length minus last 4 numbers
			s += "*";
		
		return s+card.substring(len-4);
	}
}
