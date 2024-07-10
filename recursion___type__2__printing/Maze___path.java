package recursion___type__2__printing;

public class Maze___path {

	public static void main(String[] args) {
		mazepath(0, 0, 2, 2, "");

	}
	public static void mazepath(int d ,int u , int row ,int col ,String path) {
		if(d>row || u>col) {
			
			return ;
		}
		if(d==row && u==col) {
			System.out.println(path);
		}
		mazepath(d+1, u, row, col, path+"d");
		mazepath(d, u+1, row, col, path+"r");
	}

}
