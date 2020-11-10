package ConceptsException;

import java.io.FileNotFoundException;
import java.sql.SQLClientInfoException;

public class Main {

	public static void main(String[] args) {
		
		

		A aa = new A();
		try {
			aa.m1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLClientInfoException e) {
			e.printStackTrace();
		}
	}
}
