package recursion___type__2__printing;

public class Rat__In__a__maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0, }, 
				{ 0, 1, 0, 0 }, 
				{ 0, 0, 1, 0 } };
		maze(mat,0,0,"", new boolean [4][4]) ;
	}

	public static void maze(int[][] arr, int r, int c,String path ,boolean [][] store) {
		if(r<0 || r>=arr.length || c<0 || c>=arr[0].length || arr[r][c]==1 ||store[r][c]==true) {
			return ;
		}
		if(r==arr.length-1 && c==arr[0].length-1) {
			System.out.println(path);

			return ;
		}

		store [r][c]=true ;
		maze(arr,r-1,c,path+"u",store) ;
		maze(arr,r+1,c,path+"d",store) ;
		maze(arr,r,c+1,path+"r",store) ;
		maze(arr,r,c-1,path+"l",store) ;
		store [r][c]=false ;
		
		
		
	}

}
