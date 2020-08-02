package failfastandfailsafe;

import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastandFailSafe {

	public static void main(String[] args) {

		List<String> a = new ArrayList<String>();
		a.add("Sagar das");
		a.add("sidharth das");

		for (String s : a) {
			a.remove("Sagar das");
		}

		for (String s : a) {
			System.out.println(s);
		}

		List<String> loans = new ArrayList<>();
		loans.add("personal loan");
		loans.add("home loan");
		loans.add("auto loan");
		loans.add("credit line loan");
		loans.add("mortgage loan");
		loans.add("gold loan");

		for (String loan : loans) {
			
				loans.remove(loan);
			
		}

//		ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<String,Integer>();
//		
//		map.put("sagar", 1);
//		map.put("sidharth", 2);
//				Set<Map.Entry<String, Integer>> entry=map.entrySet();
//				
//				for(Map.Entry<String, Integer> en:entry) {
//					map.put("ram", 3);
//				}
//				
//				
//				for(Map.Entry<String, Integer> en:entry) {
//					System.out.println(en.getKey());
//				}
//				
	}

}
