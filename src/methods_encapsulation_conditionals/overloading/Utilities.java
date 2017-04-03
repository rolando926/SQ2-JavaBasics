package methods_encapsulation_conditionals.overloading;

/**
 * Created by RXC8414 on 3/31/2017.
 */
public class Utilities {

    public void add(int a, int b){
        System.out.println("Two Integers: "+(a+b));
    }

    public void add(double a, double b){
        System.out.println("Two Doubles: "+(a+b));
    }

    public void add(int a, double b){
        System.out.println("Mix Int&Double: "+(a+b));
    }


    public void add(double a, int b){
        System.out.println("Mix Double&int: "+(a+b));
    }
}
