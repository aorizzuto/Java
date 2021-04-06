import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej014_Get_Even_numbers {
	public static void main(String args[]){

		System.out.println(findEvenNums(30));
		System.out.println(findEvenNums(23));
		System.out.println(findEvenNums(123));
	  }
	
	public static String findEvenNums(int num) {
		List<Integer> lst = new ArrayList<>();
		
		boolean fin=true;
		int number = 2;
		
		if (num < 2)
		{
			fin = false;
		}
		
		while(fin)
		{
			if (number%2 == 0)
				lst.add(number);
			
			number+=2;
			
			if (number > num)
				fin = false;			
		}
		
		Integer[] arr = new Integer[lst.size()];
		lst.toArray(arr);
		return Arrays.toString(arr);
	}
}
