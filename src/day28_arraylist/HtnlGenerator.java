public class HtnlGenerator {
    public static void main(String[] args) {

        String str = "div^2";


        System.out.println(htmlGenerator(str)); // System.out.println("");
        System.out.println(htmlGenerator("li^3"));
        System.out.println( htmlGenerator("span^5"));


    }


    public static String htmlGenerator (String str) {


        //str.split("\\^");
        String [] arr = str.replace("^", " ").split(" "); // div^2 -- > div 2 --- > ["div", "2"] | ["li", "3"]

        int num = Integer.parseInt(arr[arr.length-1]); // "2" -- > 2
        String html = "";

        for (int i = 0; i < num; i++) {  // 0 < "2" -> INVALID

            //  <div></div> <div></div>
            html += "<" + arr[0] + "></" + arr[0] + ">";

        }


        return html;
    }





}