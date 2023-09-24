package vaibhao;

/* Write a program in Java to demonstrate the use of this keyword. */
public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getInfo() {
		return "Name: " + this.name + ", Age: " + this.age;
	}

	public static void main(String[] args) {
		Person person1 = new Person("Vaibhao", 28);
		System.out.println(person1.getInfo()); // output: Name: Vaibhao, Age: 28

		person1.setName("Akshat");
		person1.setAge(25);
		System.out.println(person1.getInfo()); // output: Name: Akshat, Age: 25
	}
}
