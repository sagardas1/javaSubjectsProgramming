package ExceptionHandling;

public class Test {
public static  void div() throws MyException1 {
	@SuppressWarnings("unused")
	final int a;
	a=10;
	
		int b=0;
		if(b==0) {
			throw  new MyException1("exception");}
		}

public static void main(String[] args) {
try {
		div();
}catch(MyException1 e) {
	System.out.println(e.getMessage1());
}
	
}
}

