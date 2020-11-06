import java.util.ArrayList;
import java.util.LinkedList;

public class MyInterface{
	
	public static void main(String[] args) {
		
	LinkedList<Integer> integers=new LinkedList<>();
	integers.add(10);
	integers.add(20);
	integers.add(30);
	integers.add(40);
	integers.add(40);	integers.add(50);
	
	ArrayList<Integer> arrayList=new ArrayList<>();
	arrayList.add(10);
	arrayList.add(20);
	arrayList.add(30);
	arrayList.add(40);
	arrayList.add(40);	arrayList.add(50);
	
	for(Integer a:integers) {
		System.out.println(a);
	}
	
	for(Integer a:arrayList) {
		System.out.println(a);
	}
	
	}
	

}
