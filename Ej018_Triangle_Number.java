public class Ej018_Triangle_Number {
	public static void main(String args[]){

		System.out.println(triangle(3));
		System.out.println(triangle(4));
		System.out.println(triangle(5));
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
