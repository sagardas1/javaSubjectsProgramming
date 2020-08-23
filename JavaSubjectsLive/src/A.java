import java.util.*;

import SortingHashMAPValues.Student;



public class A {

	public static void main(String[] args) {
	
		String name="1000000001 1000000002 1000000003 1000000004 1000000005";
		
		
        int countFirst=0;
        int countlast=0;
String[] a=name.split(" ");


for(String str:a){
	char c =str.charAt(0);
int i=Integer.valueOf(c+"");
	
	countFirst+=i;
    
    
}
System.out.println(countFirst);
		
	}
	
}
