public class Ej035_If_number_is_power_of_2 {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static boolean powerOfTwo(int num) {
		int n = num;
		boolean ret = true;
		
		while(true)
		{
			if (n == 1)
				break;
			if (n%2 == 0)
			{
				n/=2;
			}
			else
			{
				ret = false;
				break;
			}
		}
		
		return ret;
  }
}
