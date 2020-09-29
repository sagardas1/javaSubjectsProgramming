package Comparable;

public class User implements Comparable<User> {

	private String name;
	
	private int rollNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public int compareTo(User o2) {
		if (rollNo > o2.getRollNo()) {
			return -1;
		} else if (rollNo < o2.getRollNo()) {
			return 1;
		} else {
			return 0;
		}

	}

}
