package lambdaExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.google.gson.Gson;

import sortingAlgo.Employee;

public class MainMethod {
	public static void main(String[] args) {
		
		MyLambda l=(a,b) ->  a*b;
		l.mul(1, 2);
		
		
		
		Employee employee=new Employee();
		employee.setName("sahaer");
		employee.setRedge(6);
		Employee employee2=new Employee();
		employee2.setName("yada");
		employee2.setRedge(2);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(employee);
		list.add(employee2);
		
		
		
		Comparator<Employee> c=(emp,emp1) -> 0;
		Collections.sort(list, c);
		
		System.out.println(new Gson().toJson(list));
	}

}
