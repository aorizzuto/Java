public class Program {
	public static String removeSpecialCharacters(String s) {
		return s.replaceAll("[^a-zA-Z0-9\\s-_]", "");
	}
}
