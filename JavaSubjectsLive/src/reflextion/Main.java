package reflextion;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
	
	public void ma(Student s) throws IllegalArgumentException, IllegalAccessException {
		Field field[]=s.getClass().getDeclaredFields();
		for(Field f:field) {
			if(Modifier.isPrivate(f.getModifiers())) {
				f.setAccessible(true);
				f.get(s);
				
			}
		}
	}

}
