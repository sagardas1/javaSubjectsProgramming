package overload;

public class Class {

	public static int m1(int a) {
		return 10 * a;
	}

	@SuppressWarnings("unused")
	private static String m1(int a, int b) {
		return "sagar";
	}

	final char m1(int a, int b, int c) {
		return 'c';
	}

	public void main(String[] args) {
		@SuppressWarnings("unused")
		Class class1 = new Class();
	}
}
