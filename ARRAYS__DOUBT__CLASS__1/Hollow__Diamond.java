package ARRAYS__DOUBT__CLASS__1;

import java.util.Scanner;

public class Hollow__Diamond {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in) ;
		int n =scn.nextInt() ;
		for(int i = 0 ;i<n ;i++) {
			System.out.print("* ");
		}
		System.out.println();
		int stars = n/2 ;
		int space = 1 ;
		boolean flag = true ;
		for(int r = 1 ;r<n-1 ;r++) {
			if(r<=n/2) {
				int j = 0 ;
				while(j<stars) {
					System.out.print("* ");
					j++ ;
				}
				int i = 0 ;
				while(i<space) {
					System.out.print("  ");
					i++ ;
				}
				int k = 0 ;
				while(k<stars) {
					System.out.print("* ");
					k++ ;
				}
				stars-- ;
				space=space+2;
				System.out.println();
				
			}else {
				stars++ ;
				if(flag==true) {
				space= n-2 ;
				flag =false ;
				}
				space=space-2 ;
				int j = 0 ;
				while(j<=stars) {
					System.out.print("* ");
					j++ ;
				}
				int i = 0 ;
				while(i<space) {
					System.out.print("  ");
					i++ ;
				}
				int k = 0 ;
				while(k<=stars) {
					System.out.print("* ");
					k++ ;
				}
				System.out.println();
			}
			
		}
		for(int i = 0 ;i<n ;i++) {
			System.out.print("* ");
		}


	}

}
