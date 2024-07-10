package recursion___type__2__printing;

public class N__queens__Such__that__not__cancel__each__other {

	public static void main(String[] args) {
		queen(0, 3, 0, 3, 2, "", new boolean[3][3]);
	}

	public static void queen(int c, int col, int r, int row, int nqueen, String path, boolean[][] arr) {
		if (nqueen == 0) {
			System.out.println(path);
			return;
		}
		if (c == col) {
			r++;
			c = 0;
		}
		if (r == row) {
			return;
		}
		if (issafe(r, c, arr)) {
			arr[r][c] = true ;
			queen(c + 1, col, r, row, nqueen - 1, path + "{" + r + "," + c + "}", arr);
			arr[r][c] = false ;
		}
		queen(c + 1, col, r, row, nqueen, path, arr);
	}

	public static boolean issafe(int r, int c, boolean[][] arr) {
		for (int i = r; i >= 0; i--) {
			if (arr[i][c] == true) {
				return false;
			}

		}
		for (int i = c; i >= 0; i--) {
			if (arr[r][i] == true) {
				return false;
			}
		}
		int x = r;
		int y = c;
		while (x >= 0 && y >= 0) {
			if (arr[x][y] == true) {
				return false;
			}
			x--;
			y--;
		}

		x = r;
		y = c;
		while (x >= 0 && y < arr[0].length) {
			if (arr[x][y] == true) {
				return false;
			}
			x--;
			y++;
		}
		return true;
	}

}
