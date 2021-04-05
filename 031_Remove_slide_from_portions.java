public class Challenge {
	public static String joinPath(String portion1, String portion2) {
		String p1,p2;
		
		p1 = remove_slide(portion1);
		p2 = remove_slide(portion2);
		
		return p1+"/"+p2;
	}
	public static String remove_slide(String s)
	{
		return s.replaceAll("/","");
	}
}
