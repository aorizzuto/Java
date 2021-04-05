import java.util.*;

public class Challenge {
  public static boolean greaterThanOne(String frac) {
		String[] num = frac.split("/");   // Split string in nom and denom
	
		Float[] numbers = Arrays.stream(num).map(Float::valueOf).toArray(Float[]::new); // Convert strings in float
		
		if (( numbers[0] / numbers[1]) > 1)
			return true;
		else
			return false;
  }
}
