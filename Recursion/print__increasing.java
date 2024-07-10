package Recursion;

public class print__increasing {

	public static void main(String[] args) {
		pi(7) ;

	}
	public static void pi(int n) {
		if(n==0) {
			return ;
		}
		pi(n-1) ;
		System.out.println(n);
	}

}
