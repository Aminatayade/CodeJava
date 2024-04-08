
import java.time.LocalDate;
import java.time.LocalTime;

public class date {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        System.out.println("Jour: " + today.getDayOfMonth() + " Mois: " + today.getMonthValue() +
                " Année: " + today.getYear() + " Heure: " + currentTime.getHour() +
                " Minutes: " + currentTime.getMinute() + " Secondes: " + currentTime.getSecond());
    }
}

