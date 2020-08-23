import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ValueComaprator implements Comparator<Map.Entry<Integer, Integer>>{

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		// TODO Auto-generated method stub
		int a=o1.getValue();
		int b=o2.getValue();
		
		if(a>b) return 1;
		else if(a<b) return -1;
		else return 0;
		
	}

	

}
