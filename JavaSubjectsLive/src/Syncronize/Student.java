package Syncronize;

public class Student {
	
	public synchronized void method1() throws InterruptedException {
		wait();
		System.out.println("sagar das");
	}

}
