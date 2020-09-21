package java8Features;

import java.util.*;
import java.util.stream.Collectors;

import com.google.gson.Gson;

public class MyStream {
	public static void main(String[] args) {

		Student s1 = new Student("guru", 12);
		Student s2 = new Student("ram", 11);
		Student s3 = new Student("shyam", 15);

		Student s4 = new Student("shu", 1);
		Student s5 = new Student("prabhu", 19);
		Student s6 = new Student("tan", 111);

		List<Student> list = new ArrayList<>();
		list.add(s6);
		list.add(s2);
		list.add(s1);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("1", s1);
		map.put("2", s2);
		map.put("3", s3);

		map.put("4", s4);
		map.put("5", s5);
		map.put("6", s6);

		Map<String, Student> m = map.entrySet().stream().filter(p -> p.getValue().getName().equals("shu"))
				.collect(Collectors.toMap(k -> k.getKey(), k -> k.getValue()));

		map.entrySet().stream().filter(p -> p.getValue().getRollNo() > 18).forEach(k -> System.out.println(k.getKey()));

		System.out.println(new Gson().toJson(m));
	}
}
