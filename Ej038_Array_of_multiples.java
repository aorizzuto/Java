import java.util.Arrays;

public class Ej038_Array_of_multiples {
	public static void main(String args[]){

		System.out.println(Arrays.toString(arrayOfMultiples(4,5)));
		System.out.println(Arrays.toString(arrayOfMultiples(1,25)));
		System.out.println(Arrays.toString(arrayOfMultiples(30,2)));
	  }
	
	public static int[] arrayOfMultiples(int num, int length) {
		int[] ret = new int[length];
		
		for (int i=0 ; i<length ; i++)
			ret[i] = num*(i+1);
		
		return ret;
	}
}
