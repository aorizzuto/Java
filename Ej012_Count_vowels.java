public class Ej012_Count_vowels {
  
	public static void main(String args[]){

		System.out.println(getCount("Alejandro"));
		System.out.println(getCount("Omar"));
		System.out.println(getCount("Rizzuto"));
	  }
	
	public static int getCount(String str) {
    	int vowelsCount = 0;
		char ch;
		
		for (int i=0 ; i<str.length() ; i++)
		{
			ch = str.toLowerCase().charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
			{
				vowelsCount++;
			}
		}
    
    return vowelsCount;
  }
}
