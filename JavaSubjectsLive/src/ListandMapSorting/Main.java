package ListandMapSorting;

import java.util.*;

import com.google.gson.Gson;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("sagar");
		employee1.setRollNo(29);

		Employee employee2 = new Employee();
		employee2.setName("Sidharth");
		employee2.setRollNo(15);

		HashMap<String, Employee> mao = new HashMap<String, Employee>();
		mao.put(employee1.getName(), employee1);
		mao.put(employee2.getName(), employee2);

		ArrayList<Map.Entry<String, Employee>> list = new ArrayList<Map.Entry<String, Employee>>(mao.entrySet());

		Comparator<Map.Entry<String, Employee>> ent = (obj1, obj2) -> {
			return obj1.getValue().getName().compareTo(obj2.getValue().getName());
		};
		Collections.sort(list, ent);

		for (Map.Entry<String, Employee> en : list) {
			System.out.println(new Gson().toJson(en.getValue()));

		}
	}

}
