import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.google.gson.Gson;

public class findSumEven {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4); 
		list.add(5);
		list.add(6);
		
		Integer sum=list.stream().filter(p -> p%2==0)
				.map(q -> q*2)
				.reduce(0, (a, b) -> a + b);
			//	.mapToInt(a ->a+a)
				
				
				
				
		System.out.println(sum);
				
		
	}

}
