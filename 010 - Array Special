// An array is special, if every even index contains an even number and every odd index contains an odd number. Create a function that returns true if an array is special, and false otherwise.

public class Challenge {
	public static boolean isSpecialArray(int[] arr) {
		boolean ret = true;
		
		for (int i=0 ; i< arr.length ; i++)
		{
			if (i%2 == 0 || i%2 == 2)
			{
				if (arr[i]%2 != 0)
				{
					ret = false;
					break;
				}
			}
			else
			{
				if (arr[i]%2 != 1)
				{
					ret = false;
					break;
				}
			}
		}
		return ret;
	}
}
