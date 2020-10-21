package arrayProgram;

import java.util.*;

public class FindMissingRepeating15 {
	public static void main(String[] args) {

		int a[] = { 4, 3, 6, 2, 1, 1 };
		Arrays.sort(a);
		int totalCount = 0;
		for (int i = a[0]; i <= a[a.length - 1]; i++) {
			totalCount += i;
		}

		int key = 0;
		int val = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				key = a[i];
				val = map.get(a[1]);
				map.put(key, val + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		int keyCount = 0;
		for (Map.Entry<Integer, Integer> en : set) {
			keyCount += en.getKey();
			if (en.getValue() > 1) {
				System.out.println("duplicates  = " + en.getKey());
			}
		}

		System.out.println("Missing Number is = " + (totalCount - keyCount));
	}

}
