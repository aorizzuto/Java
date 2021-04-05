public class Ej030_Replace_char_with_Regex {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static String convertBinary(String str) {
		String s = str;
		
		s = s.replaceAll("[a-mA-M]","0");
		s = s.replaceAll("[n-zN-Z]","1");
		
		return s;
	}
}
