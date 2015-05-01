
public class MilitaryTime {
  public static void main(String[] args) {
    int Time1 = Integer.parseInt(args[0]);
int Time2 = Integer.parseInt(args[1]);
int hour1 = Time1 / 100; //creates the first hour by creating a rounded decimal
int hour2 = Time2 / 100; //creates the second hour by creating a rounded decimal
int min1 = Time1 - (hour1 * 100); //creates the first minute by taking the time away from the decimal
int min2 = Time2 - (hour2 * 100); //creates the second minute by taking the time away from the decimal
if (Time1 < Time2) { 
 if (min1 < min2) {
   System.out.println("The interval of time is " + (hour2 - hour1) + "hour(s) and " + (min2 - min1) + "minutes"); //returns the time
      } else {
   System.out.println("The interval of time is " + (hour2 - hour1 - 1) + "hour(s) and " + (60 - (min1 - min2)) + "minutes"); //returns the time
 }
} else {
 if (min1 < min2) {
   System.out.println("The interval of time is " + (24 - (hour1 - hour2)) + "hour(s) and " + (min2 - min1) + "minutes"); //returns the time
 } else {
   System.out.println("The interval of time is " + (24 - (hour1 - hour2) - 1) + "hour(s) and " + (60 - (min1 - min2)) + "minutes"); //returns the time
 }
}
  }
}