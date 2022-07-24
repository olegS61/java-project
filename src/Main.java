import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Date());
        long date = new Date().getTime();
        long mont = new Date().getMonth();
        System.out.println(date +" "+mont);
//        int mont = date.getMonth();
    }
}
