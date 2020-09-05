import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

public class AnargramList {
	
	public static void main(String[] args) {
	
		Set<List<String>> list=new HashSet<>();
		List<String> subList=null;
		
		String arr[]= {"ball","allb","llab","fox","cook","ookc"};
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count=0;
			subList=new ArrayList<String>();
			for(int  j=0;j<arr.length;j++){
				
				
				if(arr[i].length()==arr[j].length()) {
					
					count+=1;
				boolean b=	checkAnargram(arr[i],arr[j]);
				if(b) {
					count+=1;
					
				
					subList.add(arr[j]);
				
					
				}
				}
				if(j==arr.length-1&&count==0){
					subList=new ArrayList<String>();
					subList.add(arr[i]);
					list.add(subList);
					
				}
			}
			
			list.add(subList);
		}
		
		System.out.println(new Gson().toJson(list));
		
	}

	
	static boolean checkAnargram(String s1,String s2){
		
		
	char c1[]=	s1.toCharArray();
	char c2[]=	s2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	if(String.valueOf(c1).equals(String.valueOf(c2))) {
		return true;
	}

		
		return false;
		
	}
}
