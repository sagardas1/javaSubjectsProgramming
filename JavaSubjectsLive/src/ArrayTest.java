
public class ArrayTest {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,4,3,5,4,5,6,7,9,8};
		int b=7;
		int size=a.length-1;
		
		for(int i=0;i<a.length;i++) {
			
			if(i!=size&&a[i]+a[i+1]==b) {
				System.out.println(a[i]+" "+a[i+1]);
			
			}
		}
	}

}
