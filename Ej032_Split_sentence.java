public class Ej032_Split_sentence {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static String grabCity(String str) {
		String[] s = str.split("\\[");
		int len = s.length;
		
		System.out.println(s);
		String word = s[len-1];

		return word.substring(0,word.length()-1);
	}
}