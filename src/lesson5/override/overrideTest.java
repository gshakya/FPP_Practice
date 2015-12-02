package lesson5.override;

public class overrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch1 = "ABC";
		String ch2 = "BCD";
		
		System.out.println(ch1.hashCode()+" "+ch2.hashCode());
		
		 ch2 = "ABC";
		 System.out.println(ch1.hashCode()+" "+ch2.hashCode());
	}

}
