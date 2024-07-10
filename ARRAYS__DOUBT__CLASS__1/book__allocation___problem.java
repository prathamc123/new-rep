package ARRAYS__DOUBT__CLASS__1;

import java.util.Scanner;

public class book__allocation___problem {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	int t = scn.nextInt();
	for(int m = 0; m<t ;m++) {
	int nb = scn.nextInt() ;
	int ns = scn.nextInt() ;
	int [] arr = new int [nb] ;
	in(arr) ;
	int num = 0 ;
	for(int i = 0 ;i<arr.length;i++) {
		num = num + arr[i] ;
	}
	int s = 0 ;
	int e = num ;
	int ans = e ;
	while(s<=e) {
		int mid =(s+e)/2 ;
		if(binarysearch(arr,ns,mid)) {
			e = mid-1 ;
			ans =mid ;
		}else {
			s = mid+1 ;
		}
	}
	System.out.println(ans);
	
	

	}
	}
	public static void in(int[] arr) {
		for(int i = 0 ;i<arr.length;i++) {
			arr[i] = scn.nextInt() ;
		}
	}
	public static boolean binarysearch(int [] arr, int ns ,int max) {
		int i = 0 ;
		int load = 0 ;
		int curr_s = 1 ;
		while(i<arr.length) {
			load =load + arr[i] ;
			if(load>max) {
				load= 0 ;
				curr_s++ ;
			}else {
				i++ ;
			}
			if(curr_s>ns) {
				return false ;
			}
		}
		return true ;
	}

}
