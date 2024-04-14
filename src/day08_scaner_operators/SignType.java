package day08_scaner_operators;

public class SignType {
    public static void main(String[] args) {

        int number = 6;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println(number +" is Positive: " + isPositive);
        System.out.println(number + " is Negative: " + isNegative);
        System.out.println(number + " is Zero: " + isZero);


    }
}
