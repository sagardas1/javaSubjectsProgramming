package singleTon;

public class Fiveton {
	public  static Fiveton fiveton=null;
	private Fiveton() {
		
	}
	
public static Fiveton getInstance() {
	if(fiveton==null) {
		fiveton=new Fiveton();
	}
	 return fiveton;
}
}
