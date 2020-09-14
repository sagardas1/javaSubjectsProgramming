package sortingAlgo;

import java.util.*;
import java.util.Map.Entry;

import com.google.gson.Gson;

public class MainClass {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("vinaya");
		employee.setRedge(6);
		Employee employee1 = new Employee();
		employee1.setName("Sidharth");
		employee1.setRedge(2);
		Employee employee2 = new Employee();
		employee2.setName("Adu");
		employee2.setRedge(7);
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);

		Comparator<Employee> em = (emp1, emp2) -> {
			if (emp1.getRedge() > emp2.getRedge())
				return 1;
			else if (emp1.getRedge() < emp2.getRedge())
				return -1;
			else
				return 0;
		};

		Collections.sort(list, em);

		for (Employee e : list) {
			System.out.println(new Gson().toJson(e));
		}

		Map<String, Employee> map = new HashMap<String, Employee>();
		map.put(employee.getName(), employee);
		map.put(employee1.getName(), employee1);
		map.put(employee2.getName(), employee2);

		ArrayList<Map.Entry<String, Employee>> listt = new ArrayList<Entry<String, Employee>>(map.entrySet());
		
		
		Comparator<Map.Entry<String, Employee>> cmp=(emp1,emp2) ->{
			
			if(emp1.getValue().getRedge()>emp1.getValue().getRedge()) return 1;
			else if(emp1.getValue().getRedge()<emp1.getValue().getRedge()) return -1;
			else
			return 0;
		};

	}

}
