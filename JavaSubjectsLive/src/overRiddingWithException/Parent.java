package overRiddingWithException;

import java.io.FileNotFoundException;

public class Parent {

	public void m1() throws FileNotFoundException {
		System.out.println("this method is in Parent class");
	}
}
