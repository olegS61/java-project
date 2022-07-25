import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Date());
        Calendar calendar = Calendar.getInstance();
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK)-1;
        int mont = calendar.get(Calendar.MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        System.out.println(mont + "  " + hour);
        Box box = new Box();
        box.length = 15;
        box.height = 10.2;
        box.width = 11.3;
        System.out.println(box.getVolume());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime tim = LocalDateTime.now();
        System.out.println(tim.format(formatter));
        System.out.println(false || true && true && false);


        String[] wiks = {
                "Неділя",
                "Понеділок",
                "Вівторок",
                "Середа",
                "Четвер",
                "Пятниця",
                "Субота",
        };
        String strMin = "";
        String strHour = "";
        if (min <10){
            strMin = 0 +""+min;
        }else strMin += min;
        String message = "Cьогодні " + wiks[weekDay] + " " + hour + ":"+strMin;
        System.out.println(message);
    }
}
