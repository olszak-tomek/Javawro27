package pl.sda.rafal.zientara.programowanie2.lesson4.calendar;


public class CalendarMain {

    public static void main(String[] args) {

MonthCalendar monthCalendar = new MonthCalendar();

monthCalendar.printYearCalendar(2020);


      //  printCurrentMonthCalendar();


    }

//    private static void printCurrentMonthCalendar() {
//
//        LocalDate currentDate = LocalDate.now();
//        LocalDate firstDayOfMonth = currentDate.minusDays(currentDate.getDayOfMonth() - 1);
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd ");
//
//
//        System.out.println(firstDayOfMonth.getMonth() + ", " + firstDayOfMonth.getYear());
//        for (int j = 1; j < firstDayOfMonth.getDayOfWeek().getValue(); j++) {
//            System.out.print("    ");
//        }
//        for (int i = 0; i < currentDate.lengthOfMonth(); i++) {
//            LocalDate date = firstDayOfMonth.plusDays(i);
//
//            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
//                System.out.println("");
//            }
//
//            if (date.getDayOfWeek() != DayOfWeek.FRIDAY) {
//                System.out.print(" " + date.format(format));
//            } else  {
//                System.out.print("P" + date.format(format));
//            }
//
//
//        }
    }
