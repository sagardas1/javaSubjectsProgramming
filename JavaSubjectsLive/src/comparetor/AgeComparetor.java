package comparetor;

import java.util.Comparator;

public class AgeComparetor implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		Employee employee = (Employee) o1;
		Employee employee1 = (Employee) o2;

		
		if (employee.getRoll() > employee1.getRoll()) {
			return -1;
		} else if (employee.getRoll() < employee1.getRoll()) {
			return 1;
		} else {
			return 0;
		}

	}
}
