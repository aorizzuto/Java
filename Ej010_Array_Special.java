import java.util.Arrays;
import java.util.List;

// An array is special, if every even index contains an even number and every odd index contains an odd number. Create a function that returns true if an array is special, and false otherwise.

public class Ej010_Array_Special {
	public static void main(String args[]){

		System.out.println(isSpecialArray(Arrays.asList(5, 12, 9, 3, 15, 88)));
		System.out.println(isSpecialArray(Arrays.asList(6, 11, 8, 3, 14, 87)));
	  }
	
	public static boolean isSpecialArray(List<Integer> arr) {
		boolean ret = true;
		int counter = 0;

		for (Integer number:arr){
			if (counter%2 == 0 && number%2 != 0){
				ret = false;
				break;
			}
			if (counter%2 == 1 && number%2 != 1){
				ret = false;
				break;
			}
			counter++;
		}
	
		return ret;
	}
}
