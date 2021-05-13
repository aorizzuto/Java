public class Ej019_Halve_count {
	public static void main(String args[]){

		System.out.println(halveCount(10,3));
		System.out.println(halveCount(15,2));
		System.out.println(halveCount(25,2));
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
