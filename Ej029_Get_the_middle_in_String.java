class Challenge {
	public static void main(String args[]){

		System.out.println(getMiddle("omar"));
		System.out.println(getMiddle("sebas"));
		System.out.println(getMiddle("abril"));
	  }
	
	public static String getMiddle(String word) {
		int len = word.length();
		String s="";
		
		if (len%2 == 0)
			s = word.substring(len/2-1,len/2+1);
		else
			s = word.substring(len/2,len/2+1);
		
		return s;
  }
}
