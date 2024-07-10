package recursion___type__2__printing;

public class generate___parenthesis {

	public static void main(String[] args) {
		parenth(0, 0, "", 4);
	}

	public static void parenth(int open, int closed, String path, int num) {
		if (open > num || closed > num) {

			return;
		}
		if (open < closed) {
			return;
		}
		if (open == num && closed == num) {
			System.out.println(path);
		}

		parenth(open + 1, closed, path + "(", num);

		parenth(open, closed + 1, path + ")", num);

	}

}
