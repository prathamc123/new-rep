package Recursion;

public class print__decreasing {

	public static void main(String[] args) {
		printdecreasing(7) ;

	}
	public static void printdecreasing(int n) {
		if(n==0) {
			return ;
		}
		System.out.println(n) ;
		printdecreasing(n-1) ;
		
	}

}
