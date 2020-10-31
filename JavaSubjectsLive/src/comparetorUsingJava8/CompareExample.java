package comparetorUsingJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.google.gson.Gson;

public class CompareExample {
	
	public static void main(String[] args) {
		HashMap<Integer, Employee> map=new HashMap<Integer, Employee>();
		
		
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee emp1=new Employee("sagar", 1);
		Employee emp2=new Employee("sagar", 5);
		
		Employee emp3=new Employee("sagar", 4);
		Employee emp4=new Employee("sagar", 10);	
		Employee emp5=new Employee("sagar", 19);
		
		map.put(5, emp1);
		map.put(3, emp2);
		map.put(2, emp3);
		
		map.put(1, emp4);
		map.put(4, emp5);
		
List<Map.Entry<Integer, Employee>>		entrySet=new ArrayList<>(map.entrySet());

Comparator<Map.Entry<Integer, Employee>> c1=(o1,o2)->{
	if(o1.getValue().getRollNo()<o2.getValue().getRollNo())
		return -1;
	else if(o1.getValue().getRollNo()>o2.getValue().getRollNo())
		return 1;
	else 
		return 0;
};

Collections.sort(entrySet, c1);

System.out.println(new Gson().toJson(entrySet));
		
//ConcurrentHashMap< Integer,Employee> cmap=new ConcurrentHashMap<Integer, Employee>();
//
//
//for(Map.Entry<Integer, Employee> entry:entrySet) {
//	cmap.put(entry.getKey(), entry.getValue());
//	
//}
//
//
//Set<Map.Entry<Integer,Employee>> sett=new HashSet<Map.Entry<Integer,Employee>>(cmap.entrySet());
//for(Map.Entry<Integer,Employee> en:sett) {
//	System.out.println(new Gson().toJson(en));
//}
//		list.add(emp5);
//		
//		list.add(emp4);
//		
//		list.add(emp3);
//		
//		list.add(emp2);
//		
//		list.add(emp1);
//		
		
		
//	Comparator<Employee> c=(o1,o2) -> {
//		if(o1.getRollNo()>o2.getRollNo())
//			return -1;
//		else if(o1.getRollNo()<o1.getRollNo())
//			return 1;
//		else return 0;
//	};
//	
//	Collections.sort(list, c);
//	System.out.println(list);
//			
//		}
	}
	}


