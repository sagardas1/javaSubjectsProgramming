package callablePackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableClass {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> c = () -> {
			return "sagar das";
		};

		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		Future<String> futureObject = executorService.submit(c);
		if (futureObject.isDone()) {
			System.out.println(futureObject.get());
		}
	}

}
