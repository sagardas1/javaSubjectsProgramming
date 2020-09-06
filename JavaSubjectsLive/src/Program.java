import java.util.HashMap;
import java.util.*;

import com.google.gson.Gson;

public class Program {

	
	public static void main(String[] args) {
		String s1[]= {"to","toes","dog","dogs","book","banana"};
		String name;
		int maxLength=0;
		
		String input="osetdg";
		int count=0;
		ArrayList<String> max=new ArrayList<String>();
		
		for(String a:s1) {
			
			
			char c[]=a.toCharArray();
			for(int i=0;i<c.length;i++) {
				
				if(!input.contains(c[i]+"")) {
					break;
				}
				else {
					count+=1;
				}
				
			}
			
			if(a.length()==count) {
				max.add(a);
				
			}
			count=0;
			
		}
		
		
		for(String k:max) {
			if(maxLength==0) {
				maxLength=k.length();
				
			}else if(k.length()>maxLength) {
				maxLength=k.length();
			}
			
		}
		
		
		for(String w:max) {
			if(w.length()==maxLength) {
				System.out.println(w);
			}
		}
	
	}
}
