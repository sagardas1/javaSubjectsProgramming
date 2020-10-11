
public class FiveTon {

	public static FiveTon obj = null;

	private FiveTon() {
	}

	public FiveTon getInstance() {
		if (obj == null) {
			obj = new FiveTon();

		}
		
		return obj;
	}

}
