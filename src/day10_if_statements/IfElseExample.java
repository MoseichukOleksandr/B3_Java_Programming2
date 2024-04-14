package day10_if_statements;

public class IfElseExample {
    public static void main(String[] args) {
//
//        int score = 60;
//        if (score >= 75) {
//            System.out.println("Passing the exam!");
//        }
//
//        if (score < 75) {
//            System.out.println("Failing the exam!");
//        }

//        int score = 70;
//        if (score >= 75) {
//            System.out.println("Passing the exam!");
//        } else {
//            System.out.println("Failing the exam!");
//        }

        int score = 70;
        if (score > 90) {
            System.out.println("Exelent");
        } else {
            System.out.println("Keep working");
        }







        int year = 2020;
        boolean isLockdown = year == 2020 || year == 2021;

        if(isLockdown) {
            System.out.println("Stay at home.");
            System.out.println("Practice CODING");
        }else {
            System.out.println("Go meet friends");
        }



    }
}
