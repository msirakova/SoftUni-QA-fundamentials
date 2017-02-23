import java.util.Calendar;
import java.util.Date;

public class Dte {
 public static void main(String args[]) {
  Calendar cal = Calendar.getInstance(); // creates calendar
  cal.setTime(new Date()); // sets calendar time/date
  cal.add(Calendar.HOUR_OF_DAY, 20); // adds one hour
  Date date = cal.getTime(); // returns new date object, one hour in the
         // future
  System.out.println(date.toString());
 }
}

//* import java.util.Date;

//public class Dte {
	// public static void main (String args[]) {
// Date date = new Date();
// System.out.println(date.toString());
 
