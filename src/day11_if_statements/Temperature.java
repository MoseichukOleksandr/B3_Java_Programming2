package day11_if_statements;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Please enter the temperature: ");
        int temp = key.nextInt();

        if ( temp>=70 ){
            System.out.println("Its a nice day");
            System.out.println("Its a nice day");
        } else {
            System.out.println("Its to cold ");
            System.out.println("Code more java");
        }
    }
}
