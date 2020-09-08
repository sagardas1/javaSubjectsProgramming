package overRiding;

public class ChildClass extends ParentClass {

	ChildClass() {
		System.out.println("dhsvfg");
	}

	@Override
	protected void m1() {
		System.out.println("m1() child class");
	}

	public void m3() {
		System.out.println("m3() child class");
	}

}
