public class Ej031_Remove_slide_from_portions {
	public static void main(String args[]){

		System.out.println(joinPath("123/234","12/32"));
		System.out.println(joinPath("12/32","98"));
	  }
	
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
