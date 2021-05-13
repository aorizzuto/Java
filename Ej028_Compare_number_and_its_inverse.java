public class Ej028_Compare_number_and_its_inverse {
	public static void main(String args[]){

		System.out.println(largestSwap(10));
		System.out.println(largestSwap(4));
		System.out.println(largestSwap(24));
	  }
	
	public static boolean largestSwap(int num) {
		int orig = num, dest;
		String aux = Integer.toString(num);
		String fin="";
		
		for (int i=aux.length()-1 ; i>=0 ; i--) // It works for numbers of more than 2 digits
		{
			fin += aux.charAt(i);
		}
		
		dest = Integer.parseInt(fin);
		
		return orig >= dest;
	}
}
