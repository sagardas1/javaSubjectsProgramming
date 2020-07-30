package dynamicLoading;

public class Test {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//two ways to load class dynamically
		
		Class<Bike> bikeClass=Bike.class;
		
		Bike b=bikeClass.newInstance();
		b.ride();
		
		
	
		@SuppressWarnings("unchecked")
		Class<Bike> class1= (Class<Bike>) Class.forName("dynamicLoading.Bike");
		Bike b1=(Bike)class1.newInstance();
		b1.ride();
	}
	
		
	}

