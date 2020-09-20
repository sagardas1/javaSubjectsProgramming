package methodReferance;

interface Sayable {
	void say();
}

public class MethodReferance {

	public static void main(String[] args) {
		MethodReferance methodReferance = new MethodReferance();

		Sayable sayable = MethodReferance::hey;
		Sayable sayable1 = methodReferance::hello;
		sayable.say();
		sayable1.say();

	}

	public static void hey() {
		System.out.println("hey");
	}

	public void hello() {
		System.out.println("hello");
	}
}
