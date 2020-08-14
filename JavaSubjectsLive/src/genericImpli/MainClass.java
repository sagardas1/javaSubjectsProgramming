package genericImpli;

public class MainClass {
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
		
		
	}
}
