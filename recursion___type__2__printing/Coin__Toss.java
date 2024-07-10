package recursion___type__2__printing;

public class Coin__Toss {

	public static void main(String[] args) {
		cointoss(3,"");
	}

	public static void cointoss(int coin, String path) {
		if(coin==0) {
			System.out.println(path);
			return ;
		}
		cointoss(coin - 1, path + "H");
		cointoss(coin - 1, path + "T");
	}

}
