package recursion___type__2__printing;

public class permutation____of__boxes {

	public static void main(String[] args) {
		permutation(new boolean[4] , 2,"",4) ;
	}

	public static void permutation(boolean[] selectedbox, int toselect, String path, int numbox) {
		if(toselect==0) {
			System.out.println(path);
			return ;
		}

		for (int i = 0; i < numbox; i++) {
			if(selectedbox[i]==false) {
			selectedbox[i] = true ;
			permutation(selectedbox, toselect - 1, path + "b" + i, numbox);
			selectedbox[i]=false ;
			}
		}

	}

}
