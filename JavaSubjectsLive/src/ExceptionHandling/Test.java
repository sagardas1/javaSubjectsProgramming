package ExceptionHandling;

public class Test {
public static  void div() throws MyException {
	final int a;
	a=10;
	
		int b=0;
		if(b==0) {
			throw  new MyException("");}
		}

public static void main(String[] args) {
try {
		div();
}catch(Exception e) {
	e.printStackTrace();
}
	
}
}

