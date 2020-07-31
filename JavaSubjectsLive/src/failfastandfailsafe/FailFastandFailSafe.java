package failfastandfailsafe;

import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastandFailSafe {
	
	public static void main(String[] args) {
		
		
		List<String> a=new LinkedList<String>();
		a.add("Sagardas");
		a.add("sidharth das");
		
		for(String s:a) {
			a.add("dd");
		}
		
		ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<String,Integer>();
		
		map.put("sagar", 1);
		map.put("sidharth", 2);
				Set<Map.Entry<String, Integer>> entry=map.entrySet();
				
				for(Map.Entry<String, Integer> en:entry) {
					map.put("ram", 3);
				}
				
				
				for(Map.Entry<String, Integer> en:entry) {
					System.out.println(en.getKey());
				}
				
	}
	
	

}
