
public class SmallestDistance {
public static void main(String[] args) {
	
	String s="i  dog am a dog . i use dog .";
	
String arr[]=s.split(" ");
int finalLength=0;
int count=0;
for(int i=0;i<arr.length;i++) {
	
	if(arr[i].equals("i")) {
		
		for(int j=i+1;j<arr.length;j++) {
			if(!arr[j].equals("dog")) {
				count+=1;
				
			}else {
				break;
			}
		}
		if(count<finalLength) {
		finalLength=count;
		count=0;
		}else 
		{count=0;}
		
	}
}
System.out.println(finalLength);
}
}
