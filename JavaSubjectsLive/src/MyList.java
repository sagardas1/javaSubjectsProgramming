import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyList {
public static void main(String[] args) {
	List<Integer> a=new ArrayList<Integer>();
	
	a.add(1);
	a.add(2);
	a.add(3);
	ListIterator<Integer> itr=a.listIterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
		itr.set(0);
		
	}
	
}
}
