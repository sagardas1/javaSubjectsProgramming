package threadPool;

public class Service {

	public void execute(int a) {
		for (int i = 0; i < 10; i++) {
			System.out.println("I am executing by new thread");
		}
	}
}
