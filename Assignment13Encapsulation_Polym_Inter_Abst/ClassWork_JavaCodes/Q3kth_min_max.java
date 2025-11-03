package ClassWork_JavaCodes;

import java.util.Arrays;

public class Q3kth_min_max {
	public static void main(String[] args) {
		int[] arr =  {7, 10, 4, 3, 20, 15};
		int k = 3;
		Arrays.sort(arr);

        int kth_Min = arr[k - 1];
        int kth_Max = arr[arr.length - k];

        System.out.print("Kth Min = " +kth_Min+ " kth Max = "+kth_Max);
	}

}
