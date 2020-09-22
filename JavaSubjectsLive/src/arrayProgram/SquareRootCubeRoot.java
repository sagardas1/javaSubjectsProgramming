package arrayProgram;

public class SquareRootCubeRoot {
	public static void main(String[] args) {
		int number = 3;
		double t;

		double squareroot = number / 2;
		System.out.println(squareroot);

		do {
			t = squareroot;// 1
			squareroot = (t + (number / t)) / 2;
		} while ((t - squareroot) != 0);

		System.out.println(squareroot);
	}

}
