package methodReferencee;

import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
		MethodReferernce methodReferernce=new MethodReferernce();
	Sayble s=	methodReferernce:: m1;
	System.out.println(s.say(1, 2));
	
	
	
	Map<String,Integer> a=new HashMap<>();
	
	
	List<Map.Entry<String, Integer>> list=new ArrayList<>(a.entrySet());

	
	Comparator<Map.Entry<String, Integer>> comp=(o1,o2)->{
		if(o1.getValue()>o2.getValue() ) return 1;
		else if(o1.getValue()<o2.getValue() ) return -1;
		else return 0;
		
	};
	
	Collections.sort(list,comp);
	}

}
