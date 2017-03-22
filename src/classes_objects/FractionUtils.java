package classes_objects;

/**
 * Created by RXC8414 on 3/21/2017.
 */
public class FractionUtils {
    static int number;

    public static double fraction(){
        if(number != 0) {
            return number / 100;
        }else
        {
            System.out.println("Error:....");
            return -1;
        }
    }

}
