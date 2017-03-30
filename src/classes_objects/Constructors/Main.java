/**
 * Created by RXC8414 on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        //This is an instantiation using the default constructor
        ClassA Nina = new ClassA();
        ClassA Kim = new ClassA("Please bring Chips.");
        ClassA Tracy = new ClassA("Please bring Salsa.");
        ClassA Colby = new ClassA();
        ClassA Mark = new ClassA("Please bring cake.");

        System.out.println("Nina: "+Nina.whatToBring());
        System.out.println("Kim: "+Kim.whatToBring());
        System.out.println("Tracy: "+Tracy.whatToBring());
        System.out.println("Colby: "+Colby.whatToBring());
        System.out.println("Mark: "+Mark.whatToBring());
    }
}
