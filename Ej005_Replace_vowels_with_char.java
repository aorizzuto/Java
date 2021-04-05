public class Ej005_Replace_vowels_with_char {
	public static void main(String args[]){

		System.out.println(replaceVowels("Alejandro",'X'));
		System.out.println(replaceVowels("Omar",'Z'));
		System.out.println(replaceVowels("Rizzuto",'r'));
	  }
	
	public static String replaceVowels(String str, char ch) 
	{
		String s=str;
		char[] vowel = new char[]{'a','e','i','o','u'};

		for ( int i=0 ; i<vowel.length ; i++)
		{
			s=s.replace(vowel[i],ch);
		}
		return s;
	}
}
