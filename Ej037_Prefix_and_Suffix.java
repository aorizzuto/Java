public class Ej037_Prefix_and_Suffix {
	public static void main(String args[]){

		System.out.println(isPrefix("alejandro","ale"));
		System.out.println(isPrefix("sebastian","ale"));
		System.out.println(isSuffix("sebastian","tian"));
	  }
	
	public static boolean isPrefix(String word, String prefix) {
		String px = prefix.replaceAll("-","");
		
		return px.equals(word.substring(0,px.length()));
	}

	public static boolean isSuffix(String word, String suffix) {
		String sx = suffix.replaceAll("-","");
		
		return sx.equals(word.substring(word.length()-sx.length() ));
	}
}
