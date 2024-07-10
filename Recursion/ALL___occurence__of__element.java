package Recursion;

public class ALL___occurence__of__element {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 20, 40,30,20,2	0,10, 50 };
		print(0,arr(arr,20,0,0)) ;

	}



	public static void print(int i, int[] arr) {
		if (i == arr.length) {
			return;
		}
		System.out.print(arr[i] + " ");
		print(i + 1, arr);
	}

	public static int[] arr(int[] arr, int ele, int i, int count) {
		if (i == arr.length) {
			 
			return new int[count];

		}
		if (arr[i] == ele) {
			int[] x = arr(arr, ele, i + 1, count + 1);
			x[count]=i ;
			return x;
		} else {
			int[] x = arr(arr, ele, i + 1, count);
			return x;
		}
		
	}

}
