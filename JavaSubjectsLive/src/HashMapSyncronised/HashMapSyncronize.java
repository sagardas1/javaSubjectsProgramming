package HashMapSyncronised;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSyncronize {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("sagar", 1);
		map.put("sidharth", 2);

		Map<String, Integer> m = Collections.synchronizedMap(map);

		Set<Map.Entry<String, Integer>> e = m.entrySet();
		for (Map.Entry<String, Integer> e1 : e) {
			System.out.println(e1.getKey());

		}
	}

}
