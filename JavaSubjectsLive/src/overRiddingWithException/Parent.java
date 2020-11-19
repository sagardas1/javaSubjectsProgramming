package overRiddingWithException;

import java.io.FileNotFoundException;
import java.sql.SQLClientInfoException;

public class Parent {

	public void m1() throws FileNotFoundException {
		System.out.println("this method is in Parent class");
		
		
	}
}
