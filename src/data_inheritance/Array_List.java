package data_inheritance;

import java.util.ArrayList;

/**
 * Created by RXC8414 on 4/10/2017.
 */
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>(5);

        for(int i = 0; i < 10; i++) {
            myArray.add(i);  // Assigning values into the Array List
            System.out.println(myArray.get(i)); //Retrieving values from Array List
        }

        System.out.println("-----------------------------------");
        //Remove a value
        myArray.remove(7);
        myArray.add(2,new Integer(100));

        for (Integer x:myArray) {
            System.out.println(x);
        }


    }
}
