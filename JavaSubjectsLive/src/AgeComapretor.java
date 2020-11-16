import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import SortingHashMAPValues.Student;

public class AgeComapretor implements Comparator<Map.Entry<String, Student>> {

	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {

		
		
		Student s1 = o1.getValue();
		Student s2 = o2.getValue();

		if (s1.getRollNo() > s2.getRollNo())
			return 1;
		else if (s1.getRollNo() < s2.getRollNo())
			return -1;

		else

			return 0;
	}

}
