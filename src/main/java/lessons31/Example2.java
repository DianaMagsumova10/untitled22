package lessons31;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

//        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
//            System.out.println(availableZoneId);

//        }
        System.out.println(ZonedDateTime.now());
    }
}
