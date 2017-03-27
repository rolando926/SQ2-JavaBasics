package classes_objects;

/**
 * Created by RXC8414 on 3/24/2017.
 */
public class MatchersRegex {
    public static void main(String[] args) {
        String str = "true";

        if(str.matches("[tT]rue")){
            System.out.println("It Matches!");
        }
        else{
            System.out.println("It did not Match!");
        }
    }
}
