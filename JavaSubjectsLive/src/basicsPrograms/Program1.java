package basicsPrograms;

public class Program1 {
	public static int i=10;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Program1 program1=new Program1();
		program1.i=i+1;
		
		Program1 program2=new Program1();
		program2.i=i+1;
		
		System.out.println(program1.i);
		System.out.println(program2.i);
	}

}
