package ARRAYS__DOUBT__CLASS__1;

public class Trapping___rain___water {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 3, 0, 1, 0, 7, 0, 1, 0, 5, 0, 2 };
		int max = arr[0];
		int maxindex = 0;
		int k = 0;
		while (k < arr.length) {
			if (arr[k] > max) {
				max = arr[k];
				maxindex = k;
			}
			k++;
		}
		int water = 0;

		int i = 0;
		int j = 1;
		while (j < maxindex) {
			if (arr[i] > arr[j]) {
				water = water + arr[i] - arr[j];
				j++;
			} else {
				i = j;
				j++;
			}

		}
		j = arr.length - 2;
		i = arr.length - 1;
		while (j > maxindex) {
			if (arr[i] > arr[j]) {
				water = water + arr[i] - arr[j];
				j--;
			} else {
				i = j;
				j--;
			}
		}
		System.out.println(water);

	}

}
