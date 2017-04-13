package Interfaces;

/**
 * Created by RXC8414 on 4/13/2017.
 */
public interface InterA {
    // 1. Constants
    String NAME = "My name is Rolando...";

    // 2. Default methods
    default void identifyInterface(){
        System.out.println("This is interface A....");
        returnStaticMessage();
    }

    default void someOtherMethod(){
        returnStaticMessage();
    }

    default int letsDoSomething(){
        returnStaticMessage();
        return 1;
    }

    // 3. Empty methods
    void returnMessage();

    // 4. Static method that can ONLY help the interface
    static void returnStaticMessage(){
        System.out.println("This is a static method from the interface....");
    }
}
