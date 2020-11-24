package overRiddingWithException;

import java.io.FileNotFoundException;

public class Child extends Parent {
	@Override
	public void m1() throws FileNotFoundException {
		
		System.out.println("this is in child class ");

	}

	
}
