public class Ej035_If_number_is_power_of_2 {
	public static void main(String args[]){

		System.out.println(powerOfTwo(3));
		System.out.println(powerOfTwo(8));
		System.out.println(powerOfTwo(0));
	  }
	
	public static boolean powerOfTwo(int num) {
		int n = num;
		boolean ret = true;
		
		while(true)
		{
			if (n == 1 || n == 0)
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
