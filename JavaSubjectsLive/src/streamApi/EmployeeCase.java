package streamApi;

public class EmployeeCase {

	public EmployeeCase(String name, int redge) {
		super();
		this.name = name;
		this.redge = redge;
	}
	String name;
	int redge;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRedge() {
		return redge;
	}

	public void setRedge(int redge) {
		this.redge = redge;
	}

}
