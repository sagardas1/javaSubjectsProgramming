package genericImpli;

import com.google.gson.Gson;

public class MainClass<T, V> {
	public static void main(String[] args) {

		Base<Employee> b1 = new Base<Employee>();
		Employee employee = new Employee();
		employee.setName("Sagar");
		employee.setRollNo(13);
		b1.setT(employee);
		b1.setCount(1);

		Base<Address> b2 = new Base<Address>();
		Address address = new Address();
		address.setCity("banglore");
		address.setCityId(10);
		address.setPincode(123);
		b2.setT(address);
		b2.setCount(1);
		MainClass<Address, Employee> a = new MainClass<Address, Employee>();

		Employee employee2 = new Employee();
		employee2.setName("hhh");
		employee2.setRollNo(11);
		@SuppressWarnings("unused")
		Address address2 = a.m1(employee2);
		
		System.out.println(new Gson().toJson(address2));

		
		Object u=new Object();
		
		if(u.getClass().isInstance(Object.class)) {
			System.out.println("gvdshgfvs");
		}
	}

	// generic methods
	@SuppressWarnings("unchecked")
	public T m1(V v) {
		
		
		if(Employee.class.isInstance(v)) {
			System.out.println("pass");
		}
		Address address = new Address();
address.setCity("sai");
address.setCityId(12);
address.setPincode(123);
		return (T) address;
	}
}
