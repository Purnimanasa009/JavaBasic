/*new Date()	Gets the current date/time
new SimpleDateFormat(...)	Prepares a pattern to format the date
.format(date3)	Converts date to a human-readable string*/
package Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DateDemo2 {
    public static void main(String[]args) throws ParseException {

        String dateStr= "23-June-2016" ;
        SimpleDateFormat sd = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date = sd.parse(dateStr);
        System.out.println("System date: " +date);

        String dateStr1 = "23 | June 16  8:34";
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println("System Date: " +date1);

        String dateStr2 = "2016-06-23 | 8:34:23";
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date date3 = sd2.parse(dateStr2);
        System.out.println("System Date: " +date3);

        String dateStr3 = "Thursday 2016/06/23";
        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/yy");
        Date date4 = sd3.parse(dateStr3);
        System.out.println("System Date: " +date4 );

        String dateStr4 = "23-06-2016 | thu | 8:34";
        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | EE | hh:mm");
        Date date5 = sd4.parse(dateStr4);
        System.out.println("System Date: " +date5);


        String dateStr6= "8:34:22";
        SimpleDateFormat sd6 = new SimpleDateFormat("hh:mm:ss");
        Date date6= sd6.parse(dateStr6);
        System.out.println("System Time: " +date6);


           }
}
