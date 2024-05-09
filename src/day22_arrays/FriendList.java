package day22_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("How many friends do you want to save: ");
        //int friendsCount = key.nextInt();

        String [] friendsList = new String[key.nextInt()]; // 5 --- > [null, null, null, null, null]


        key.nextLine();
        for (int i = 0; i < friendsList.length; i++) {
            System.out.print("Enter your friend's name: ");
            String eachInfo = key.nextLine().toLowerCase();
            friendsList[i] = eachInfo.substring(0,1).toUpperCase() + eachInfo.substring(1);

        }


        System.out.println();
        System.out.println("I have " + friendsList.length + " friends.");
        System.out.println("Their names are: ");
        for ( String each : friendsList) {
            System.out.println("\t"+each);
        }



    }
}
