package pl.sda.rafal.zientara.programowanie2.lesson4.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MonthCalendar {





    public MonthCalendar() {

    }



    public void printYearCalendar(int year){

        for (int i = 1; i <= 12; i++) {
            printMonthCalendar(year, i);
            System.out.println("");
            System.out.println("");
        }

        }




    public void printMonthCalendar(int year, int month) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd ");
        LocalDate date = LocalDate.of(year, month, 1);


        System.out.println(date.getMonth() + ", " + date.getYear());
        for (int j = 1; j < date.getDayOfWeek().getValue(); j++) {
            System.out.print("    ");
        }
        for (int i = 0; i < date.lengthOfMonth(); i++) {
            LocalDate dateTemp = date.plusDays(i);

            if (dateTemp.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println("");
            }

            if (dateTemp.getDayOfWeek() != DayOfWeek.FRIDAY) {
                System.out.print(" " + dateTemp.format(format));
            } else {
                System.out.print("P" + dateTemp.format(format));
            }


        }
    }
}
