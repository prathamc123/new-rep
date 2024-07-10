package ARRAYS__DOUBT__CLASS__1;

import java.util.Arrays;
import java.util.Scanner;

public class Pair__of__roses__optimised {
	static Scanner scn = new Scanner(System.in) ;
	public static void main(String[] args) {
		int not = scn.nextInt() ;
		for(int i = 0 ;i<not ;i++) {
			int nor = scn.nextInt() ;
			int [] arr =new int[nor] ;
			inputarr(arr) ;
			int amt = scn.nextInt() ;
			pair(arr,amt) ;
		}

	}
	public static void inputarr(int[] arr) {
		for(int i=0 ; i<arr.length;i++) {
			arr[i] = scn.nextInt() ;
		}
	}
	public static void pair(int[] arr,int amt) {
		Arrays.sort(arr); 
		int i = 0 ;
		int j = arr.length-1 ;
		int ans = Integer.MAX_VALUE ;
		int r1 = Integer.MAX_VALUE ;
		int r2 = Integer.MAX_VALUE ;
		while(i<j) {
			if((arr[i]+arr[j])==amt) {
				
				if(ans>Math.abs(arr[i]-arr[j])){
					ans= Math.abs(arr[i]-arr[j]) ;
					r1 = Math.min(arr[i],arr[j]) ;
					r2 = Math.max(arr[i], arr[j]) ;
			
				}
				i++ ;
				j-- ;
			}
			else if((arr[i]+arr[j])<amt) {
				i++ ;
			}
			else {
				j-- ;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + r1 + " and " + r2 + ".");
		
	}

}
