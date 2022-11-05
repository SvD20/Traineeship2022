package by.incubator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDayOfTheWeek = 0 ;
        while (true){
             numberDayOfTheWeek= scanner.nextInt();
            switch (numberDayOfTheWeek){
                case 1:
                    System.out.println(WeekDays.MONDAY + WeekDays.MONDAY.getInfoAboutThisDay());
                    break;
                case 2:
                    System.out.println(WeekDays.TUESDAY + WeekDays.TUESDAY.getInfoAboutThisDay());
                    break;
                case 3:
                    System.out.println(WeekDays.WEDNESDAY + WeekDays.WEDNESDAY.getInfoAboutThisDay());
                    break;
                case 4:
                    System.out.println(WeekDays.THURSDAY + WeekDays.THURSDAY.getInfoAboutThisDay());
                    break;
                case 5:
                    System.out.println(WeekDays.FRIDAY + WeekDays.FRIDAY.getInfoAboutThisDay());
                    break;
                case 6:
                    System.out.println(WeekDays.SATURDAY + WeekDays.SATURDAY.getInfoAboutThisDay());
                    break;
                case 7:
                    System.out.println(WeekDays.SUNDAY + WeekDays.SUNDAY.getInfoAboutThisDay());
                    break;
                default:
                    System.out.println(numberDayOfTheWeek);
            }
            
        }
    }

}
