class Derived {
	
	public void getDetails(String s) {
		System.out.println("Derived class " + s);
	}
}

public class Base extends Derived {

	public void getDetails(String s) {
		System.out.println("Base class " + s);
	}

	public static void main(String[] args) {
		Derived derived = new Base();

		Base obj = (Base) derived;
		obj.getDetails("TEST");
	}
}