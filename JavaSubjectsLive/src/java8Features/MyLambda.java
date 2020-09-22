package java8Features;

public class MyLambda {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		MyInterface c = () -> a + b;

		System.out.println(c.m1());
		c.m1();
	}
}

class m1 {

}