package day18_loops;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Give me the word and I will tell you if it is palindrome or not. \nYou word: ");
        String str = key.next();

        String reversed = "";

        // first I need to revers that word.
        // second I need to compare if they are equal
        //          if EQAUL - print it is palindrome
        //          else ----- print it is not palindrome


        // How can I reverse
        // start taking the characters from end
        // and add it into the new container one by one.


//        str.charAt(str.length() -1);
//        reversed += "" +str.charAt(str.length() -1);


        for (int i = str.length() -1; i >= 0 ; i--) { // abcd -- > 3            | 2                      | 1                      | 0                       | -1
            reversed += str.charAt(i);                // reversed = "" + d;     | reversed = "d" + "c";  | reversed = "dc" + "b"; | reversed = "dcb" + "a";
        }

        // reversed = "dcba";

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }

        // How can you write the code above with TERNARY
        System.out.println(   str.equalsIgnoreCase(reversed) ? "PALINDROME" : "NOT PALINDROME"   );

    }

}
