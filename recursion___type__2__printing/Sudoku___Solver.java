package recursion___type__2__printing;

public class Sudoku___Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
							{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
							{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
							{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, 
							{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
							{ '7', '.', '.', '.', '2', '.', '.', '.', '6' },
							{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
							{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, 
							{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		
		sudoku(0, 0, arr);
//		print(arr) ;
		
	}

	public static void sudoku(int r, int c, char[][] arr) {
		if (c == 9) {
			c = 0;
			r++;
		}
		if (r == 9) {
			print(arr);
			System.out.println("==================");
			return;
		}
		if (arr[r][c] != '.') {
			sudoku(r, c + 1, arr);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (issafe(arr, r, c, i)) {
					arr[r][c] = (char) ('0' + i);
					sudoku(r, c + 1, arr);
				}

			}
			arr[r][c] = '.';
		}
	}

	public static void print(char ch[][]) {
		System.out.print('[');
		for (int r = 0; r < ch.length; r++) {
			System.out.print('[');
			for (int c = 0; c < ch.length; c++) {
				System.out.print('"');
				System.out.print((ch[r][c]));
				System.out.print('"');
				System.out.print(',');
			}
			System.out.print(']');
			System.out.println();
		}
		System.out.print(']');
	}

	public static boolean issafe(char[][] arr, int r, int c, int num) {
		int row = r;
		for (int i = 0; i < 9; i++) {
			if (arr[row][i] == '0' + num) {
				return false;
			}
		}
		int col = c;
		for (int i = 0; i < 9; i++) {
			if (arr[i][col] == '0' + num) {
				return false;
			}
		}
	
		int boxr = r/3 ;
		int boxc = c/3 ;
		for(int row1 = boxr*3 ; row1<boxr*3+3 ;row1++ ) {
			for(int col1 = boxc*3 ; col1<boxc*3+3 ;col1++) {
				if(arr[row1][col1]==(char)('0'+num)) {
					return false ;
				}
			}
		}
		return true;

	}

}
