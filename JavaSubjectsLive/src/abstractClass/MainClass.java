package abstractClass;

public class MainClass {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ImplimentationClass class1 = new ImplimentationClass();
		System.out.println(class1.getPassword());
		class1.getName();
		class1.m1();
		// class1.m2();
	}

}
