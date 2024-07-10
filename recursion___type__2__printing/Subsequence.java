package recursion___type__2__printing;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subseq("abc","") ;
	}
	public static void subseq(String str ,String path) {
		if(str.isEmpty()) {
			System.out.println(path);
			return ;
		}
		char a = str.charAt(0) ;
		String remain = str.substring(1) ;
		subseq(remain,path+a) ;
		subseq(remain,path) ;
	}

}
