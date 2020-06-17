package Syncronize;

public class Syncronise {
	
	public static void main(String[] args) {
		MyThread myThread1=new MyThread();
	Thread thread=new Thread(myThread1);
	thread.start();
	
	MyThread myThread2=new MyThread();
	Thread thread2=new Thread(myThread1);
	thread2.start();
	}

}
