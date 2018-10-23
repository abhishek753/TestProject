package package3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;



public class DateDemo {

	public static void main(String[] args) {
		//Instantiate a Date Object
	Date date=new Date();
	//Display Time and Date using toStrng().
	System.out.println(date.toString());
	
	Date dNow=new Date();
	SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	System.out.println("Current Date: "+ft.format(dNow));
	
	//This method is used for sleep for 3 seconds.
	try { 
        System.out.println(new Date( ) + "\n"); 
        Thread.sleep(5*60*10); 
        System.out.println(new Date( ) + "\n"); 
     } catch (Exception e) {
        System.out.println("Got an exception!"); 
     }
	 GregorianCalendar gcalendar = new GregorianCalendar();
	 int year = 0;
	// Test if the current year is a leap year
    if(gcalendar.isLeapYear(year)) {
       System.out.println("The current year is a leap year");
    }else {
       System.out.println("The current year is not a leap year");
    }
 }
  }
	


