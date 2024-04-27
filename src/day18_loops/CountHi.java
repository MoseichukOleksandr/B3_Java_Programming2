package day18_loops;

public class CountHi {
    public static void main(String[] args) {

        String str = "sdjhsdhjdshsdjhdhsdj";
        int count = 0 ;

        for (int index = 0; index < str.length(); index++) {
            if( str.charAt(index) == 'h' && str.charAt(index+1) == 's'){
                count++;
            }

        }
        System.out.println(count);

    }

}
