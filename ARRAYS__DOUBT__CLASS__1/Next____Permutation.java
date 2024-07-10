package ARRAYS__DOUBT__CLASS__1;

import java.util.Arrays;
import java.util.Scanner;

public class Next____Permutation {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int test = scn.nextInt();
		for (int i = 0; i < test; i++) {
			int n1 = scn.nextInt();
			int[] arr1 = new int[n1];
			in(arr1);
			nxtper(arr1);
			print(arr1);
			System.out.println();
		}

	}

	public static void in(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void nxtper(int[] arr) {
		int j = arr.length - 1;
		while (j > 0) {
			if (arr[j - 1] < arr[j]) {
				j = j - 1;
				break;
			}
			j--;
		}
		boolean flag1 = false ;
		int g= arr.length-1 ;
		while(g>0) {
			if(arr[g-1]<arr[g]) {
				flag1=true ;
			}
			g-- ;
		}
		if (j >= 0 && flag1 == true) {
			int i = j + 1;
			int dif = arr.length;
			int num = 0;
			int numin = 0;

			boolean flag =false ;
			while (i < arr.length) {
				int newdif = arr[i] - arr[j] ;
				if(flag==false) {
					num = arr[i];
					numin = i;
					flag =true ;
				}
				else if (newdif < dif && newdif > 0) {
					num = arr[i];
					numin = i;
				}
				i++;
			}

			int x = arr[numin];
			arr[numin] = arr[j];
			arr[j] = x;	
			j = j + 1 ;
			if (j < arr.length) {
				int k = arr.length - 1;
				while (j < k) {

					int y = arr[j];
					arr[j] = arr[k];
					arr[k] = y;
					j++;
					k--;
				}
			}
		} else if(arr.length==2){
			int x = arr[0] ; 
			arr[0]=arr[1] ;
			arr[1]=x ;
			
		} else{
			Arrays.sort(arr);

		}
	}

}
