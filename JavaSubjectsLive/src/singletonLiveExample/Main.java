package singletonLiveExample;

import com.google.gson.Gson;

public class Main {
	public static void main(String[] args) {
		
	
	Employee employee=new Employee();
	ContactInfo contactInfo=ContactInfo.getInstance();
	
	employee.seteName("Sagar");
	employee.setRedgNo("12");
	employee.setContactInfo(contactInfo);

	
	
	ContactInfo contactInfo1=ContactInfo.getInstance();
	
	Employee employee1=new Employee();
	
	employee1.seteName("sidharth");
	employee1.setRedgNo("13");
	employee1.setContactInfo(contactInfo1);
	System.out.println(new Gson().toJson(employee1));
	}

}
