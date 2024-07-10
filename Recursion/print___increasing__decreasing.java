package Recursion;

public class print___increasing__decreasing {

	public static void main(String[] args) {
		pid(5,1);

	}

	public static void pid(int n , int i) {
		if (n==0 ) {
			return;
		}
		System.out.println(i);
		pid(n - 1,i+1);
		System.out.println(i);
		
	}

}
