package overRiding;

import java.nio.file.FileAlreadyExistsException;

import inheritance.Animal;
import inheritance.Dog;

public class ChildClass extends ParentClass {

	ChildClass() {
		System.out.println("dhsvfg");
	}

	@Override
	protected void m1() throws FileAlreadyExistsException{
		System.out.println("m1() child class");
	}

	@Override
	public Dog m3() {
		System.out.println("m3() child class");
		return null;
	}
	
//	private void m6() {
		
	//}

}
