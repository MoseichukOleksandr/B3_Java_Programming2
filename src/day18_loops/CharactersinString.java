package day18_loops;

public class CharactersinString {
    public static void main(String[] args) {


      /*
    Characters in String
        Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
 */

                String str = "java";

                for (int i = 0; i < str.length(); i++) {

                    //int numChar = str.charAt(i);
                    //System.out.println(numChar);
                    System.out.println((int)str.charAt(i));
                }





            }
}
