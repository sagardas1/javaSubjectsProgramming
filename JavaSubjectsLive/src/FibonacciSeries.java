
public class FibonacciSeries {
	static int count=0;
static	int a;
static	int b;
	public static void main(String[] args) {
		
		int numbers=7;
		
		fibona(numbers-2);
		
	}

	private static void fibona(int i) {
		
		if(count==0) {
			System.out.println(0);
			
			count=1;
			a=0;b=1;
		}else {
			int temp=a;
			a=b;
			b=temp+a;
			i=i-1;
			
		}
	
		System.out.println(b);
		if(i!=0) {
			fibona(i);
		}
		
	}

}
