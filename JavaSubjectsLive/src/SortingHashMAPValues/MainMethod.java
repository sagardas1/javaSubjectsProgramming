package SortingHashMAPValues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMethod {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>();

		
		
		Student e = new Student(null, 0);
		e.setName("sag");
		e.setRollNo(27);
		Student user = new Student(null, 0);
		user.setName("sq");
		user.setRollNo(21);

		
		
		Student user2 = new Student(null, 0);
		user2.setName("sqw");
		user2.setRollNo(200);

		
		map.put("sagar", e);
		map.put("sa", user);
		map.put("sag", user2);

		List<Map.Entry<String, Student>> list = new ArrayList<Map.Entry<String, Student>>(map.entrySet());

		Collections.sort(list, new MapValueComparator());

		for (Map.Entry<String, Student> e1 : list) {
			Student student = e1.getValue();
			System.out.println(student.getRollNo());
		}
	}
}
