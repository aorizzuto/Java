
public class Ej034_Separate_Uppercase_and_Lowercase_from_String {
	public static void main(String args[]){

		System.out.println(capToFront("AlejandrO"));
		System.out.println(capToFront("sebaStian"));
		System.out.println(capToFront("abriL"));
	  }
	
	public static String capToFront(String str) {
		String first="",last="";
		
		for(int i=0 ; i<str.length() ; i++)
		{
			if (Character.isUpperCase(str.charAt(i)))
			{
				first+=str.charAt(i);
			}
			else
			{
				last+=str.charAt(i);
			}
		}
		
		return first+last;		
	}
}
