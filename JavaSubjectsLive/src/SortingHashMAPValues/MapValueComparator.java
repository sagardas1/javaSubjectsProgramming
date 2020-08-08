package SortingHashMAPValues;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MapValueComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		Map.Entry<String, Student> m1=(Entry<String, Student>) o1;
		Map.Entry<String, Student> m2=(Entry<String, Student>) o2;
		
		Student s1=m1.getValue();
		Student s2=m2.getValue();
		
		if(s1.getRollNo()>s2.getRollNo()) {return 1;}else if(s1.getRollNo()<s2.getRollNo()) {return -1;} else return 0;
		
		
		
	}

	
	

}
