package recursion___type__2__printing;

public class Combination____Climbing___stairs {

	public static void main(String[] args) {
		combination(4,"",1,0) ;

	}

	public static void combination(int stairs ,String path,int count,int start) {
		if(start==stairs) {
			System.out.println(path);
			return ;
		}
		if(start>stairs) {
			return ;
		}
		if(count==1) {
		combination(stairs, path+"1", 1, start+1);
		}
		if(count<=2) {
		combination(stairs, path+"2", 2, start+2);
		}
//		if(count<=3) {
//		combination(stairs, path+"3", 3, start+3);
//		}
		
	}

}
