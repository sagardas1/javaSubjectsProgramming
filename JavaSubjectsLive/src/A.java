import java.util.Arrays;
import java.util.List;

public class A {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		@SuppressWarnings({ "rawtypes", "unused" })
		List list = Arrays.asList(a);

	}
	

	public static void m1(int i) {

		System.out.println(i);

	}
}
