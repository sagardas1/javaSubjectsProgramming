package Cutome;


public class AlphaException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String  i;
	 public AlphaException(String  i) {
	      this.i = i;
	   }

	public String getErrormsg() {
		
		return i;
	}

}
