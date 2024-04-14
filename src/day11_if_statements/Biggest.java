package day11_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        System.out.print("\t num1 ");
        int num1 = input.nextInt();

        System.out.print("\t num2 ");
        int num2 = input.nextInt();

        System.out.print("\t num3 ");
        int num3 = input.nextInt();


        System.out.println("Numbers you enter "+num1+ ", "+ num2+", "+ num3);


        System.out.println("__________________________");

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the biggest!");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the biggest!");
        } else if (num3 > num2 && num3 > num1) {
            System.out.println(num3 + " is the biggest!");
        } else {
            System.out.println("Number are equal");
        }

    }
}
