package ExceptionHandle;

public class Exception {

	public void method() {

		try {
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
	}
}
