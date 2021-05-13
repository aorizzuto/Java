public class Ej021_String_alternated_even_odd {
	public static void main(String args[]){

		System.out.println(indexShuffle("Alejandro"));
		System.out.println(indexShuffle("Sebas"));
		System.out.println(indexShuffle("Abril"));
	  }
	
	public static String indexShuffle(String str) {
		String s="";
		
		for (int i=0;i< str.length();i=i+2)   // Even
		{
			s+=str.charAt(i);
		}
		for (int i=1;i< str.length();i=i+2)   // Odd
		{
			s+=str.charAt(i);
		}
		return s;
	}
}
