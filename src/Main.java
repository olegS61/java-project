import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

        MayDate dat = new MayDate();

        System.out.println(dat.getMessage());

    }
}
