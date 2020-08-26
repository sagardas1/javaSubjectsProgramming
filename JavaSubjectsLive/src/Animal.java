
public class Animal {

	public int a;

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.a = 5;
		Animal animal1 = animal;
		Animal animal3 = new Animal();

		animal3.a = animal1.a;
		animal.a = 10;
		System.out.println(animal.a);
		System.out.println(animal1.a);
		System.out.println(animal3.a);
	}

}
