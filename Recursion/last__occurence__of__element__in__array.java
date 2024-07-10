package Recursion;

public class last__occurence__of__element__in__array {

	public static void main(String[] args) {
		int [] arr = {10,20,10,30,40,50} ;
		System.out.println(lo(arr,3,10));

	}
	public static int lo(int[] arr ,int i,int ele) {
		if(i==arr.length) {
			return -1 ;
		}
		int sp = lo(arr,i+1,ele) ;
		if(sp==-1) {
			if(arr[i]==ele) {
				return i ;
			}
		}
			return sp ;
		
	}

}
