import java.util.Calendar;
import java.util.Date;

public class IncreaseDate {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,1);
        date = calendar.getTime();
        System.out.println(date);
    }
}
