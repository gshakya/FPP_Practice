package lesson5.Day3.Practice;

class Person {
	int age;

	Person(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		// if (getClass() != obj.getClass())
		// return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		return true;
	}

}

class Employee extends Person {
	int id;
	String name;

	public Employee(int age, int id, String name) {
		super(age);
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return (super.toString() + " Id: " + id + " Name: " + name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee e = (Employee) obj;
		if (e.id != this.id)
			return false;
		if (e.name == null)
			return false;
		if (this.name == null)
			return false;
		if (!e.name.equals(this.name))
			return false;
		return true;

	}

}

public class ToStringOverride {
	public static void main(String[] args) {
		Person p1 = new Person(13);
		Person p2 = new Employee(13, 1, "Gunjan");

		System.out.println(p1);
		System.out.println(p2);

		// System.out.println(e1==e2);

		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p1));

	}
}
