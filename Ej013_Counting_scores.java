// str = AABACBCCA
// A = 4
// B = 2
// C = 3

public class Ej013_Counting_scores {
	public static void main(String args[]){

		System.out.println(getXO("xoxoxxoxoxoooxooxoxo"));
		System.out.println(getXO("xxxxoooo"));
		System.out.println(getXO("xxxooooo"));
	  }
	
	public static int[] calculateScores(String str) {
		int[] arr = new int[]{0,0,0};
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A')
				arr[0]++;
			else if(str.charAt(i)=='B')
				arr[1]++;
			else if(str.charAt(i)=='C')
				arr[2]++;
		}
		
		return arr;
	}
}
