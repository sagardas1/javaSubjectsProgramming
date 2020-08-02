package customeAnnotation;

import java.lang.annotation.Annotation;

@interface smartPhone {
	String os() default "ios";

	double version() default 13.1;

}

@smartPhone
public class CustomeAnnotation {
	String brand;
	int size;

	CustomeAnnotation(String brand, int size) {
		this.brand = brand;
		this.size = size;
	}
	
	public static void main(String[] args) {
		CustomeAnnotation customeAnnotation=new CustomeAnnotation("Nokia", 5);
		System.out.println(customeAnnotation.brand);
		
		Class a=customeAnnotation.getClass();
		
		Annotation annotation=a.getAnnotation(smartPhone.class);
		
		smartPhone s=(smartPhone)annotation;
		
		System.out.println(s.os());
		
		
	}

}
