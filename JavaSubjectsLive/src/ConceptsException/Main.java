package ConceptsException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		ListIterator<Integer> itr=a.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(itr.previous());
		}
		while(itr.hasNext()) { 	
			System.out.println(itr.next());
			System.out.println(itr.previous());
		}
	}

}
