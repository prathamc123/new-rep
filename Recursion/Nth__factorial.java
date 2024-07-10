package Recursion;

public class Nth__factorial {

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	public static long fact(int n) {
		if(n==0) {
			return 1 ;
		}
		long sp = fact(n-1) ;
		return n*sp;
	}

}
