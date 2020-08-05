package basicsPrograms;

public class StringBuilderCapacity {
	public static void main(String[] args) {
		
		StringBuilder s=new StringBuilder("sagar Das");
		
		s.append('f');
		System.out.println(s);
		System.out.println(s.capacity());
		
		
		StringBuilder s1=new StringBuilder();
		System.out.println(s1.capacity());
	}

}
