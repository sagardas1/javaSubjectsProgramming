package listImplementation;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		for (Integer i : list) {
			if (i == 8) {
				System.out.println("remove " + i);
				list.remove(7);
				list.add(10);
			}

		}

		for (Integer ii : list) {
			System.out.println(ii);
		}
	}
}
