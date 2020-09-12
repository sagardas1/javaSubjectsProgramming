package overRiding;

import java.nio.file.FileAlreadyExistsException;

import inheritance.Animal;
import inheritance.Dog;

public class ParentClass {

	ParentClass() {
		System.out.println("parentgsdvfhvsh");
	}

	void m1() throws FileAlreadyExistsException {
		System.out.println("m1() parent Class");
	}

	Dog m3() {
		System.out.println("m2() parent Class");
		return null;
	}
}
