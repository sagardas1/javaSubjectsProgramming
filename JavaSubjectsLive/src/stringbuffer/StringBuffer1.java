package stringbuffer;

public class StringBuffer1 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Sagar");
	sb.append("Sagar");
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	//sb="sagar";
	
	
	
	StringBuilder builder=new StringBuilder();
	builder.append("sagar");
	
	System.out.println(builder.capacity());
	System.out.println(builder.length());
	
}
}
