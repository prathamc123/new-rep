package Recursion;

public class Coin__denomination {

	public static void main(String[] args) {
		int amt = 5 ;
		int [] arr = {1,2,3,4} ;
		CD(arr,5,"",0) ;

	}public static void CD(int [] arr , int amt , String path,int s) {
		
		if(amt<0 || s==arr.length) {
			return  ;
		}
		if(amt==0) {
			System.out.println(path);
			return ;
		}
		
		CD(arr, amt-arr[s], path+arr[s], s);
		CD(arr,amt,path,s+1) ;
	} 
	
}
