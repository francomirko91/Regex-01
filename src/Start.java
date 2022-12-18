public class Start {


    public static void main(String[] args) {

        String regex1 = "I Like to code near the Lake with my friend Luke";
        String regex2 = regex1.replaceAll("(L[^u]ke)","BLA");

        System.out.println(regex2);



        /*with a regular expression, change into BLA all occurrences of words that start with an l and end with a ke,
         except your friend
        print the result*/


    }
}
