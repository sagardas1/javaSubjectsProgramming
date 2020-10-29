package arrayPrograms;

import java.util.Arrays;

public class DuplicateNum {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 2 };

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1 && a[i] == a[i + 1]) {
				System.out.println(a[i]);
			}

		}
	}
}
