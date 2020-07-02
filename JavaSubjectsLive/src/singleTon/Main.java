package singleTon;

public class Main {
	public static void main(String[] args) {
		
	
	MySingleton a =MySingleton.getInstance();
	MySingleton b=MySingleton.getInstance();
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	System.out.println(a.equals(b));
	}
	
}
