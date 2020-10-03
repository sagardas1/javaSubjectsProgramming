package clonnable;

public class MakingCloneable {
	public static void main(String[] args) throws CloneNotSupportedException {

		
		Student student = new Student("sagar", 1);
		@SuppressWarnings("unused")
		Student s = (Student) student.clone();
	}

}
