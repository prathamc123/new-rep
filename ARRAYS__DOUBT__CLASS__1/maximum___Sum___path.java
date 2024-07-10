package ARRAYS__DOUBT__CLASS__1;

import java.util.Arrays;
import java.util.Scanner;

public class maximum___Sum___path {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int test = scn.nextInt();
		for (int i = 0; i < test; i++) {
			int n1 = scn.nextInt();
			int n2 = scn.nextInt();
			int[] arr1 = new int[n1];
			in(arr1);
			int[] arr2 = new int[n2];
			in(arr2);
			System.out.println(maxsumpath(arr1, arr2));
		}
	}

	public static void in(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

	}

	public static int maxsumpath(int[] arr1, int[] arr2) {
		int sum1 = 0;
		int sum2 = 0;
		int i = 0;
		int j = 0;
		int netsum = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				sum1 = sum1 + arr1[i];
				i++;
			} else if (arr1[i] > arr2[j]) {
				sum2 = sum2 + arr2[j];
				j++;
			} else {
				sum1 = sum1 + arr1[i] ;
				sum2 = sum2 + arr2[j] ;
				netsum = netsum + Math.max(sum1, sum2) ;
				sum1 = 0 ;
				sum2 = 0 ;
				i++ ;
				j++ ;
				

			}

		}
		while(j<arr2.length) {
			sum2 =sum2 +arr2[j] ;
			j++ ;
		}
		while(i<arr1.length) {
			sum1 = sum1 +arr1[i] ;
			i++ ;
		}
		return netsum =netsum+Math.max(sum1, sum2) ;

	}
}
