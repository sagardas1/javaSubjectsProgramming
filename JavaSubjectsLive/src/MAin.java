
public class MAin {
	
	public static void main(String[] args) {
		m1(null);
		
	}

	@SuppressWarnings("unused")
	private static void m1(Object object) {
	System.out.println("object");
		
	}
	private static void m1(String object) {
		System.out.println("string");
		
	}
	
	

}
