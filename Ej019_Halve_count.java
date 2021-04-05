public class Ej019_Halve_count {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
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
