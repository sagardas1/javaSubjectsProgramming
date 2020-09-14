package methodReferance;

public class MethodReferanceFunctionality {

	public static void main(String[] args) {
		MyfunctionalInterface interface1 = () -> {
			System.out.println("I am a boy");
		};

		interface1.say();

	}
}
