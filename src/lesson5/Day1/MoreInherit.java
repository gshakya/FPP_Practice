package lesson5.Day1;
// Demo code for Multilevel Inheritance
class A 
{  
int x=10;
void area1()
{
	System.out.println("Area of Square : " + (x*x));
}  
}  
  
class B extends A
{  
	int y = 12;
void area2()
{
	System.out.println("Area of Rectangle:" + (x*y));
	
}  
}  
class C extends B
{
	int z=13;
	void area3()
	{
		int res = x * y * z;
		System.out.println("Area of Cube:" + res);
	}  
}
public class MoreInherit 
{
	// Demo code for Multilevel Inheritance
	public static void main(String[] args)
	{
		C obj = new C();
		obj.area1();
		obj.area2();
		obj.area3();
	}

}
