import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Date());
        Calendar calendar = Calendar.getInstance();
        int mont = calendar.get(Calendar.MONTH);
        int hour = calendar.get(Calendar.HOUR);
        System.out.println(mont + "  " +hour);
//        int mont = date.getMonth();
        Box box = new Box();
        box.length = 15;
        box.height = 10.2;
        box.width = 11.3;
        System.out.println(box.getVolume());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime tim = LocalDateTime.now();
        System.out.println(tim.format(formatter));
    }
}
