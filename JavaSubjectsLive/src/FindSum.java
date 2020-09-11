import java.util.*;

import com.google.gson.Gson;

public class FindSum {
public static void main(String[] args) {
	int a[]= {1,5,4,3,4,2,5,6};
	int sum=0;
	int b=10;
	Set<List<Integer>> set=new HashSet<>();
	
	List<Integer> list=new ArrayList<Integer>();
	
	
	for(int i=0;i<a.length;i++) {
		list=new ArrayList<Integer>();
		for(int j=0;j<a.length;j++) {
			
			
			if(i!=j) {
				
				sum=a[i]+a[j];
				if(sum==b) {
					list.add(a[i]);
					list.add(a[j]);
					set.add(list);
					list=new ArrayList<Integer>();
				}
				
			}
		}
	}
	System.out.println(new Gson().toJson(set));
}
}
