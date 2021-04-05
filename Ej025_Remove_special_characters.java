public class Ej025_Remove_special_characters {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static String removeSpecialCharacters(String s) {
		return s.replaceAll("[^a-zA-Z0-9\\s-_]", "");
	}
}
