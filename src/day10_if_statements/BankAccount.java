package day10_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("What is your balance: $");
        double balance = key.nextDouble();
        System.out.print("How much you whant to withdraw? $");
        double withdraw = key.nextDouble();

        balance -= withdraw;

        //System.out.println("Your current balance is: $"+balance);

        if(balance <0) {
            System.out.println("YOu took to much money. 100$ overdraft fee will be applied");
            balance -=100;
            System.out.println("Your current balance after FEE is: $" + balance );
        }
        else
            System.out.println("Your current balance is: $"+balance);

    }
}
