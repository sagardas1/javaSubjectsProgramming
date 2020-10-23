package clonning;

public class ObjectCreation {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee();
		employee.setContactInfo("8908273414");
		employee.setName("sagar das");
		employee.setRollNo(13);
		
		
		@SuppressWarnings("unused")
		Employee employee2 = (Employee) employee.clone();
	}
}
