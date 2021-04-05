import java.util.*;

public class Ej022_Verify_if_fraction_greater_than_one {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static boolean greaterThanOne(String frac) {
		String[] num = frac.split("/");   // Split string in nom and denom
	
		Float[] numbers = Arrays.stream(num).map(Float::valueOf).toArray(Float[]::new); // Convert strings in float
		
		if (( numbers[0] / numbers[1]) > 1)
			return true;
		else
			return false;
  }
}
