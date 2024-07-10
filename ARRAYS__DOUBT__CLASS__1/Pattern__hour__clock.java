package ARRAYS__DOUBT__CLASS__1;

import java.util.Scanner;

public class Pattern__hour__clock {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt() ;
		int nst = n ;
		int nsp = 0 ;
		for (int row = 0; row < 2*n-1; row++) {
				int j = 0 ;
				while(j<nsp) {
					System.out.print(" ");
					j++ ;
				}
				int i = 0 ;
				while(i<nst) {
					System.out.print("*"+" ");
					i++ ;
				}
				if(row<n-1) {
					nst-- ;
					nsp++ ;
				}else {
					nst++ ;
					nsp-- ;
				}
				
			System.out.println();
				
		}
		System.out.println(nst);

	}

}
