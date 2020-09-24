import java.util.HashSet;
import java.util.Set;

public class A {


	public static void main(String[] args) {
		
	
		int a[]= {1,2,3,1,2,4};
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i:a) {
			boolean cond=set.add(i);
			if(!cond) {
				System.out.println(i);
			}
		}
		
		
	
		
		
		
 	}

}
