package methods_encapsulation_conditionals.methods;

/**
 * Created by RXC8414 on 3/29/2017.
 */
public class Shirt {
    // All versions
    public String description;
    public char colorCode;
    public double price;
    public static int counter = 1;

    //V1.3 and V1.4
    Shirt(String value1, char value2, double value3){
        description = value1;
        colorCode = value2;
        price = value3;
        printProperties();
    }

    //V1.1 and V1.2
    public void setShirtProperties(String value1, char value2, double value3){
        description = value1;
        colorCode = value2;
        price = value3;
    }

    public void printProperties(){
        System.out.println("***** Shirt #" +(counter++)+" ******");
        System.out.println("Description: "+description);
        System.out.println("Color Code: "+colorCode);
        System.out.println("Price: "+price);
        System.out.println();
    }
}
