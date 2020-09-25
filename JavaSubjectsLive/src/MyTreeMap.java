import java.util.*;

public class MyTreeMap {
	
	
	public static void main(String[] args) {
		TreeMap< Integer, String> map=new TreeMap<Integer, String>();
		map.put(10, "ten");
		map.put(4, "ten");
		map.put(5, "ten");
		map.put(6, "ten");
		map.put(2, "ten");
		map.put(0, "ten");
		map.put(7, "ten");
		
		Set<Map.Entry<Integer,String>> set=new HashSet<Map.Entry<Integer,String>>(map.entrySet());
		
		for(Map.Entry<Integer,String> en:set) {
			System.out.println(en.getKey());
		}
		
	}

}
