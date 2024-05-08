package day21_arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[] nums = {5, 45, 44, 665, 6, 13, 60};
        int evenCount = 0;
        int oddNUm = 0;
        String even = "", odd = "";


        for (int eachNum : nums) {

            if (eachNum % 2 == 0) {
                evenCount++;
                even +=" "+eachNum;
            } else {
                oddNUm++;
                odd +=" "+eachNum;
            }
        }
        System.out.println("evenCount = " + evenCount);
        System.out.println("even = " + even);
        System.out.println("oddNUm = " + oddNUm);
        System.out.println("odd = " + odd);


    }
}
