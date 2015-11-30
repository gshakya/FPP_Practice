package lesson3democode;

//Public vs private access.
class MyClass1 {
	private int alpha; // private access
	public int beta; // public access
	int gamma; // default access
	protected int theta;

	/*
	 * Methods to access alpha. It is OK for a member of a class to access a
	 * private member of the same class.
	 */
	private void display() {
		System.out.println("This is the demo for Access Modifiers ");
	}

	void setValue(int a, int b, int c, int d) {
		alpha = a;
		beta = b;
		gamma = c;
		theta = d;
	}

	public void getvalue() {
		display();
		System.out.println("Alpha = " + alpha + "\nBeta = " + beta
				+ "\nGamma = " + gamma + "\nTheta =" + theta);
	}
}

public class AccessModifier {
	public static void main(String args[]) {
		MyClass1 ob = new MyClass1();
		// ob.display(); // Compile time error. display() is a private method
		ob.setValue(5, 10, 12, 15);
		ob.getvalue();
		// Modify the values of Instant Variables.
		// ob.alpha = 10; // A compile time error. alpha is private!
		System.out.println("Modified Value");
		ob.beta = 100;
		ob.gamma = 200;
		ob.theta = 300;
		ob.getvalue();
	}
}
