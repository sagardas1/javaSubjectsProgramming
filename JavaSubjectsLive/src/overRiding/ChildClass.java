package overRiding;

import java.nio.file.FileAlreadyExistsException;

import inheritance.Animal;
import inheritance.Dog;

public class ChildClass {

	public static void main(String[] args) {
		String x = "a";
		// Runnable r=()->System.out.println(x);
		x = "b";
		// r.run();

		"b".equals(x);

		int d = 20;
		String a = d + "".toString();

	}

}
