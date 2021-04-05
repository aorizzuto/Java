import java.util.*;

public class Program {
	public static int[] arrayOfMultiples(int num, int length) {
		int[] ret = new int[length];
		
		for (int i=0 ; i<length ; i++)
			ret[i] = num*(i+1);
		
		return ret;
	}
}
