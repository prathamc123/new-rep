package ARRAYS__DOUBT__CLASS__1;

public class Maximum__circular__sum {

	public static void main(String[] args) {
		int [] arr = {8 ,-8, 9, -9, 10, -11, 12};
		
		if(kadane(arr)>revkadane(arr)) { 
			System.out.println(kadane(arr));
		}else {
			System.out.println(revkadane(arr));
		}
	}
	public static int revkadane(int [] arr) {
		for(int i = 0 ;i<arr.length;i++) {
			arr[i] =-1*arr[i] ;
		}
		int i = 0 ;
		int currbest = Integer.MIN_VALUE ;
		int prevbest = Integer.MIN_VALUE ;
		while(i<arr.length) {
			if(prevbest>0) {
				prevbest =prevbest + arr[i] ;
			}else {
				prevbest = arr[i] ;
			}
			
			if(currbest<prevbest) {
				currbest=prevbest ;
			}	
			i++ ;
		}
		int sum = 0 ;
		for(int j = 0 ;j<arr.length;j++) {
			arr[j] =-1*arr[j] ;
			sum=sum+arr[j] ;
		}
		return sum+currbest ;
		
	}
	public static int kadane(int[] arr) {
		int i = 0 ;
		int currbest = Integer.MIN_VALUE ;
		int prevbest = Integer.MIN_VALUE ;
		while(i<arr.length) {
			if(prevbest>0) {
				prevbest =prevbest + arr[i] ;
			}else {
				prevbest = arr[i] ;
			}
			
			if(currbest<prevbest) {
				currbest=prevbest ;
			}			
			i++ ;
		}
		return currbest ;
		
	}

}
