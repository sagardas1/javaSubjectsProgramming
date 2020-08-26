package basicsPrograms;

import java.util.ArrayList;

public class OddEvrnSegregate {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		int k = 0;
		int j = list.size() - 1;
		ArrayList<Integer> sortedList = new ArrayList<>(list.size());
		int a[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			sortedList.add(0);
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				a[k] = list.get(i);

				k += 1;
			} else {

				a[j] = list.get(i);
				j -= 1;
			}
		}

		for (int g : a) {
			System.out.print(g + "   ");
		}

	}

}
