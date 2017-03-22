package classes_objects;

/**
 * Created by RXC8414 on 3/22/2017.
 */
public class Name{
    public String lName;
    public String fName;

    public Name(){
        lName = "Name";
        fName = "No";
    }

    public Name(String name1, String name2){
        fName = name1;
        lName = name2;
    }

    public void printName(){
        System.out.println(fName+" "+lName);
    }

}
