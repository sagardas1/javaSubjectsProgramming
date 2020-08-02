package customeAnnotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Target(ElementType.TYPE)//target (type) means it works on class level
@Retention(RetentionPolicy.RUNTIME)
@interface smartPhone {
	String os() default "ios";

	double version() default 13.1;

}

@smartPhone(os="IOS",version=89)
public class CustomeAnnotation {
	String brand;
	int size;

	CustomeAnnotation(String brand, int size) {
		this.brand = brand;
		this.size = size;
	}
	
	public static void main(String[] args) {
		
		CustomeAnnotation annotation=new CustomeAnnotation("nokia",12);
		
		
		@SuppressWarnings("rawtypes")
		Class s=annotation.getClass();
		
		@SuppressWarnings("unchecked")
		Annotation annotation2=s.getAnnotation(smartPhone.class);
		smartPhone class1=(smartPhone)annotation2;
		System.out.println(class1.os());
		System.out.println(class1.version());
		
	}

}
