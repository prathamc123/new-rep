package recursion___type__2__printing;

public class Jumping___numbers {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			jump(i, 100);
		}
	}

	public static void jump(int curr, int limit) {
		if(curr>limit) {
			return ;
		}
		if(curr<0) {
			return ;
		}
		System.out.println(curr);
		int digit = curr%10 ;
		jump(curr*10+digit+1,limit) ;
		if(digit>0) {
		jump(curr*10+digit-1, limit);
		}
	}
}
