package Syncronize;

public class MyThread implements Runnable{

	@Override
public	synchronized void run() {
		for(int i=0;i<10;i++) {System.out.print(i+"  ");}
		
	}

}
