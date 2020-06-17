package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee employee=new Employee();
		employee.setAge(10);
		employee.setName("sagar");
		Employee employee1=new Employee();
		employee1.setAge(10);
		employee1.setName("bhas");
		List<Employee> list=new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		
		//serialization
		FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\HS_Dev\\Desktop\\file\\abc.pdf");
		ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream) ;
		outputStream.writeObject(employee1);
		
	//	Deserialization
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\HS_Dev\\Desktop\\file\\abc.pdf");
		ObjectInputStream InputStream=new ObjectInputStream(fileInputStream) ;
	Employee employee2=(Employee)	InputStream.readObject();
			
	}

}
