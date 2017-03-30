/**
 * Created by RXC8414 on 3/27/2017.
 */
public class ClassA {

    String strMessage;

    // Purpose of a constructor is to default one or more of the class fields

    // Default constructor
    ClassA(){
        //strMessage = "Please bring anything.";
    }

    // Constructor that receives one argument
    ClassA(String something){
        strMessage = something;
    }

    //Method to see what do I need to bring to the party
    public String whatToBring(){
        return strMessage;
    }
}
