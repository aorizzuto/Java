import java.util.Arrays;
public class Ej007_Array_Difference_between_max_and_min {
	public static void main(String args[]){

		int arr[] = {1,2,3,4,5};

		System.out.println(differenceMaxMin(arr));
	  }
	
	public static int differenceMaxMin(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1]-arr[0];
	}
}
