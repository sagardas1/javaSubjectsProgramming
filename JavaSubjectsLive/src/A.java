public class A {

static class Helper{
	private int data =5;
	public void bump(int inc) 
	{inc++;
	data=data+inc;}
}
	
	public static void main(String[] args) {

		Helper helper=new Helper();
		int data=2;
		helper.bump(data);
		System.out.println(helper.data);
		
		
	}

}
