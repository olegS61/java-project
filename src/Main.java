import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
       // System.out.println(new Date());
        Calendar calendar = Calendar.getInstance();
        int mont = calendar.get(Calendar.MONTH);
        int hour = calendar.get(Calendar.HOUR);
        System.out.println(mont + "  " +hour);
//        int mont = date.getMonth();
    }
}
