package day15_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("please enter first name: ");
        String firstName = key.next().toUpperCase().trim();
        System.out.println("please enter Last name: ");
        String lastName = key.next().toUpperCase().trim();

        char firstCharName = firstName.charAt(0);
//        String firstCharName = ""+ firstName.charAt(0);
        char firstCharLast = lastName.charAt(0);

        System.out.println("" + firstCharName + firstCharLast);

    }
}
