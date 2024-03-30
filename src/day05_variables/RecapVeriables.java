package day05_variables;

public class RecapVeriables {
    public static void main (String[] args){

    byte numberOfCoffeeCups;
    double totalPriceOfCoffee;
    int totalNumberOfStudentsInClass;

//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalNumberOfStudentsInClass);
//        System.out.println(totalPriceOfCoffee);

        numberOfCoffeeCups = 2;
        totalNumberOfStudentsInClass = 100;
        totalPriceOfCoffee = 10.25;


        System.out.println(numberOfCoffeeCups);
        System.out.println(totalNumberOfStudentsInClass);
        System.out.println(totalPriceOfCoffee);


        System.out.println(numberOfCoffeeCups + " * " + totalNumberOfStudentsInClass);

        double temperature = 30.5;
        int javaDay = 5;
        System.out.println("\nToday temperature was " + temperature);
        System.out.println("It is Day" + javaDay + "in Java class");
    }
}
