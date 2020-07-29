import java.util.*;

import SortingHashMAPValues.Student;



public class A {

	public static void main(String[] args) {
		HashMap<String,Student> map=new HashMap<>();
		
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
		
		
		List<Map.Entry<String, Student>> list=new ArrayList<>(map.entrySet());
		Collections.sort(list,new AgeComapretor());
		HashMap<String ,Student> temp=new LinkedHashMap<>();
		for(Map.Entry<String, Student> en:list) {
			temp.put(en.getKey(), en.getValue());
		}

	}
	
}
