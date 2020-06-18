package InterfaceConcept;

public class ImplemetationClass {
	
	public void method1() { 
		System.out.println("sagar "+ MyInterface.a);
	}
public static void main(String[] args) {
	ImplemetationClass class1=new ImplemetationClass();
	class1.method1();
}
}
