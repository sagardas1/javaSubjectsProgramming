package basicsPrograms;

import java.util.HashMap;
import java.util.*;

public class CountNoOfWords {
	public static void main(String[] args) {
		int count = 0;
		String s = "i am a boy i am a don";

		String[] arr = s.split(" ");

		Map<String, Integer> m = new HashMap<>();

		for (String i : arr) {
			if (m.containsKey(i)) {
				count = m.get(i);
				m.put(i, count + 1);
				count = 0;
			} else {
				m.put(i, 1);
			}
		}
		Set<Map.Entry<String, Integer>> entrys = m.entrySet();
		for (Map.Entry<String, Integer> en : entrys) {
			System.out.println(en.getKey() + "  " + en.getValue());
		}

	}

}
