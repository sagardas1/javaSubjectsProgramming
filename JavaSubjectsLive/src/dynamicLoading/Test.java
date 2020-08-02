package dynamicLoading;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//two ways to load class dynamically
		
//		Class<Bike> bikeClass=Bike.class;
//		
//		Bike b=bikeClass.newInstance();
//		b.ride();
//		
//		
//		
//		Class a=Bike.class;
//		Bike bike=(Bike) a.newInstance();
//	
//		@SuppressWarnings("unchecked")
//		Class<Bike> class1= (Class<Bike>) Class.forName("dynamicLoading.Bike");
//		Bike b1=(Bike)class1.newInstance();
//		b1.ride();
//		
//		@SuppressWarnings("unchecked")
//		Class<Bike> class2= (Class<Bike>) Class.forName("dynamicLoading.Bike");
//		Bike b2=(Bike)class2.newInstance();
//		b2.ride();
//		
//		
		
		
		List<String> a = new ArrayList<>();
		a.add("Sagar das");
		a.add("sidharth das");

		for (String s : a) {
			a.remove("Sagar das");
		}

		
//		List<String> loans = new ArrayList<>();
//		loans.add("personal loan");
//		loans.add("home loan");
//		loans.add("auto loan");
//		loans.add("credit line loan");
//		loans.add("mortgage loan");
//		loans.add("gold loan");
//
//		
//		for (String loan : loans) {
//				loans.remove(loan);
//			
//		}

	}
	
		
	}

