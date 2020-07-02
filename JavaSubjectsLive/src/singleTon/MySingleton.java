package singleTon;

public class MySingleton {
private	static MySingleton mySingleton=null;
	private MySingleton() {
		
	}
	
public static MySingleton getInstance() {
	if(mySingleton==null) {
 mySingleton=new MySingleton();
	}
	 return mySingleton;
}
}
