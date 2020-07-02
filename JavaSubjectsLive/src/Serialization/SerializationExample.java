package Serialization;

public class SerializationExample {

			
	public static void main(String[] args) throws InterruptedException {
		Employee runnable1=new Employee(1);
		Employee runnable2=new Employee(2);
		Employee runnable3=new Employee(0);
		
		Thread t1=new Thread(runnable1,"T1");
		Thread t2=new Thread(runnable2,"T2");
		Thread t3=new Thread(runnable3,"T3");
		
		t1.start();
		t2.start();
		t3.start();	  
		
	}

}
