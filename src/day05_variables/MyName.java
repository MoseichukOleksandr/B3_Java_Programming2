package day05_variables;

public class MyName {
    public static void main (String [] args){
        char first = 'f';
        char second = 'r';
        char third = 's';
        char fourth = 'r';
        char fifth = 'j';
        char six = 'p';

        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);
        System.out.println("fourth = " + fourth);
        System.out.println("fifth = " + fifth);
        System.out.println("six = " + six);

        System.out.println();

        System.out.println(first + second + third + fourth + fifth + six);

        String name = "" + first + second + third + fourth + fifth + six;

        System.out.println(first + second + third + fourth + fifth + six);  //int

        String name1 = "" + first + second + third + fourth + fifth + six;
        System.out.println(name1);

    }
}
