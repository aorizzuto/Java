public class Program {
	public static boolean isPrefix(String word, String prefix) {
		String px = prefix.replaceAll("-","");
		
		return px.equals(word.substring(0,px.length()));
	}

	public static boolean isSuffix(String word, String suffix) {
		String sx = suffix.replaceAll("-","");
		
		return sx.equals(word.substring(word.length()_sx.length() ));
	}
}
