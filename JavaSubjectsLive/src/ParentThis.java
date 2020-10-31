
public class ParentThis {
	int c;
	int d;
	ParentThis(){System.out.println(11);}
	
	ParentThis(int c,int d){
		this();
		this.c=c;
		this.d=d;
		System.out.println(22);
	}
	
	
}
