package day11_if_statements;

import java.util.Scanner;
/*
     Declare and assign a number (day)
         1 - Monday
         2 - Tuesday
         ..
         6 - Saturday
         7 - Sunday

         Ex: 2
             Tuesday
             // website: ww.google.com
  */
public class DayOfWeek {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number between 1-7: ");
        int weekDay = key.nextInt();

        if (weekDay == 1){
            System.out.println("Monday");
        }  else if (weekDay == 2) {
            System.out.println("Tuesday");
        } else if (weekDay == 3) {
            System.out.println("Wednesday");
        } else if (weekDay == 4) {
            System.out.println("Thursday");
        } else if (weekDay == 5) {
            System.out.println("Friday");
        } else if (weekDay == 6) {
            System.out.println("Saturday");
        } else if (weekDay == 7) {
            System.out.println("Sunday");
        } else{
            System.out.println("There no good days after 7)");
        }



        System.out.println(weekDay);


    }
}
