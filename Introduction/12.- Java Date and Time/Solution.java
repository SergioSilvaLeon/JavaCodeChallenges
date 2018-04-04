import java.util.GregorianCalendar;
import java.util.Calendar;

public class Solution {
    
    public static String getDay(String day, String month, String year) {
    /*
    * Write your code here.
    */
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);

        // m - 1, Since month is 0 index based
        
        Calendar cal = new GregorianCalendar(y, m - 1, d);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // -1 since, its 0 based index
        return DayOfWeek[dayOfWeek - 1];
    }


    public static String[] DayOfWeek = {"SUNDAY","MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
    

