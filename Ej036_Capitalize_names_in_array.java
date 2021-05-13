import java.util.Arrays;

public class Ej036_Capitalize_names_in_array {
	public static void main(String args[]){
		String[] s = {"Alejandro","Sebastian","abril","omar","Diana","lucia"};

		System.out.println(Arrays.toString(capMe(s)));
	  }
	
	public static String[] capMe(String[] s) {
		String[] names = s;
		
		for (int i=0 ; i<s.length ; i++)
		{
			names[i] = s[i].toLowerCase().substring(0,1).toUpperCase() + s[i].toLowerCase().substring(1);
		}
		
		return names;
	}
}
