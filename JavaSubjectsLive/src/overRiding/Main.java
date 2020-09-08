package overRiding;

public class Main {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("HI");
		new Thread(r).start();

	}

}
