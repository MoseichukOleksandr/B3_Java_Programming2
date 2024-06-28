package day44_map_and_function.buildin_functions;

public class CallPredicate {
    public static void main(String[] args) {


        boolean b = UsePredicate.isPalindrome.test("racecar");
        System.out.println(b);

        System.out.println(UsePredicate.isPalindrome.test("apple"));

        System.out.println( UsePredicate.isPrime.test(7));
        System.out.println( UsePredicate.isPrime.test(8));



    }
}
