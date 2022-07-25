import java.util.Calendar;

public class MayDate {
    Calendar calendar = Calendar.getInstance();
    int weekDay = calendar.get(Calendar.DAY_OF_WEEK)-1;
    int mont = calendar.get(Calendar.MONTH);
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    int min = calendar.get(Calendar.MINUTE);
    String[] wiks = {
            "Неділя",
            "Понеділок",
            "Вівторок",
            "Середа",
            "Четвер",
            "Пятниця",
            "Субота",
        };
    String[] monts = {
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
        String strMin = min < 10 ? "0" + min : "" + min ;
        String strHour = hour < 10 ? "0" + hour: "" + hour;
        String message = "Cьогодні " + wiks[weekDay] + " " + strHour + ":"+strMin + "\nМісяць\t"+ monts[mont];

        public String getMessage(){
            return message;
        }
}
