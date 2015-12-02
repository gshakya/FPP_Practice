package lesson5.Day1;

//Parent Class
class square {
 
 int length, breadth;
 void get(int x, int y)
 {
     length=x;
     breadth=y;
 }
 int area()
 {
     return(length*breadth);
 }
}

//Child class
class cube extends square
{
  int height;
  public void getdata(int x,int y,int z)
  {
        get(x,y);
	    height=z;
   }
   int volume()
  {  
	    return(length*breadth*height);
  }
}
//Main Class
public class SimpleInheritance {
	public static void main(String[] args) {
		square s = new square();
		cube C=new cube();
		/*if (s instanceof cube)
			System.out.println("true");
		else 
			System.out.println("false");*/
		C.getdata(10,20,10);
               
        int b1=C.area();
        System.out.println("Area of Square: "+b1);
         
        int b2=C.volume();
        System.out.println("Volume of Cube: "+b2);

	}
}
