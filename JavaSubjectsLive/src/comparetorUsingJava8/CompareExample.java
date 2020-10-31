package comparetorUsingJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareExample {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee emp1=new Employee("sagar", 1);
		Employee emp2=new Employee("sagar", 5);
		
		Employee emp3=new Employee("sagar", 4);
		Employee emp4=new Employee("sagar", 10);	
		Employee emp5=new Employee("sagar", 19);
		
		
		list.add(emp5);
		
		list.add(emp4);
		
		list.add(emp3);
		
		list.add(emp2);
		
		list.add(emp1);
		
		
		
	Comparator<Employee> c=(o1,o2) -> {
		if(o1.getRollNo()>o2.getRollNo())
			return -1;
		else if(o1.getRollNo()<o1.getRollNo())
			return 1;
		else return 0;
	};
	
	Collections.sort(list, c);
	System.out.println(list);
			
		}
		
	}


