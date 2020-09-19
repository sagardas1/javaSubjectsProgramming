package multiThreading;

public class Main {
	public static void main(String[] args) {
		MyThreadExample threadExample = new MyThreadExample();
		Thread thread = new Thread(threadExample);
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main method");
		}
	}
}
