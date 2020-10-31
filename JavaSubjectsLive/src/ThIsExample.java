import thisandSuper.ThisAndSuper;

public class ThIsExample extends ParentThis{
	
	 int a=9;
	int b;
	
	public ThIsExample() {
		
	System.out.println(1);
	}
	ThIsExample(int a,int b){
		
		this();
		this.a=a;
		this.b=b;
		System.out.println(2);
	}

	
	
	public static void main(String[] args) {
		ThIsExample example=new ThIsExample(10,20);
		ThIsExample example2=new ThIsExample();
		System.out.println(example2.a);
		
	}
	

}
