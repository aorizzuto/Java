public class Ej003_Array_Average_Whole_number {
	
	public static void main(String args[]){

		int arr[] = {2,7,9,3,6,1,7,4,2};
		System.out.println(isAvgWhole(arr));

		arr[0] = 3;
		System.out.println(isAvgWhole(arr));

		arr[0] = 6;
		System.out.println(isAvgWhole(arr));
	  }
	
	public static boolean isAvgWhole(int[] arr) {
		int count = 0;
		int len = arr.length;
		
		for (int i=0 ; i<len ; i++)
		{
			count += arr[i];
		}

		System.out.println("Suma: "+count+" , Length: "+arr.length);
		
		return count%len == 0;
	}
}
