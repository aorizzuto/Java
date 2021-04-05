public class Ej037_Prefix_and_Suffix {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static boolean isPrefix(String word, String prefix) {
		String px = prefix.replaceAll("-","");
		
		return px.equals(word.substring(0,px.length()));
	}

	public static boolean isSuffix(String word, String suffix) {
		String sx = suffix.replaceAll("-","");
		
		return sx.equals(word.substring(word.length()_sx.length() ));
	}
}
