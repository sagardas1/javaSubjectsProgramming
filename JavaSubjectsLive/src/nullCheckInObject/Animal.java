package nullCheckInObject;

public class Animal {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Animal animal=null;
		if(animal==null) {
			System.out.println("errror");
		}
		if(animal.equals(null)) {
			System.out.println("hsbhsg");
		}
		
	}

}
