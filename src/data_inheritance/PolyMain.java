package data_inheritance;

/**
 * Created by RXC8414 on 4/12/2017.
 */
public class PolyMain {
    public static void main(String[] args) {
        PolyClassA myClass = new PolyClassA();
        myClass.name = "thomas";
        myClass.setId(100);
        myClass.identify();
    }
}
