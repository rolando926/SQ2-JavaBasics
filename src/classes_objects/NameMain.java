package classes_objects;

/**
 * Created by RXC8414 on 3/22/2017.
 */
public class NameMain {
    public static void main(String[] args) {
        Name myName = new Name();
        Name myOtherName = new Name("Rolando","Rivera");

        //myName.fName = "Rolando";
        //myName.lName = "Colon";

        myName.printName();
        myOtherName.printName();
    }
}
