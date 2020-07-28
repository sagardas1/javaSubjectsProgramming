package Cutome;


public class AlphaException extends Exception{
	
	String  i;
	 public AlphaException(String  i) {
	      this.i = i;
	   }

	public String getErrormsg() {
		
		return i;
	}

}
