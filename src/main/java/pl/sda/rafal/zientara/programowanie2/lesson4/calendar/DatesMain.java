package pl.sda.rafal.zientara.programowanie2.lesson4.calendar;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesMain {


    public static void main(String[] args) {


        System.out.println("===============PODSTAWY==============");
        LocalDate localDate = LocalDate.now();//dzien
        LocalDateTime localDateTime = LocalDateTime.now(); // dzien godzina
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("Canada/Atlantic")));

//        //STPAWDZANIE WSZYSTKICH STREF CZASOWYCH
//        Set<String> allZones = ZoneId.getAvailableZoneIds();
//        for (String zone: allZones){
//            System.out.println(zone);
//        }
        System.out.println("===============FORMATTER==============");

        String input = "06-11-2019";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate output = LocalDate.parse(input, dateTimeFormatter);
        System.out.println(output);

        System.out.println(LocalDate.now().format(dateTimeFormatter));
        System.out.println(LocalDate.now().plusDays(1).format(dateTimeFormatter));

        System.out.println("============ poka¿ 5 najbli¿szych pi¹tków =================");


        LocalDate currentDate = LocalDate.now();

        int fridaysCount = 0;
        while (fridaysCount<5){
            DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
            if(dayOfWeek!=DayOfWeek.FRIDAY){
                currentDate = currentDate.plusDays(1);
            }
            else{
                System.out.println(currentDate);
                currentDate.plusWeeks(1);
                fridaysCount++;
            }
        }

        System.out.println("============ KALENDARZ =================");

        LocalDate date = LocalDate.now();

        LocalDate firstDay = date.minusDays(date.getDayOfMonth() -1);
        System.out.println(firstDay);
        LocalDate currDate = firstDay;
        System.out.println(firstDay.getMonth());

        DayOfWeek first = firstDay.getDayOfWeek();
        System.out.println(first.getValue());
        for (int i = 1; i < first.getValue() ; i++) {
            System.out.print("   ");
        }

        while(firstDay.getMonth()==currDate.getMonth()){
            System.out.printf("%2d", currDate.getDayOfMonth());
            System.out.print(" ");
            if(currDate.getDayOfWeek()==DayOfWeek.SUNDAY){
                System.out.println();
            }
            currDate = currDate.plusDays(1);

        }


    }



}
