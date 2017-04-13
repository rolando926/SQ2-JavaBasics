package Interfaces;

/**
 * Created by RXC8414 on 4/13/2017.
 */
public class ClassA extends ClassB implements InterA{
    private String strMessage;

    public String getStrMessage() {
        return strMessage;
    }

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public void identifyClasses(){
        System.out.println("This is Class A....");
    }

    public void identifyOtherClasses(){
        identify(); // Identify Class B through extension
    }

    public void returnMessage(){
        System.out.println("This is ClassA implementing an abstract method from InterfaceA....");
    }

}
