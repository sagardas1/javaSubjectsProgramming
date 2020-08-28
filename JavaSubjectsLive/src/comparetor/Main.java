package comparetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee e = new Employee();
		e.setName("saga");
		e.setRoll(1);
		Employee e1 = new Employee();
		e1.setName("saga");
		e1.setRoll(2);
		Employee e2 = new Employee();
		e2.setName("saga");
		e2.setRoll(5);
		Employee e3 = new Employee();
		e3.setName("saga");
		e3.setRoll(0);
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);

		Collections.sort(list, new AgeComparetor());
		Iterator<Employee> itr2 = list.iterator();
		while (itr2.hasNext()) {
			Employee st = (Employee) itr2.next();
			System.out.println(st.getRoll() + " " + st.getName());
		}

	}

}
