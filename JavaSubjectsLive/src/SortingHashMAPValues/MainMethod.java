package SortingHashMAPValues;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Comparable.User;

public class MainMethod {

	public static void main(String[] args) {

		HashMap<String, Student> map = new HashMap<>();

		Student e = new Student();
		e.setName("sag");
		e.setRollNo(27);
		Student user = new Student();
		user.setName("sq");
		user.setRollNo(21);

		Student user2 = new Student();
		user2.setName("sqw");
		user2.setRollNo(200);

		map.put("sagar", e);
		map.put("sa", user);
		map.put("sag", user2);

		sortmap(map);

	}

	public static HashMap<String, Student> sortmap(HashMap<String, Student> map) {
		
		List<Map.Entry<String, Student>> sort=new ArrayList<Map.Entry<String,Student>>(map.entrySet());
		
		
		List<Map.Entry<String, Student>> list = new ArrayList<Map.Entry<String, Student>>(map.entrySet());

		Collections.sort(list, new MapValueComparator());

		HashMap<String, Student> temp = new LinkedHashMap<String, Student>();

		for (Map.Entry<String, Student> m : list) {
			temp.put(m.getKey(), m.getValue());

		}
		Set<Map.Entry<String, Student>> map3 = temp.entrySet();
		for (Map.Entry<String, Student> m8 : map3) {
			System.out.print(m8.getKey() + "    ");
			System.out.println(((Student) m8.getValue()).getRollNo());
		}

		return null;
	}
}
