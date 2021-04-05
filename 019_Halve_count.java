public class Challenge {
	public static int halveCount(int a, int b) {
		float num = (float)a;
		int counter = 0;
    
		while (num > b)
		{
			num /= 2;
			counter += 1;
		}
		return counter-1;
  }
}
