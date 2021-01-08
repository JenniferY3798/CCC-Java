/*
 * AP CS MOOC
 * Term 2 - Assignment 1: Time
 * A class which represents the time of day in hours and seconds.
 */

public class Time
{
     private int hour;
     private int minute;     
     
     /* Complete required constructors and methods here */
     
     /*
      *Default constructor that sets time to 1200.  
      */ 
     public Time()
     {
         hour = 12;
         minute = 0;
     }
     
     /*
      * If h is between 1 and 23 inclusive, set the hour to h. 
      * Otherwise, set the hour to 0. If m is between 0 and 59 inclusive, 
      * set the minutes to m. Otherwise, set the minutes to 0. 
      */ 
     public Time(int h, int m)
     {
       if(h>= 1&& h<=23){
           hour = h;
       }
       else{hour = 0;
     }
      if(m>= 1&& h<=59){
           minute = m;
       }
       else{minute = 0;
     } 
     }
     
     /* Returns the time as a String of length 4 in the format: 0819. 
      * Notice that if the hour or minute is one digit, it should 
      * print a zero first. For example, 6 should print as 06.
     */
     public String toString()
     {
       /*if(hour<10){
           if(minute<10){
               return hour + "0" + minute + "0";
           }
           else if(minute>=10){
               return hour + "0"+minute;
           }
       }
       else if(hour>=10){
           if(minute<10){
               return hour + minute + "0";
           }
           else if(minute>=10){
               return hour +"" + minute;
           }
       }
       return "";
         */
         String empty = "";
         if(hour>=0&&hour<=9)empty = empty + "0" + hour;
         else empty = empty + hour;
         if(minute>=0&&minute<=9)empty = empty + "0" + minute;
         else empty = empty + minute;
         return empty;
     }
     
     /*
      * Returns the time as a String converted from military time 
      * to standard time. For example, 0545 becomes 5:45 am and 
      * 1306 becomes 1:06 pm.
      */ 
     public String convert(Time t)
     {
         String empty = "";
         if(hour ==0)empty = empty + 12;
         else if(hour>=1&&hour<=12)empty = empty + hour;
         else if(hour>=13&&hour<=23)empty = empty + (hour-12);

         if(minute>=0&&minute<=9)empty = empty + ";0"+minute;
         else empty = empty + ":" + minute;
         
         if(hour>=0&&hour<=11)empty = empty+"am";
         else empty = empty+"pm";
         
     return empty;
     }
    /*
     * Advances the time by one minute. 
     * Remember that 60 minutes = 1 hour. 
     * Therefore, if your time was 0359, and you add one minute, 
     * it becomes 0400. 2359 should increment to 0000.
     */ 
    public void increment()
    {
      minute = minute+1;
      hour = hour +(minute/60);
      
      if(hour==24)hour =0;
      if(minute>=59)minute = minute%60;
    }
      
}