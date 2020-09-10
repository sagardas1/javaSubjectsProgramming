package thisandSuper;

public class ThisAndSuper extends Super1 {
	int a;

	int b;

	public ThisAndSuper(int a, int b) {
		super();
		this.a = 20;
		this.b = 20;
	}

	public static void main(String[] args) {
		ThisAndSuper andSuper = new ThisAndSuper(10, 20);
		System.out.println(andSuper.a);
	}
}
