package comparetor;

import java.util.Comparator;

public class Employee implements Comparator {
	private String name;
	private int roll;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Employee a1 = (Employee) o1;
		Employee a2 = (Employee) o2;

		if (a1.getRoll() > a2.getRoll()) {
			return -10;
		} else if (a1.getRoll() < a2.getRoll()) {
			return 10;
		} else
			return 0;

	}

}
