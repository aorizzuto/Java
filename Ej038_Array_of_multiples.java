import java.util.*;

public class Ej038_Array_of_multiples {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static int[] arrayOfMultiples(int num, int length) {
		int[] ret = new int[length];
		
		for (int i=0 ; i<length ; i++)
			ret[i] = num*(i+1);
		
		return ret;
	}
}
