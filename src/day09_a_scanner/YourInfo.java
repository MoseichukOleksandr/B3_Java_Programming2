package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter favorite book: ");
        String book = input.nextLine();

        System.out.print("Please enter your age: ");
        byte age = input.nextByte();

        System.out.print("Please enter your favorite number: ");
        Long number = input.nextLong();



        System.out.println("Information");
        System.out.println("age: "+ age);
        System.out.println("number: " + number);
        System.out.println("book: " + book);


    }
}
