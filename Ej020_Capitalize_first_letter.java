public class Ej020_Capitalize_first_letter {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static String sayHelloBye(String name, int num) {
		String s;
		
		s = name.substring(0, 1).toUpperCase() + name.substring(1);
		
		if (num == 1)
			s = "Hello "+s;
		else
			s = "Bye "+s;
		
		return s;
	}
}
