package HackerRank;

    import java.time.DayOfWeek;
    import java.time.LocalDate;
import java.time.LocalTime;

public class DayTime {
//    public String FindDay(int month,int day, int year){
//        LocalDate date= LocalDate.of(year,month,day);
//
//    }
    public static void main(String[] args) {

        LocalDate date= LocalDate.of(2003,11,23);
        System.out.println(date);
        DayOfWeek day = date.getDayOfWeek();
        System.out.println(day);
    }
}
