package ExceptionHandling;

public class Test {
	public static void main(String[] args)  {
		try {
		Test test=new Test();
		test.m1();
		test.m2();
		}catch(MyException exe) {System.out.println(exe);}
	}
public void m1() throws MyException{
	int a=3;
if(a>1) {
	throw new MyException(1);}
}
public void m2() {}
}
