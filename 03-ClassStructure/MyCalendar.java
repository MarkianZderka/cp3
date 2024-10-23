public class MyCalendar {
private static int year;
private static int month;
private static int day;
 public static void setDate(int y, int m, int d){
    year = y;
    month = m;
    day = d;
 }
 public static String myDate(){
    return String.format("%04d-%02d-%02d", year, month, day);
 }
public static int days(){
    int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31};
    int totalDays = 0;
    for (int i = 1; i < month; i++) {
        totalDays += daysInMonth[i];
    }
    totalDays += day;
    return totalDays;
}
public static String monthName(){
    String[] namesOfMonths = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    return namesOfMonths[month];
}
public static void main(String[] args) {
    setDate(2024, 1, 23);
    System.out.println("Formatted Date: " + myDate()); 
    System.out.println("Days passed in year: " + days()); 
    System.out.println("Month Name: " + monthName()); 
}
}