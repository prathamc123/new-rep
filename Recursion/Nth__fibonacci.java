package Recursion;

public class Nth__fibonacci {

	public static void main(String[] args) {
		System.out.println(nthfibo(7));

	}

	public static int nthfibo(int n) {
		if(n<=1) {
			return n;
		}
		int sp1 = nthfibo(n - 1);
		int sp2 = nthfibo(n - 2);
		return sp1 + sp2;
	}

}
