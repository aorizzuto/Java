public class Ej026_Remove_vowel_2_ways {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static String removeVowels(String s) {
		String str = "";
		
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i'
				 && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'A'
				 && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O'
				 && s.charAt(i) != 'U')
				str+=s.charAt(i);
		}
		
		return str;
	}

	// public class Program {
	// 	public static String removeVowels(String s) {
	
	// 		return s.replaceAll("[aeiouAEIOU]","");
	// 	}
	// }
}




