package overRiding;

import java.io.FileNotFoundException;

import inheritance.Dog;

public class ParentClass {

	ParentClass() {
		System.out.println("parentgsdvfhvsh");
	}

	void m1() throws FileNotFoundException  {
		System.out.println("m1() parent Class");
	}

	Dog m3() {
		System.out.println("m2() parent Class");
		return null;
	}

	void m6() throws FileNotFoundException{
		System.out.println();
	}
}
