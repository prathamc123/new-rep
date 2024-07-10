package recursion___type__2__printing;

public class Word___search {
	static boolean ret = false;

	public static void main(String[] args) {
		char[][] arr = { { 'A', 'B', 'C', 'E' },
						{ 'S', 'F', 'C', 'S' }, 
						{ 'A', 'D', 'E', 'E' } };
		String str = "SEE";
		char ch =str.charAt(0) ;
		for(int row = 0 ;row<arr.length;row++) {
			for(int col = 0 ; col<arr[0].length;col++) {
		if(arr[row][col]==ch) {
		existing(arr, "", row, col, new boolean[arr.length][arr[0].length], str.length(),str);
			}
			}
		}
		System.out.println(ret);

	}

	public static void existing(char[][] board, String word, int r, int c, boolean[][] visited, int n, String str) {
		if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || visited[r][c] == true) {

			if (word.length() >= n) {
				if (word.equals(str)) {
					ret = true;
				}
				return;
			}

			return;
		}
		char ch =str.charAt(0) ;
		if(board[r][c]==ch) {
		visited[r][c] = true;
		existing(board, word + board[r][c], r + 1, c, visited, n, str);/// d
		existing(board, word + board[r][c], r - 1, c, visited, n, str);/// u
		existing(board, word + board[r][c], r, c + 1, visited, n, str);/// r
		existing(board, word + board[r][c], r, c - 1, visited, n, str);/// l
		visited[r][c] = false;  
		}
	}

}
