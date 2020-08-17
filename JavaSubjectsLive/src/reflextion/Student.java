package reflextion;

public class Student {
	
	private String name;
	private int area;
	
	Student(String name,int area){this.name=name;this.area=area;}

	public String getName() {
		return name;
	}

	public int getArea() {
		return area;
	}
	
	
	@SuppressWarnings("unused")
	private String method1(String name,int area) {
		String a="";
		
		System.out.println("in this private method. Name is "+name+ " and "+area);
		return a="in this private method. Name is "+name+ " and "+area;
		
	}

	@SuppressWarnings("unused")
	private int method2(int area) {
		return area;
	}
}
