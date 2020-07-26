package SortingHashMAPValues;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MapValueComparator implements Comparator{

	
	@Override
	public int compare(Object o1, Object o2) {
		
		
		Map.Entry<String, Student> map1=(Entry<String, Student>) o1;
		Map.Entry<String, Student> map2=(Entry<String, Student>) o2;
    Student student1=map1.getValue();
    Student student2=map2.getValue();
    
    if(student1.getRollNo()>student2.getRollNo()) {return 1;}
    else if(student1.getRollNo()<student2.getRollNo()) {return -1;}else return 0;
    
    
		
	}

}
