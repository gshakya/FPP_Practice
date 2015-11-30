package lesson3democode;
 class ErrorMsg {
	// Error codes.
	final int OUTERR = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;
	final int x;
	String msgs[] = {
	"Output Error",
	"Input Error",
	"Disk Full",
	"Index Out-Of-Bounds"
	};
	// Return the error message.
	ErrorMsg()
	{
		x=10;
	}
	ErrorMsg(int z)
	{
		x=z;
	}
	public void display()
	{
		System.out.println("x = " + x);
	}
	String getErrorMsg(int i) {
	if(i >=0 & i < msgs.length)
	return msgs[i];
	else
	return "Invalid Error Code";
	}
	}
public class FinalExample {
	public static void main(String args[]) {
		ErrorMsg err = new ErrorMsg();
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.DISKERR));
		System.out.println(err.getErrorMsg(5));
	//	ErrorMsg.OUTERR=4;
		ErrorMsg t = new ErrorMsg();
		ErrorMsg t1 = new ErrorMsg(56);
		t.display();
		t1.display();
		}
}
