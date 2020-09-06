package java8Features;

public class MyMethodReference {

	public static void main(String[] args) {

		MyMethodReferanceInterface in = A::method;
		in.say();

		A a = new A();
		MyMethodReferanceInterface i = a::method1;

	}

}

class A {

	public static void method() {
		System.out.println("method reference");
	}

	public void method1() {
		System.out.println("method reference");
	}

}