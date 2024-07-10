package recursion___type__2__printing;

public class Tower__of___hanoi {

	public static void main(String[] args) {
		TOH(3,'a','b','c') ;
	}
	public static void TOH(int rings , char source ,char helper ,char destination) {
		if(rings==0) {
			return ;
		}
		TOH(rings-1,source ,destination,helper) ;
		System.out.println(rings+" from "+source+" to "+destination);
		TOH(rings-1,helper,source,destination) ;
	}
}
