package Recursion;

public class Print__Array__using__recursion {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7} ;
//		reverse(arr,0,arr.length-1) ;
//		print(0,arr) ;
		reverseprint(arr,0) ;
		System.out.println();
		System.out.println(maxele(arr,0));
		

	}
	public static void print(int i ,int [] arr) {
		if(i==arr.length) {
			return ;
		}
		System.out.print(arr[i]+" ");
		print(i+1,arr) ;
	}
	public static void reverse(int[]arr,int s,int e) {
		if(s>=e) {
			return ;
		}
		int temp = arr[s] ;
		arr[s] = arr[e] ;
		arr[e] = temp ;
		reverse(arr,s+1,e-1) ;
		
		
	}
	public static void reverseprint(int arr[] ,int i) {
		if(i==arr.length) {
			return ;
		}
		reverseprint(arr,i+1) ;
		System.out.print(arr[i]+" ");
	}
	public static int maxele(int [] arr,int i) {
		if(i==arr.length) {
			return Integer.MIN_VALUE ;
		}
		int sp1 =maxele(arr,i+1) ;
		return Math.max(sp1, arr[i]) ;
	}

}
