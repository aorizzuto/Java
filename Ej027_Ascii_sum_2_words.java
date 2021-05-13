public class Ej027_Ascii_sum_2_words {
	public static void main(String args[]){

		System.out.println(sameAscii("alejandro","jandroale"));
		System.out.println(sameAscii("sebastian", "tiansebaa"));
	  }
	
	public static boolean sameAscii(String a, String b) {
		int sum_a=0,sum_b=0;
		
		for(int i=0 ; i<a.length() ; i++)	// 2 fors in case words has different lengths
			sum_a += (int) a.charAt(i);
		
		for(int i=0 ; i<b.length() ; i++)
			sum_b += (int) b.charAt(i);
		
		return sum_a == sum_b;
	}
}
