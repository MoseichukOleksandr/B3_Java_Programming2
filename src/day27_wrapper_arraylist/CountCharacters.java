package day27_wrapper_arraylist;

/*
    given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

        aP3d572&*jd@jdJU
 */
public class CountCharacters {
    public static void main(String[] args) {

        String str = "aP3d572&*jd@jdJU";

        int upper = 0 , lower = 0, digits = 0, others = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isUpperCase(each)){
                upper++;
            } else if (Character.isLowerCase(each)){
                lower++;
            } else if (Character.isDigit(each)){
                digits++;
            } else {
                others++;
            }

        }
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        System.out.println("digits = " + digits);
        System.out.println("others = " + others);

    }}
