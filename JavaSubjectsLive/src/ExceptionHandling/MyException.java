package ExceptionHandling;

@SuppressWarnings("serial")
public class MyException extends Exception{
	int id;

	   public MyException(int x) {
	      id = x;
	   }

	   public String toString() {
	      return "CustomException[" + id + "]";
	   }
}
