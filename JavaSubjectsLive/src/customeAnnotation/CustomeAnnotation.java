package customeAnnotation;




@interface smartPhone
{
	String os() default "ios";
	double version() default 13.1;
	
	}


@smartPhone
public class CustomeAnnotation {

}
