package classes_objects;

/**
 * Created by RXC8414 on 3/20/2017.
 */
public class MathUtils {
    // These are the fields or global variables
    int i;
    int y;


    // A constructor is used to default the values of our fields
    // It is called during instantiation
    MathUtils(int x1, int x2){
        i = x1;
        y = x2;
    }

    public int addition(){
        return i+y;
    }

    public int subtraction(){
        return i-y;
    }

    public double division(){
        // We need to take into account that the denominator can't be zero
        if(y == 0){
            System.out.print("Error: Arithmetic Exception: Not divisible by zero! -- ");
            return 0;
        }
        else {
            // the division between 2 integers will only return the integer portion
            // so we cast either i or y in order to return a decimal point
            return (double) i / y;
        }
    }

    public int mult(){
        return i*y;
    }

}
