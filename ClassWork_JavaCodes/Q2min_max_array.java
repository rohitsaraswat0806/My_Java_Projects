package ClassWork_JavaCodes;

public class Q2min_max_array {
	public static void main(String[] arg) {
		int[] arr =  {3, 5, 1, 8, -2};
		 int max = arr[0];
	     int min = arr[0];
	     for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        System.out.println("Max = " + max+ " and Min = " +min);
	        
	}
}

	