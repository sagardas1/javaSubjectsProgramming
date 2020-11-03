package ExceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		ExceptionExample example = new ExceptionExample();
		example.mi();
	}
	
	

	public void mi() {

		System.out.println("no exception");
		System.out.println("no exception");
		System.out.println("no exception");
		System.out.println("no exception");
		try {
			if (1 / 0 == 0) {
				System.out.println("exception happeends exception");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after exception");
		System.out.println("after exception");

		System.out.println("after exception");
	}
}
