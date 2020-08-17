package reflextion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflextionForMethodMain {
	
	
	public void printMethod(Student stud) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] method=stud.getClass().getDeclaredMethods();
		
	for(Method m:method) {
		if(Modifier.isPrivate(m.getModifiers())) {
			
			m.setAccessible(true);
			Parameter[] i=m.getParameters();
	@SuppressWarnings("unused")
	String s=		i[0].toString();
			Object[] args= i;
			
			Object obj=m.invoke(stud, args);
			System.out.println(	m.getName()+"   "+obj);
			System.out.println("----------------------------------------");
			
		}
	}
	}
	
	
	@SuppressWarnings("null")
	public void readMethod(Student student,String method) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Method method2=null;

		
		
		if(Modifier.isPrivate(method2.getModifiers())) {
			Object[] args= {student.getName(),student.getArea()};
			method2.setAccessible(true);
			Object object=method2.invoke(student, args);
			System.out.println(method2.getName()+" " +object);
		}
		
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		ReflextionForMethodMain forMethodMain=new ReflextionForMethodMain();
		Student student=new Student("sagar",13);
	//	forMethodMain.printMethod(student);
		forMethodMain.readMethod(student,"method1");
	}

}
