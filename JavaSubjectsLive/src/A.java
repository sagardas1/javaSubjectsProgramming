import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class A {

	static class Helper {
		private int data = 5;

		public void bump(int inc) {
			inc++;
			data = data + inc;
		}
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2 };

		// List<Integer> li = Arrays.stream(a).collect(supplier, accumulator, combiner)

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 56);
		System.out.println(new Gson().toJson(list));
	}

}
