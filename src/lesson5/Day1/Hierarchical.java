package lesson5.Day1;
// Demo code for Hierarchical Inheritance
class employee1
{
	 String en;
	 String ssn;
	 int phone;
	 public void getdetails(String n, String s, int p)
	 {
		 en = n;
		 ssn=s;
		 phone = p;
	 }
	 void display()
	 {
		 System.out.println("Name of the Employee = " + en);
		 System.out.println("Social Security Number = " + ssn);
		 System.out.println("Mobile Number = " + phone);
	 }
}
class faculty extends employee1
{
	String sub[] = {"FPP","DBMS","SE"};
	void F_Details()
	{
	System.out.println("My Subjects are :");
	for(String s: sub)
	System.out.print(s + " ");
	System.out.println();	
	}
}
class staff extends employee1
{
	void s_details()
	{
		System.out.println("I am doing Admission Process");
	}
}
public class Hierarchical {
	    public static void main(String[] args) {
		faculty obj = new faculty();
		System.out.println("Faculty Details");
		System.out.println("----------------");
		obj.getdetails("Renuka","123-456",12345);
		obj.display();
		obj.F_Details();
		staff sobj = new staff();
		System.out.println("Staff Details");
		System.out.println("----------------");
		sobj.getdetails("Asha","124-789",456789);
		sobj.display();
		sobj.s_details();
			
	}

}
