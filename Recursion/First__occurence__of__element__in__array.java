package Recursion;

public class First__occurence__of__element__in__array {

	public static void main(String[] args) {
		int [] arr = {10,20,10,30,40,50} ;
		System.out.println(fo(arr,4,10));

	}
	public static int fo(int [] arr, int i ,int ele) {
		if(i==arr.length) {
			return -1 ;
		}
		int sp = fo(arr,i+1 ,ele) ;
		if(arr[i]==ele) {
			return i ;
		}else {
			return sp ;
		}
		
	}

}
