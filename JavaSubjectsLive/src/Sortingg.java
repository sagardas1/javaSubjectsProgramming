
public class Sortingg {

	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		int smallest=0; 
		int biggest=0;
		for(int i=0;i<a.length;i++) {
			if(i==0) {
				smallest=a[i];
				biggest=a[i+1];
				
				
				
			}
			
			if(a[i]<smallest) {
				smallest=a[i];
				
			}
			if(a[i]>biggest) {
			biggest=a[i];
				
			}
		}
		
		System.out.println(smallest);
		System.out.println(biggest);
	}
}
