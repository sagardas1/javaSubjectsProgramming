package overload;

public class Class {

	public void m1(Object a) {
		System.out.println("object");
	}

	
	public void m1(String a) {
		System.out.println("String");
	}
	public static void main(String[] args) {
		Class class1 = new Class();
		class1.m1(null);
	}
}
