package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
	
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		for(int i:a) {
			if(i==3)
			a.remove(3);
			
		}
		
		Iterator< Integer> itr=a.iterator();
		while(itr.hasNext()) {
			itr.next();
			
		}
		Iterator< Integer> list=a.listIterator();
		while(list.hasNext()) {
		
			a.add(10);
			a.remove(1);
			
		}
 		
	}

}
