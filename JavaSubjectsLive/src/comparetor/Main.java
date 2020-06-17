package comparetor;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
TreeSet<Employee> set=new TreeSet<>(new Employee());
Employee e=new Employee();
e.setName("saga");
e.setRoll(1);
Employee e1=new Employee();
e1.setName("saga");
e1.setRoll(2);
Employee e2=new Employee();
e2.setName("saga");
e2.setRoll(5);
Employee e3=new Employee();
e3.setName("saga");
e3.setRoll(0);
set.add(e);
set.add(e1);
set.add(e2);set.add(e3);

for(Employee em:set) {
	System.out.println(em.getName()+""+em.getRoll());
}


	}

}
