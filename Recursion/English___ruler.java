package Recursion;

public class English___ruler {

	public static void main(String[] args) {
		int n = 3 ;
		for(int i = 0 ; i<n ; i++ ) {
			for(int j = 0 ;j<=n ; j++) {
				System.out.print("-");
			}
			System.out.println(i);
			ruler(4) ;
		}

	}
	public static void ruler(int n) {
		if(n==0) {
			return ;
		}
		ruler(n-1) ;
		for(int i = 0 ; i<n-1 ;i++) {
			System.out.print("-");
		}
		System.out.println();
		ruler(n-1) ;
	}

}
