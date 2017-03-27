import java.util.*;
public class TheTimeClass {

	public static void main(String[] args) 
{
	Scanner input = new Scanner(System.in); 
	System.out.print("Enter an elapsed time in Milliseconds: "); 
	 	long seconds = input.nextLong(); 
		 	input.close(); 
		 Time new1 = new Time(); 
	System.out.print(new1.gethour() + ":" + new1.getminute() + ":"+ new1.getsecond()+ "\n"); 
		 new1.setTime(seconds); 
	System.out.print(new1.gethour() + ":" + new1.getminute() + ":"+ new1.getsecond()); 
} 
		 
		 
 } 
		 class Time{ 
		 private long hour; 
		 private long minute; 
		 private long second; 
		 	 
	Time(){  
		 second = (System.currentTimeMillis() / 1000) % 60; 
		 minute = ((System.currentTimeMillis() / 1000)/60) % 60; 
		 hour = (((System.currentTimeMillis() / 1000)/60)/60) % 24; 
} 
	Time(long newhour, long newminute, long newsecond){ 
		hour = newhour; 
		minute = newminute; 
	 	second = newsecond; 
} 
		 long gethour(){ 
		 	return hour; 
} 
		 long getminute(){ 
		 	return minute; 
} 
		 long getsecond(){ 
		 	return second; 
 } 
		 void setTime(long elapsedTime){ 
		 	second = (elapsedTime / 1000) % 60; 
		 	minute = ((elapsedTime / 1000)/60) % 60; 
		 	hour = (((elapsedTime / 1000)/60)/60) % 24; 
	} 
} 
