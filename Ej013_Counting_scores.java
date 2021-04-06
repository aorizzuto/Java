import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// str = AABACBCCA
// A = 4
// B = 2
// C = 3

public class Ej013_Counting_scores {
	public static void main(String args[]){

		System.out.println(calculateScores("AAABBABCCAAB"));
		System.out.println(calculateScores("AABCD"));
		System.out.println(calculateScores("BCABCD"));
	  }
	
	public static String calculateScores(String str) {
		Map<Character,Integer> map = new HashMap<>();

		Set<Character> chars = new TreeSet<>();
		for( char c : str.toCharArray() ) {
		chars.add(c);
		}

		StringBuilder sb = new StringBuilder();
  
        for (Character ch : chars) {
            sb.append(ch);
        }
  
        String letters = sb.toString();

		for ( int i=0; i < letters.length();i++){
			map.put(letters.charAt(i),0);
		}		
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			map.put(ch,map.get(ch)+1);
		}
		
		String ret="";
		for (Map.Entry<Character,Integer> entry : map.entrySet()){
			ret+=entry.getKey()+":"+entry.getValue()+",";
		}

		return ret;
	}
}
