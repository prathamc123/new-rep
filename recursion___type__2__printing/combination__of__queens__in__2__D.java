package recursion___type__2__printing;

public class combination__of__queens__in__2__D {

	public static void main(String[] args) {
		com(2, 3, 0, 0, 3, "");
	}

	public static void com(int toselect, int column, int col, int r, int  row, String path) {
		if(toselect==0) {
			System.out.println(path);
			return ;
		}
		if(col==column) {
			col=0 ;
			r++ ;
		}if(r==row) {
			return ;
		}
		

		com(toselect - 1, column, col + 1, r, row, path + "Q" + "(" + r + "," + col + ")");
		com(toselect, column, col + 1, r, row, path);
	}

}
