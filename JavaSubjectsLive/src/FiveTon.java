
public class FiveTon {
	
public static FiveTon obj=null;

public FiveTon getInstance() {
	if(obj==null) {
		obj=new FiveTon();
		
	}
	return obj;
}

}
