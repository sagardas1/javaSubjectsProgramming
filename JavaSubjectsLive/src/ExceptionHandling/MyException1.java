package ExceptionHandling;

@SuppressWarnings("serial")
public class MyException1 extends Exception{
	String id;

	   public MyException1(String x) {
	      id = x;
	   }

	   public String getMessage1() {
	      return "CustomException[" + id + "]";
	   }
}
