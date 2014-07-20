// Fig. 8.7: Date.java 
// Date class declaration.
package Date;
public class Date 
{
   private int month; // 1-12
   private int day;   // 1-31 based on month
   private int year;  // any year

   // constructor: call checkMonth to confirm proper value for month; 
   // call checkDay to confirm proper value for day
   public Date( int Month, int Day, int Year )
   {
      this.month = Month; // validate month
      this.year = Year; // could validate year
      this.day = Day; // validate day

      System.out.printf("Date object constructor for date %s\n" + this );
   } // end Date constructor

   // utility method to confirm proper month value
   int checkMonth( int testMonth )
   {
      if ( testMonth > 0 && testMonth <= 12 ) // validate month
         return testMonth;
      else // month is invalid 
      { 
         System.out.printf(  "Invalid month (%d) set to 1.", testMonth );
         return 1; // maintain object in consistent state
      } // end else
   } // end method checkMonth

   // utility method to confirm proper day value based on month and year
    int checkDay( int testDay )
   {
      int daysPerMonth[] = 
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   
      // check if day in range for month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;
   
      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 || 
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;
   
      System.out.printf( "Invalid day (%d) set to 1.", testDay );
      return 1;  // maintain object in consistent state
   } // end method checkDay
   
   // retur intn a String of the form month/day/year
   int nextday( ){
      checkDay(day);
     int tday=day+1;
      return tday;
      
       
   }
   public String toString()
   { 
      return String.format( "%d/%d/%d", month, day, year ); 
   } 

public static void main(String[]args){
   
    Date a=new Date (3,1,1994);
    a.checkMonth(a.month);
    a.checkDay(a.day);
    a.toString();
    a.nextday();        




}
}
