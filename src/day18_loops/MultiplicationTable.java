package day18_loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        System.out.println("giv a number");
        int num = key.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + num * i);

        }

    }
}
