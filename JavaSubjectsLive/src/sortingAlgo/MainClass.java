package sortingAlgo;

import java.util.*;
import java.util.Map.Entry;

import com.google.gson.Gson;

public class MainClass {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("vinaya");
		employee.setRedge(1);
		Employee employee1 = new Employee();
		employee1.setName("Sidharth");
		employee1.setRedge(2);
		Employee employee2 = new Employee();
		employee2.setName("Adu");
		employee2.setRedge(6);
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		Collections.sort(list, new MyComparator());

		Map<String, Employee> map = new HashMap<String, Employee>();
		map.put(employee.getName(), employee);
		map.put(employee1.getName(), employee1);
		map.put(employee2.getName(), employee2);

		ArrayList<Map.Entry<String, Employee>> listt = new ArrayList<Entry<String, Employee>>(map.entrySet());
		Collections.sort(listt, new MapComparetor());
		for (Map.Entry<String, Employee> entry : listt) {
			System.out.print(entry.getKey() + "  ");
			System.out.println(new Gson().toJson(entry.getValue()));
		}

		System.out.println(new Gson().toJson(list));
	}

}
