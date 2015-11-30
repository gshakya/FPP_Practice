package lesson3democode;
import java.util.*;              // for GregorianCalendar
import java.text.*;              // for DateFormat Class


public class CalenderExample {
	public static void main(String[] args)
	{
		   // Creates a GregorianCalendar object for the quizDay, outputs
		   // information about the day, and modifies the day using class
		   // methods
		      // Creates the quizday object to store the day of the quiz
		      
		GregorianCalendar quizDay = new GregorianCalendar(2014,
		        Calendar.OCTOBER, 10); 
    
		      int month, day;             // store date attributes
		   // Get integer value for the characteristics
		      day =quizDay.get(Calendar.DAY_OF_MONTH);
		      System.out.println("Day: " + day);
		      month = quizDay.get(Calendar.MONTH);
		      System.out.println("Month: " + month);

		      // Make the quiz 4 days earlier
		      // Get the new date
		      quizDay.add(Calendar.DAY_OF_MONTH, -4);
		      day =  quizDay.get(Calendar.DAY_OF_MONTH);
		      System.out.println("Day of the quiz: " + day);
		      month =  quizDay.get(Calendar.MONTH);
		      System.out.println("Month of the quiz: " + month );
		 
		      // Format the output of the date using DateFormat
		      DateFormat fmt = DateFormat.getInstance();
		      System.out.println("Formatted Date: " + 
		                         fmt.format(quizDay.getTime()));

	}

}
