package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolConcept {

	
	public static void main(String[] args) {
		Service service=new Service();
		Runnable r=() ->{
			service.execute();
		};
		
		ExecutorService executorService =Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++) {
			executorService.execute(r);
		}
		
		
	}
}
