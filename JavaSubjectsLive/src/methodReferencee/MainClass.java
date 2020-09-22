package methodReferencee;

public class MainClass {
	
	public static void main(String[] args) {
		MethodReferernce methodReferernce=new MethodReferernce();
	Sayble s=	methodReferernce:: m1;
	System.out.println(s.say(1, 2));
	}

}
