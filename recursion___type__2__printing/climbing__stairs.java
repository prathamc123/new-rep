package recursion___type__2__printing;

public class climbing__stairs {
static int count  = 0 ;
	public static void main(String[] args) {
		climb(10, "", 0);
		System.out.println(count);

	}
	public static void climb(int stairs , String path ,int start) {
		if(stairs==start) {
			System.out.println(path);
			count++ ;
			return ;
			}
		if(stairs<start) {
			
			return ;
		}
		climb(stairs,path+"1",start+1) ;
		climb(stairs,path+"2",start+2) ;
		
	}

}
