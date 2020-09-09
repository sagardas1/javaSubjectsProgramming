package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;

public class Main {
public static void main(String[] args) {
	EmployeeCase case1=new EmployeeCase("dak",1);
	EmployeeCase case2=new EmployeeCase("Alpha",23);
	EmployeeCase case3=new EmployeeCase("void",4);
	EmployeeCase case5=new EmployeeCase("tronic",55);
	EmployeeCase case4=new EmployeeCase("syan",66);
	EmployeeCase case6=new EmployeeCase("aman",77);
	EmployeeCase case7=new EmployeeCase("piya",88);
	EmployeeCase case8=new EmployeeCase("dak",2);
	
	List<EmployeeCase> list=new ArrayList<EmployeeCase>();
	list.add(case7);
	list.add(case6);
	list.add(case4);
	list.add(case5);
	list.add(case3);
	list.add(case2);
	list.add(case1);
	list.add(case8);
	
	
	
	EmployeeCase list1=	(EmployeeCase) list.stream().filter(p ->(p.getName().equals("dak")))
;
	
	System.out.println(new Gson().toJson(list1));
}
}
