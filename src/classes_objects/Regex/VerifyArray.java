package classes_objects.Regex;

import java.util.regex.Pattern;

/**
 * Created by RXC8414 on 3/27/2017.
 */
public class VerifyArray {
    public static void main(String[] args) {
        String[] names = {"Kimberly","Debbie","Colby","Tracy","Adam",
                "Mark","Matt","Doug","Chris","John","Pamela","Nina","David","A"};

        // Matches starting with any number of characters but ends with the letter 'a'
        String matcher1 = "[A-Za-z]+a$";

        // Matches starting letter with either C or M and any number of subsequent letters (exclusive of zero)
        String matcher2 = "^[CM][a-z]+";

        // Matches starting letter with either C or M and from zero to any number of subsequent letters (inclusive of zero)
        String matcher3 = "^[C|M][a-z]*";

        // Matches contains the letter 'a' anywhere inside the string
        String matcher4 = "(.*[A|a].+)&([^a]$)]";

        System.out.println("***** FOR EACH ******");
        for (String temp:names) {
            //System.out.println(temp);
            if(temp.matches(matcher4)){
                System.out.println(temp);
            }
        }

        /*
        System.out.println("***** FOR LOOP *******");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        */
    }
}
