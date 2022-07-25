import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Date());
       //---------------------------------------------
        Box box = new Box();
        box.length = 15;
        box.height = 10.2;
        box.width = 11.3;
        System.out.println(box.getVolume());
        //-----------------------------------------------
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
//        LocalDateTime tim = LocalDateTime.now();
       // System.out.println(tim.format(formatter));
//        System.out.println(false || true && true && false);

        MayDate dat = new MayDate();
        System.out.println(dat.getMessage());

    }
}
