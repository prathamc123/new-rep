package ARRAYS__DOUBT__CLASS__1;

public class pair__of__Rosses {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 4 };
		int amt = 5;
		int minans = Integer.MAX_VALUE;
		int r1 = Integer.MAX_VALUE;
		int r2 = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (amt == arr[i] + arr[j]) {
					int newminans = Math.abs(arr[i] - arr[j]);
					if (minans > newminans) {
						r1 = arr[i];
						r2 = arr[j];
					}

				}
			}

		}
		if (r1 < r2) {
			System.out.println("Deepak should buy roses whose prices are " + r1 + " and " + r2 + ".");
		} else {
			System.out.println("Deepak should buy roses whose prices are " + r2 + " and " + r1 + ".");
			
		}
	}

}
