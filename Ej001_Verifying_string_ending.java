// Verify ending of string

public class Ej001_Verifying_string_ending {

  public static void main(String args[]){

    System.out.println(checkEnding("alejandro.java", "java"));
  }

  public static boolean checkEnding(String str1, String str2) {
    int len2 = str2.length();
		int len1 = str1.length();
		
		String s = str1.substring(len1-len2, len1);
		
		return s.equals(str2);
  }
}


