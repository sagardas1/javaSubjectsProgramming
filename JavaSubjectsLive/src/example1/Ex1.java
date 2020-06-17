package example1;

import java.util.*;

public class Ex1 {
	

	
public static void main(String[] args) {
		Class1 class1=new Class1();
		class1.setName("Raju");
		class1.setRegNo(12);
		Class1 class2=new Class1();
		class2.setName("raman");
		class2.setRegNo(13);
		Class1 class3=new Class1();
		class3.setName("bis");
		class3.setRegNo(14);
		Class1 class4=new Class1();
		class4.setName("kae");
		class4.setRegNo(15);
		Class1 class5=new Class1();
		class5.setName("abhi");
		class5.setRegNo(16);
		
		
		List<Class1> list=new ArrayList<>();
		list.add(class5);
		list.add(class4);
		list.add(class3);
		list.add(class2);
		list.add(class1);
		
		
		list.forEach(a->{a.setRegNo(1);});
		
		list.forEach(a->System.out.println(a.getName()+" "+a.getRegNo() ));
		
	}
	
}

