class Person {
	private String name;
	private int age;

	public Person() {
		this.name = "Unknown";
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class ICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		Person person2 = new Person("Alice", 25);
		System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
		System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
	}

}
