
@SuppressWarnings("serial")
public class MyExceptionProvide extends Exception{
	
	String name;
	MyExceptionProvide(String name){
		this.name=name;
	}
	
	
	public void getMessage1() {
		System.out.println("Exception occure in: "+name);
	}
	

}
