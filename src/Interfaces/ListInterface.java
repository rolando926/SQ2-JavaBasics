package Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by RXC8414 on 4/17/2017.
 */
public class ListInterface {
    public static void main(String[] args) {
        // 1. Print an array of Strings
        String[] strArray = {"Matt","Kimberly","David","John","Chris","Nina","Pam","Tracy"};
        //for (String temp:strArray) {System.out.println(temp);}

        // 2. Convert array into List
        List<String> myList = Arrays.asList(strArray);
        //for (String temp:myList) {System.out.println(temp);}

        // 3. Convert strArray into ArrayList
        ArrayList<String> myArrayList = new ArrayList<>(myList);
        //for (String temp: myArrayList) {System.out.println(temp);}
        //System.out.println(myArrayList); // print out all values as array

        //4. We want to convert the ArrayList into a List
        List<String> myListFromArrayList = myArrayList;
        //for (String temp: myListFromArrayList) {System.out.println(temp);}

        //5. Apply Lambdas found on the replaceAll List Interface method to our List
        //myList.replaceAll((String str) -> {return str.toUpperCase();}); //The long version
        //myList.replaceAll(str -> str.toUpperCase()); // short version of Unary Operator
        //for (String temp: myList) {System.out.println(temp);}

        // 6. Remove if length less than 5 characters
        // NOTE: Only works from ArrayList to List convertion
        // myListFromArrayList.removeIf(str -> str.length() < 5); // Predicate Operator
        // for (String temp: myListFromArrayList) {System.out.println(temp);}


        // 7. Replace name with upper case if length >= 5 using strArray
        /*
        for(int i = 0; i < strArray.length; i++){
            if(strArray[i].length() >= 5){
                strArray[i] = strArray[i].toUpperCase();
            }
            System.out.println(strArray[i]);
        }*/

        // 7a. Same thing as #7 with while loop
        /*
        int i = 0;
        while(i < strArray.length){
            if(strArray[i].length() >= 5){
                strArray[i] = strArray[i].toUpperCase();
            }
            System.out.println(strArray[i]);
            i++;
        }*/

        // 8. Replace name with upper case if length >= 5 using ArrayList
        // NOTE: .add = inserts while .set = update
        /*int counter = 0;
        for (String temp: myArrayList) {
            if(temp.length() >= 5){
                myArrayList.set(counter, temp.toUpperCase());
            }
            counter++;
        }
        System.out.println(myArrayList);*/
    }
}
