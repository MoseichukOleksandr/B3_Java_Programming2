package day16_loos;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = key.nextLine().trim();
//        String firstWord = sentence.substring(0 , sentence.indexOf(" "));
//        String lastSentense = sentence.substring(sentence.indexOf(" "), sentence.indexOf(sentence.length()-1));

        // Take the part from sentence  - > .substring(0, indexOfFirstSpace)
        //                      How do I get indexOfFirstSpace - > .indexOf(" ");


        //int indexOfFirstSpace = sentence.indexOf(" ");
        //String firstWord = sentence.substring(0,  indexOfFirstSpace);

        String firstWord = sentence.substring(0,  sentence.indexOf(" "));

        //String restOfSentence = sentence.substring ( sentence.indexOf(" ")).trim();  // is a fun language

        String restOfSentence = sentence.substring ( sentence.indexOf(" ") + 1 );



        System.out.println(restOfSentence + " " +firstWord); // Java is a fun language Java




    }
}
