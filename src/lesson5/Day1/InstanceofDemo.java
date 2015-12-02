package lesson5.Day1;

class Employe {
	double salary;
	private String name = "Unknown";

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
}

class Managr extends Employe {
	public void setSalary(double salary)
	{
		this.salary = salary + (10*salary/100);
	}
}

class PartTimeManager extends Managr {
	double hr_rate;
	int hr;
	public void setSalary(double hr_rate, int hr)
	{
		this.salary = hr_rate *hr;
	}

}

public class InstanceofDemo {
	// Demo code for Instance of operator and Casting of objects(Up/Down
	// casting)
	public static void main(String[] args) {
		Employe emp;
		emp = new Managr(); // Up casting
		emp.setName("Richard");
		
		if (emp instanceof Managr)
		{
			emp.setSalary(5000);
		}
		System.out.println(emp.getName() + " getting  $" + emp.getSalary());
		
		PartTimeManager PT= new PartTimeManager();
		Employe emp1 = null;
		PT = (PartTimeManager) emp1;
		// mgr = emp1; // Compilation error. down casting
		if (emp1 instanceof PartTimeManager) {
			//mgr = (Manager) emp1;
			emp1.setSalary(4000);
			System.out.println("Manager Name : " + emp1.getName());
		} else {
			System.out.println("Employee is not a Manager");
		}
		// Checking instanceof for String class
		String s1 = "Hello";
		String s2 = null;
		if (s1 instanceof String)
			System.out.println("True");
		else
			System.out.println("False");

		if (s2 instanceof java.lang.String)
			System.out.println("True");
		else
			System.out.println("False");
		
		// Checking instanceof for Number class
		
		Object[] stuff = {"Java", 10.11,12,13,16.11,20,"Hi"};
		double sum = 0;
		for(int i=0;i<stuff.length;i++){
		if(stuff[i] instanceof Number) // checking instance
		{
		Number next = (Number)stuff[i]; // Down casting
		sum+=next.doubleValue();
		}
		}
		System.out.println("Sum of Doubles = " + sum);

	}

}
