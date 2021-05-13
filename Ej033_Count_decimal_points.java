public class Ej033_Count_decimal_points {
	public static void main(String args[]){

		System.out.println(getDecimalPlaces("123.234"));
		System.out.println(getDecimalPlaces("12.3"));
		System.out.println(getDecimalPlaces("324"));
	  }
	
	public static int getDecimalPlaces(String num) {
		
		if (num.indexOf(".") != -1)
		{
			String[] s = num.split("\\.");
		
			String word = s[1];
			System.out.println(num+"----"+word+"----"+word.length());
			return word.length();
		}
		else
			return 0;
  }
}
