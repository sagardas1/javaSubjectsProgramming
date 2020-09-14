package methodReferance;

public class MainClass {
	public static void main(String[] args) {

		MyfunctionalInterface saysomething1 = () -> System.out.println("Sagardas");
		saysomething1.say();

//		MyfunctionalInterface saysomething = MethodReferance::saysomething;
//
//		saysomething.say();

	}
}
