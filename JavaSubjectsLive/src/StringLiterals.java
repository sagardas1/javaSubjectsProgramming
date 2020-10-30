
public class StringLiterals {
	public static void main(String[] args) {
		String a="Sagar";
		char[] charArray=a.toCharArray();
		
		for(char i:charArray) {
			System.out.println((char)(i+32));
		}
	}
}
