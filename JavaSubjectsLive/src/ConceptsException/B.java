package ConceptsException;

import java.sql.SQLClientInfoException;

public class B extends A{

	@Override
	public void m1() throws SQLClientInfoException{
		System.out.println("B class");
	}
}
