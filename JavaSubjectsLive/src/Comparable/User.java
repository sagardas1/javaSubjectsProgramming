package Comparable;

public class User implements Comparable<User>{

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
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
}
