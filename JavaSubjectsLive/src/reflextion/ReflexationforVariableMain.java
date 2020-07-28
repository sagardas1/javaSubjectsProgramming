package reflextion;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflexationforVariableMain {
	
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
	//Access all private fields by using field names.
	public void printStudentName(Student stud,String name) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field=stud.getClass().getDeclaredField(name);
		if(Modifier.isPrivate(field. getModifiers())) {
			field.setAccessible(true);
			System.out.println(field.get(stud));
		}
		
	}
	
public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
	ReflexationforVariableMain main=new ReflexationforVariableMain();
	Student stud=new Student("sagar", 13);
	main.printStudent(stud);
	main.printStudentName(stud, "name");
	
	
}
}
