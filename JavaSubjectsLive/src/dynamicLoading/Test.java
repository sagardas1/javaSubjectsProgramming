package dynamicLoading;

public class Test {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//two ways to load class dynamically
		
		Class<Bike> bikeClass=Bike.class;
		
		Bike b=bikeClass.newInstance();
		b.ride();
		
		
		
		@SuppressWarnings("rawtypes")
		Class a=Bike.class;
		Bike bike=(Bike) a.newInstance();
	
		@SuppressWarnings("unchecked")
		Class<Bike> class1= (Class<Bike>) Class.forName("dynamicLoading.Bike");
		Bike b1=(Bike)class1.newInstance();
		b1.ride();
		
		@SuppressWarnings("unchecked")
		Class<Bike> class2= (Class<Bike>) Class.forName("dynamicLoading.Bike");
		Bike b2=(Bike)class2.newInstance();
		b2.ride();
		
		
		
		


	}
	
		
	}

