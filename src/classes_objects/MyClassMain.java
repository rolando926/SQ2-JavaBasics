package classes_objects;

/**
 * Created by RXC8414 on 3/20/2017.
 */
public class MyClassMain {
    public static void main(String[] args) {
        // Instantiating the math1 object as a copy of MathUtils class
        MathUtils math1 = new MathUtils(0,0);

        // Instantiating the math2 object as a copy of MathUtils class
        MathUtils math2 = new MathUtils(20,30);


        // Overwriting the field variables for the math1 object
        math1.i = 10;
        math1.y = 20;

        // Do whatever
        System.out.println("\n****** New Object ******");
        System.out.println("i:"+math1.i+"  y:"+math1.y);
        System.out.println("Addition: "+math1.addition());
        System.out.println("Substraction: "+math1.substraction());
        System.out.println("Multiplication: "+math1.mult());
        System.out.println("Division: "+math1.division());

        System.out.println("\n****** New Object ******");
        System.out.println(">>>>>> I can create as many objects as I want and all will have a nbew fresh set of data.");
        System.out.println("i:"+math2.i+"  y:"+math2.y);
        System.out.println("Addition: "+math2.addition());
    }
}
