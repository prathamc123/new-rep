package recursion___type__2__printing;

public class Combination__Of__Two__Queens {

	public static void main(String[] args) {
		com(2,4,0,"") ;

	}
	public static void com(int toselect ,int column ,int col ,String path) {
		if(toselect==0) {
			System.out.println(path);
			return ;
		}
		if(col>=column) {
			return ;
		}
		com(toselect-1,column, col+1, path+"b"+col);
		com(toselect,column,col+1,path) ;
	}

}
