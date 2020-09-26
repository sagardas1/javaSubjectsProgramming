
public class Example {

	public static void m1() throws MyExceptionProvide {
		int b = 0;
		if (b == 0) {

			throw new MyExceptionProvide("b cant be zero");
		}
	}

	
	
	public static void main(String[] args) {
		try {

			m1();
		} catch (MyExceptionProvide e) {
			e.getMessage1();
		}
	}
}
