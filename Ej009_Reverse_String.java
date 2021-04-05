public class Ej009_Reverse_String {
  	
	public static void main(String args[]){

		System.out.println(reverse("Alejandro"));
		System.out.println(reverse("Omar"));
		System.out.println(reverse("Rizzuto"));
	  }
	
	public static String reverse(final String str) {
    	String s="";
		
		for (int i=str.length()-1 ; i>=0 ; i--)
		{
			s+=str.charAt(i);
		}
		
		return s;		
  }
}
