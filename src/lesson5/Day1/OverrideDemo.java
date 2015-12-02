package lesson5.Day1;
class A1 {
int i, j;
A1(int a, int b) {
i = a;
j = b;
}
 // display i and j
public void show() {
System.out.println("Super class A1 Show Method");
System.out.println("i and j: " + i + " " + j);
}
}
class B1 extends A1 {
int k;
B1(int a, int b, int c) {
super(a, b);
k = c;
}
// display k – this overrides show() in A
@Override
public void show() {
System.out.println("Sub class B1 Show() Method");
System.out.println("k: " + k);
}

void show(String msg)
{
	System.out.println(msg);
}
}

public class OverrideDemo {
		public static void main(String[] args) {
			A1 supOb = new A1(10,20);
		    B1 subOb = new B1(1, 2, 3);
		   supOb.show(); // this calls show() in A1
			subOb.show(); // this calls show() in B1
		    subOb.show("Have a nice day!"); // this calls show() in B
		}
	}

