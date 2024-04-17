package day12_switch_statements;

import java.util.Scanner;

public class MyExp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("*** WELCOME to ATM ***\n\nPlease, insert your card.\nThen type your pincode: ");
        int userInputPin = input.nextInt();


        int one = input.nextInt();
        int two = input.nextInt();


        String printGo = (one > two) ? "Odesa" : "New-York";
        System.out.println(printGo);
    }


}
