public class Ej008_Formatting_array {
	public static void main(String args[]){

		int arr[] = {1,2,3,4,5,6,7,8,9,0};

		System.out.println(formatPhoneNumber(arr));
	  }
	
	public static String formatPhoneNumber(int[] nums) {
		String str="";
		
		for (int i=0 ; i<nums.length ; i++)
		{
			str += Integer.toString(nums[i]);
		}
		
		return "("+str.substring(0,3)+") "+str.substring(3,6)+"-"+str.substring(6,10);
	}
}
// (123) 456-7890
