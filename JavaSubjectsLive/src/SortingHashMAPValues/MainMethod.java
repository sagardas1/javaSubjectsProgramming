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

	@SuppressWarnings("unchecked")
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
		
		
		List<Map.Entry<String, Student>> list=new ArrayList<Map.Entry<String,Student>>(map.entrySet());
		
		
		Collections.sort(list, new MapValueComparator());
		

		
		for(Map.Entry<String, Student> e1:list) {
			Student student=e1.getValue();
			System.out.println(student.getRollNo());
		}
	}
	}

	
