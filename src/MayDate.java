import java.util.Calendar;

public class MayDate {
    private final Calendar calendar = Calendar.getInstance();
   private final int weekDay = calendar.get(Calendar.DAY_OF_WEEK)-1;
    private final int mont = calendar.get(Calendar.MONTH);
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
            "Січень",
            "Лютий",
            "Березень",
            "Квітень",
            "Травень",
            "Червень",
            "Липень",
            "Серпень",
            "Вересень",
            "Жовтень",
            "Листопад",
            "Грудень",
    };
       private final String strMin = min < 10 ? "0" + min : "" + min ;
        private final String strHour = hour < 10 ? "0" + hour: "" + hour;
        private final String message = "Cьогодні " + wiks[weekDay] + " " + strHour + ":"+strMin + "\nМісяць\t"+ monts[mont];

        public String getMessage(){
            return message;
        }
}
