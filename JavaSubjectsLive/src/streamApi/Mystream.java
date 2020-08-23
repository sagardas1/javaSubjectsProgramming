package streamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mystream {
public static void main(String[] args) {
	Map<EmployeeCase,Integer> map=new HashMap<>();
	
	EmployeeCase case1=new EmployeeCase();
	case1.setName("sagar das");
	case1.setRedge(12);
	
	EmployeeCase case2=new EmployeeCase();
	case2.setName("Sidharth Das");
	case2.setRedge(11);
	
	map.put(case1, 1);
	map.put(case2, 2);
	
	@SuppressWarnings("unused")
	Set<Map.Entry<EmployeeCase, Integer>> entrySet=map.entrySet();
	
	List<EmployeeCase> list=new ArrayList<>();
	
	list.add(case1);
	list.add(case2);
	
	
	//list.stream().filter(()->)
	
	
	
	
}
}
