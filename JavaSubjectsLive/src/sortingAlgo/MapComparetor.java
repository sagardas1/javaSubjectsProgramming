package sortingAlgo;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MapComparetor implements Comparator<Map.Entry<String, Employee>> {

	@Override
	public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
		Employee e1 = o1.getValue();
		Employee e2 = o2.getValue();

		if (e1.getRedge() > e2.getRedge()) {
			return 1;

		} else if (e1.getRedge() < e2.getRedge()) {
			return -1;
		} else
			return 0;
	}

}
