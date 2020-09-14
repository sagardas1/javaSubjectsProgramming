package methodReferance;

interface A{
 void say();
 
}
public class MethodReferenceWithConstructor {

	MethodReferenceWithConstructor(){
		System.out.println("i am in con");
	}
	
	
	public static void main(String[] args) {
		A s=MethodReferenceWithConstructor::new;
		s.say();
	}
}
