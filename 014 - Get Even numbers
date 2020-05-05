import java.util.ArrayList;
import java.util.List;
public class Challenge {
	public static Integer[] findEvenNums(int num) {
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
		return arr;
	}
}
