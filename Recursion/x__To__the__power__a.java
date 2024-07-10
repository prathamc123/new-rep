package Recursion;

public class x__To__the__power__a {

	public static void main(String[] args) {
		System.out.println(pow(2,10));

	}
	public static int pow(int a ,int x) {
		if(x==0) {
			return 1;
		}
		int sp = pow(a,x-1) ;
		return sp*a ;
	}

}
