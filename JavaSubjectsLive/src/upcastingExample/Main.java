package upcastingExample;

public class Main {
	
	public static void main(String[] args) {
		A aa =new B();
		aa.m1();
		aa.m2();
		
		A aa1=new B();
		B bb=(B) aa1;
		bb.m1();
		bb.m2();
		bb.m3();
	
	}

}
