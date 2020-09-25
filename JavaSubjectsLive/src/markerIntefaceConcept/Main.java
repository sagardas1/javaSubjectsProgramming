package markerIntefaceConcept;

public class Main {
	public static void main(String[] args) {

		Supply supply = new Supply();

		if (supply instanceof MyMarkerInteface) {
			supply.supply();
		} else {
			System.out.println("No Permission");
		}
	}
}
