package Comparable;

import java.util.ArrayList; 

import java.util.Collections;
import java.util.List;

public class MainMethod {

	public static void main(String[] args) {
		
		

		List<User> set = new ArrayList<>();
		User e = new User();
		e.setName("sag");
		e.setRollNo(27);
		User user = new User();
		user.setName("sq");
		user.setRollNo(21);

		User user2 = new User();
		user2.setName("sqw");
		user2.setRollNo(200);

		set.add(e);
		set.add(user2);
		set.add(user);

		Collections.sort(set);

		for (User s : set) {
			System.out.println(s.getRollNo());
		}
	}

}
