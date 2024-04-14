package day11_if_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter your hourly rate: ");
        double hourlyRate = key.nextDouble();
        System.out.print("Enter your total hours: ");
        double numOfHours = key.nextDouble();

        double netPay;
//        boolean isOvertime = numOfHours > 40;
        String message = "";

        if (numOfHours > 40){
            netPay = (40 * hourlyRate) + ((numOfHours-40)*(hourlyRate * 1.5));

            message = "You worked " + numOfHours + " hours at rate of " + hourlyRate + ". Since you have overtime, your total pay is $" + netPay;

        } else  {
            netPay = 40 * hourlyRate;
            message = "You worked " + numOfHours + " hours at rate of " + hourlyRate + ". Since you dont have overtime, your total pay is $" + netPay;
        }
        System.out.println(message);

    }
}
