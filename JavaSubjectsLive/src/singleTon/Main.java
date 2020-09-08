package singleTon;

public class Main {
	public static void main(String[] args) {

		Fiveton a = Fiveton.getInstance();
		Fiveton b = Fiveton.getInstance();
		Fiveton c = Fiveton.getInstance();
		Fiveton d = Fiveton.getInstance();

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
	}

}
