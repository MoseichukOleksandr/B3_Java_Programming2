package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 angels number: ");
        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();

        double total = angle1+angle2+angle3;

        boolean isTriangle = total == 180;
        boolean isCircle = total == 3600;

        System.out.println("total = " + total);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);

    }
}
