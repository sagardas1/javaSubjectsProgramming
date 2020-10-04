package WrapperConcept;

public class Wrapper {
	public static void main(String[] args) {
		
		Integer a = 127;
		Integer b = 127;

		if (a == b) {
			
			
			
			
			System.out.println("equals");
		} else {
			System.out.println("not");
		}

		if (a.equals(b)) {
			System.out.println("equals");
		} else {
			System.out.println("not");
		}
	}

}
