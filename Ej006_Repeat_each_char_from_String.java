public class Ej006_Repeat_each_char_from_String {
	public static void main(String args[]){

		System.out.println(repeat("alejandro",2));
		System.out.println(repeat("Omar",3));
		System.out.println(repeat("Rizzuto",4));
	  }
	
	public static String repeat(String str, int n) {
		
		String s="";
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<n;j++)
			{
				s+=str.charAt(i);
			}
		}
		
		return s;
	}
}
