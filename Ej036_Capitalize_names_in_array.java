public class Ej036_Capitalize_names_in_array {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static String[] capMe(String[] s) {
		String[] names = s;
		
		for (int i=0 ; i<s.length ; i++)
		{
			names[i] = s[i].toLowerCase().substring(0,1).toUpperCase() + s[i].toLowerCase().substring(1);
		}
		
		return names;
	}
}
