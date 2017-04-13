package Interfaces;

/**
 * Created by RXC8414 on 4/13/2017.
 */
public class Main{
    public static void main(String[] args) {
        ClassA myClass = new ClassA();
        myClass.identifyClasses();
        myClass.identify();
        myClass.identifyInterface();
        myClass.returnMessage();
        System.out.println(myClass.NAME);

    }
}
