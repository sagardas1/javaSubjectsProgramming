package reflextion;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflexationMain {
	
	//Access all private fields of the class.
	public void printStudent(Student stud) throws IllegalArgumentException, IllegalAccessException {
		
		Field[] field=stud.getClass().getDeclaredFields();
		
		for(Field f:field) {
			if(Modifier.isPrivate(f.getModifiers())) {
				f.setAccessible(true);
				
				System.out.println(f.getName()+" : "+f.get(stud));
			}
		}
	}
	
public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
	ReflexationMain main=new ReflexationMain();
	Student stud=new Student("sagar", 13);
	main.printStudent(stud);
}
}
