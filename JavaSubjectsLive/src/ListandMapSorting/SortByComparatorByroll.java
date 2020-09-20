package ListandMapSorting;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SortByComparatorByroll implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		@SuppressWarnings("unchecked")
		Map.Entry<String, Employee> m1 = (Entry<String, Employee>) o1;
		@SuppressWarnings("unchecked")
		Map.Entry<String, Employee> m2 = (Entry<String, Employee>) o2;

		
		Employee e1 = m1.getValue();
		Employee e2 = m2.getValue();

		if (e1.getRollNo() > e2.getRollNo())
			return 1;
		else if (e1.getRollNo() < e2.getRollNo())
			return -1;
		else
			return 0;

	}

}
