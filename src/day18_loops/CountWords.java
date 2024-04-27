package day18_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        String str = "aaahiahhihibbbcch";  // hi
        //            0123456789.......
        int count = 0;

        for (int index = 0; index < str.length()-1;  index++){

            if(str.charAt(index) == 'h' && str.charAt(index+1) == 'i') {
                count++;
            }

        }
        // Hi people -- >  1 space is 2 words
        // He nice people -- > 2 space is 3 words and so on
        System.out.println(count);


    }
}
