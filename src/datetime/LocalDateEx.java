package datetime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateEx {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today is: " + date);
        System.out.println("Yesterday is: " + yesterday);
        System.out.println("Tommorow is: " + tomorrow);

        LocalDate date1 = LocalDate.of(2016, 7, 12);
        if (date1.isLeapYear()) {
            System.out.println(date1.getYear() + " is leap year");
        } else {
            System.out.println(date1.getYear() + " is not leap year");
        }

        LocalDateTime time = date.atTime(LocalTime.now());
        System.out.println("Time is:" + time);

        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time is:" + localTime.getHour() + "h " + localTime.getMinute() + "m " + localTime.getSecond() + "s");

        ZoneId zoneId = ZoneId.of("Asia/Dhaka");
        LocalTime localTime1 = LocalTime.now(zoneId);
        System.out.println("Time of Bangladesh is: " + localTime1);

        ZoneId zoneId2 = ZoneId.of("Asia/Tokyo");
        LocalTime localTime2 = LocalTime.now(zoneId2);
        System.out.println("Time of Japan is: " + localTime2);

        long hour = ChronoUnit.HOURS.between(localTime1, localTime2);
        System.out.println("Hours between two Time Zone: " + hour);
        long minute = ChronoUnit.MINUTES.between(localTime1, localTime2);
        System.out.println("Minutes between two Time Zone: " + minute);

        LocalDateTime dateTime = LocalDateTime.now(zoneId);
        System.out.println("Before format : " + dateTime);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String formatDateTime = dateTime.format(format);
        System.out.println("After format: " + formatDateTime);

        MonthDay md = MonthDay.of(Month.DECEMBER, 31);
        LocalDate date2 = md.atYear(1992);
        boolean b = md.isValidYear(2017);
        System.out.println(date2);
        System.out.println(b);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("Off set Date time: " + offsetDateTime);
        int h = offsetDateTime.get(ChronoField.HOUR_OF_DAY);
        System.out.println("Hour of Day: " + h);
        int m = offsetDateTime.get(ChronoField.MINUTE_OF_DAY);
        System.out.println("Minutes of Day: " + m);

        System.out.println(offsetDateTime.getHour() + " Hour");
        System.out.println(offsetDateTime.getMinute()+ " Minutes");
        
        
        OffsetTime offsetTime = OffsetTime.now();
        System.out.println("Off set Time: "+offsetTime);
        System.out.println(offsetTime.getHour() + " Hour");
        System.out.println(offsetTime.getMinute()+ " Minutes");
        
        Clock clock = Clock.systemDefaultZone();
        String currentZone = clock.getZone().getId();
        System.out.println(currentZone);
        
        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1.instant());
        
        

    }
}
