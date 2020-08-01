package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

			
	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
		
		Employee obj=new Employee();
		obj.setName("sagar das");
		obj.setRollNo(12);
		obj.setContactInfo("8908273414");
		
		FileOutputStream fileOutputStream=new FileOutputStream("Users/sagardas/Desktop/git");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(obj);
		
		
		FileInputStream fileInputStream=new FileInputStream("Users/sagardas/Desktop/git");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		
	Employee employee=(Employee)	objectInputStream.readObject();
		
	}

}
