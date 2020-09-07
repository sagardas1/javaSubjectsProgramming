package superClass;

public class Child extends ParentClass {

	int a;
	int b;

	Child(int a, int b) {
		super(100, 200);
		this.a = a;

		this.b = b;

	}

	public static void main(String[] args) {
		Child child = new Child(11, 12);
		System.out.println(child.a);
		child.m1();
	}

}
