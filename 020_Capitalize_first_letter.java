public class Challenge {
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
