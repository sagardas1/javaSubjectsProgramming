
public class RunnableUsingLambda {

	public static void main(String[] args) {

		
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("i am in runnable state " + i);
			}
		};

		Thread thread = new Thread(r);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("i am running in main method " + i);
		}
	}
}
