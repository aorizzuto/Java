import java.util.Arrays;

public class Ej004_Find_the_nth_smallest_number {
	public static void main(String args[]){

		int arr[] = {5,4,7,1,10,3};
		System.out.println(nthSmallest(arr,3));
	  }
	
	public static int nthSmallest(int[] arr, int n) {
		if(n > arr.length)
			return -1;
		else
			Arrays.sort(arr);
			return arr[n-1];
	}
}
