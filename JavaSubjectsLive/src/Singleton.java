
public class Singleton {

	public static Singleton obj = null;

	private Singleton() {

	}

	public static Singleton getInstaSingleton() {
		if (obj == null) {
			obj = new Singleton();

		}
		return obj;
	}

	public static void main(String[] args) {
		Thread thread=new Thread();
	
		Singleton a = Singleton.getInstaSingleton();
		Singleton b = Singleton.getInstaSingleton();
		System.out.println(a);
		System.out.println(b);
		if (a == b) {
			System.out.println(true);
		}
	}
}
