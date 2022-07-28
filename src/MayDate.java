import java.math.BigInteger;
import java.util.Calendar;

public class MayDate {
    private final Calendar calendar = Calendar.getInstance();
   private final int weekDay = calendar.get(Calendar.DAY_OF_WEEK)-1;
    private final int mont = calendar.get(Calendar.MONTH);
    private final int montDay = calendar.get(Calendar.DAY_OF_MONTH);
    private final int hour = calendar.get(Calendar.HOUR_OF_DAY);
    private final int min = calendar.get(Calendar.MINUTE);
    private final String[] wiks = {
            "Неділя",
            "Понеділок",
            "Вівторок",
            "Середа",
            "Четвер",
            "Пятниця",
            "Субота",
        };
    private final String[] monts = {
            "Січня",
            "Лютого",
            "Березня",
            "Квітня",
            "Травня",
            "Червня",
            "Липня",
            "Серпня",
            "Вересня",
            "Жовтня",
            "Листопада",
            "Грудня",
    };
       private final String strMin = min < 10 ? "0" + min : "" + min ;
        private final String strHour = hour < 10 ? "0" + hour: "" + hour;
        private final String strmontDay = montDay < 10 ? "0" + montDay: "" + montDay;
        private final String message = "Cьогодні "+strmontDay + " " + monts[mont] + " "+ wiks[weekDay] + " " + strHour + ":"+strMin ;

        public String getMessage(){
            return message;
        }
        BigInteger k = BigInteger.valueOf(6735673456245623463L);

}
