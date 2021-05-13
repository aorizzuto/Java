public class Ej020_Capitalize_first_letter {
	public static void main(String args[]){

		System.out.println(sayHelloBye("Ale",2));
		System.out.println(sayHelloBye("Seba",1));
		System.out.println(sayHelloBye("Eip",3));
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
