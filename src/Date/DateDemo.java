/*new Date()	Gets the current date/time
new SimpleDateFormat(...)	Prepares a pattern to format the date
.format(date3)	Converts date to a human-readable string*/
package Date;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo {
    public static void main(String[]args) {
        Date date = new Date(); //This creates a new Date object that contains the current date and time.
        System.out.println(date);
        SimpleDateFormat sd = new SimpleDateFormat("dd-MMMM-yyyy"); //This creates a SimpleDateFormat object named sd with the format pattern:
        String dateStr = sd.format(date);//This takes the Date object (date) and formats it using the SimpleDateFormat object (sd), converting it into a readable string. and save in dateStr variable
        System.out.println(dateStr);

        Date date1 = new Date();
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        String dateStr1 = sd1.format(date1);
        System.out.println(dateStr1);

        Date date2 = new Date();
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        String dateStr2 = sd2.format(date2);
        System.out.println(dateStr2);

        Date date3 = new Date();
        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        String dateStr3 = sd3.format(date3);
        System.out.println(dateStr3);

        Date date4 = new Date();
        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        String dateStr4 = sd4.format(date4);
        System.out.println(dateStr4);
    }
}
