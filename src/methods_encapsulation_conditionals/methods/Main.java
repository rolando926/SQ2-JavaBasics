package methods_encapsulation_conditionals.methods;

/**
 * Created by RXC8414 on 3/29/2017.
 */
public class Main {
    public static void main(String[] args) {

        //version 1.0: The use of only instantiation/default constructor/no set method "number of lines = 16"
        //version 1.1: The use of instantiation/default constructor/set method "number of lines = 8"
        //version 1.2: The use of array instantiation and set method "number of lines = 5"
        //version 1.3: The use of constructor that set all fields automatically "number of lines = 4"
        //version 1.4: The use of constructor and an array "number of lines = 1"


        //Shirt shirt1 = new Shirt(); //V1.0 and V1.1
        //Shirt shirt2 = new Shirt(); //V1.0 and V1.1
        //Shirt shirt3 = new Shirt(); //V1.0 and V1.1
        //Shirt shirt4 = new Shirt(); //V1.0 and V1.1
        //Shirt[] shirts = {new Shirt(),new Shirt(),new Shirt(),new Shirt()}; //V1.2
        Shirt[] shirts = {new Shirt("Debbie's shirt",'G',100.00),new Shirt("Kim's shirt",'W',120.00),
                new Shirt("David's shirt",'H',30.00),new Shirt("John's shirt",'S',50.00)}; //V1.4

        //Shirt shirt1 = new Shirt("Debbie's shirt",'G',100.00); //V1.3
        //Shirt shirt2 = new Shirt("Kim's shirt",'W',120.00); //V1.3
        //Shirt shirt3 = new Shirt("David's shirt",'H',30.00); //V1.3
        //Shirt shirt4 = new Shirt("John's shirt",'S',50.00); //V1.3

        //shirt1.description = "Debbie's shirt"; //V1.0
        //shirt1.colorCode = 'G'; //V1.0
        //shirt1.price = 100.00; //V1.0
        //shirt1.setShirtProperties("Debbie's shirt",'G',100.00); //V1.1
        //shirts[0].setShirtProperties("Debbie's shirt",'G',100.00); //V1.2

        //shirt2.description = "Kim's shirt"; //V1.0
        //shirt2.colorCode = 'W'; //V1.0
        //shirt2.price = 120.00; //V1.0
        //shirt2.setShirtProperties("Kim's shirt",'W',120.00); //V1.1
        //shirts[1].setShirtProperties("Kim's shirt",'W',120.00); //V1.2

        //shirt3.description = "David's shirt"; //V1.0
        //shirt3.colorCode = 'H'; //V1.0
        //shirt3.price = 30.00; //V1.0
        //shirt3.setShirtProperties("David's shirt",'H',30.00); //V1.1
        //shirts[2].setShirtProperties("David's shirt",'H',30.00); //V1.2

        //shirt4.description = "John's shirt"; //V1.0
        //shirt4.colorCode = 'S'; //V1.0
        //shirt4.price = 50.00; //V1.0
        //shirt4.setShirtProperties("John's shirt",'S',50.00); //V1.1
        //shirts[3].setShirtProperties("John's shirt",'S',50.00); //V1.2
    }
}
