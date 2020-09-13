package basicsPrograms;

import java.util.*;

public class CountNoOfEachChara {

	public static void main(String[] args) {
		int count = 0;
		String a = "sagar";
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		char[] arr = a.toCharArray();

		for (char i : arr) {
			if (m.containsKey(i)) {
				count = m.get(i);
				m.put(i, count + 1);
				count = 0;
			} else {
				m.put(i, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entry = m.entrySet();

		for (Map.Entry<Character, Integer> en : entry) {
			System.out.println(en.getKey() + " " + en.getValue());
		}
	}

}
