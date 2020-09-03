package dynamicLoading;

public class Test2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		// dynamically load class.

		ClassLoader classLoader = Bike.class.getClassLoader();
		try {
			@SuppressWarnings("rawtypes")
			Class aClass = classLoader.loadClass("dynamicLoading.Bike");
			System.out.println("aClass.getName() = " + aClass.getName());

			Bike bike = (Bike) aClass.newInstance();
			bike.ride();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
