package ARRAYS__DOUBT__CLASS__1;

import java.util.Scanner;

public class Alex___goes__Shopping {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		in(arr);
		int m = scn.nextInt();
		for (int i = 0; i < m; i++) {
			int p = scn.nextInt();
			int q = scn.nextInt();
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (p %arr[j] == 0) {
					count++ ;
				}
			}
			if(count>=q) {
				System.out.println("Yes");
			}else {
				System.out.println("No" );
			}

		}
	}
	public static void in(int[] arr) {
		for(int i = 0 ;i<arr.length;i++) {
			arr[i] = scn.nextInt() ;
		}
	}

}
