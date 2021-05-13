public class Ej025_Remove_special_characters {
	public static void main(String args[]){

		System.out.println(removeSpecialCharacters("alejandro 0123!\""));
		System.out.println(removeSpecialCharacters("!seba123?"));
	  }
	
	public static String removeSpecialCharacters(String s) {
		return s.replaceAll("[^a-zA-Z0-9\\s-_]", "");
	}
}
