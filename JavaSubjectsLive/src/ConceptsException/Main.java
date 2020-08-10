package ConceptsException;

import java.io.FileNotFoundException;
import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
	A aa =new A();
	try {
		aa.m1();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLClientInfoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
	}


