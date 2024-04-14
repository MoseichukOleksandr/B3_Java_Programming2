package day11_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {
/*
Task:
    declare and assign a price variable
    declare and assign a boolean - hasPrime variable

    possible outputs:

        prime member:
            Eligible for 2 day shipping

        not prime and item price is more than or equal 25:
            Eligible for regular free shipping

        not prime and item price is less than 25:
            Not eligible for free shipping. Shipping fee: 3.99

 */

        double price = 15.99;
        boolean isPrime = false;

        if (isPrime){
            System.out.println("eligible for 2 days shipping");

        } else {

            if(price >= 25){
                System.out.println("Eligible for reg ship");
            }
            else {
                System.out.println("Not eligible for free ship. Add 3.99 to price");
                price+=3.99;
            }

        }

        System.out.println("Final price is: "+ price);

    }
}
