package ExceptionHandling;

@SuppressWarnings("serial")
public class MyException extends Exception{
	String id;

	   public MyException(String x) {
	      id = x;
	   }

	   public String toString() {
	      return "CustomException[" + id + "]";
	   }
}
