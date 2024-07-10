package recursion___type__2__printing;

public class Lexicographic___Counting {

	public static void main(String[] args) {
	for(int j = 1 ;j<=9 ;j++) {
		lexico(j,1000);
	}
	}

	public static void lexico(int curr ,int limit) {
		if(curr>limit) {
			return  ;
		}
		System.out.println(curr);
		for(int i = 0 ;i<=9 ;i++) {
			lexico(curr*10+i , limit) ;
		}
	}

}
