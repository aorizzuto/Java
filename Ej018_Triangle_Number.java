public class Ej018_Triangle_Number {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static int triangle(int n) {
		int counter = 0;
		
		for (int i=0;i<n+1;i++)
		{
			counter+=i;
		}
		return counter;
  }
}