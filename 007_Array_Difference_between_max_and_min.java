import java.util.Arrays;
public class Challenge {
	public static int differenceMaxMin(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1]-arr[0];
	}
}
