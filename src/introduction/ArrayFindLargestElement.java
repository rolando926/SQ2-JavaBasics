package introduction;

/**
 * Created by RXC8414 on 3/17/2017.
 */
public class ArrayFindLargestElement {
    public static void main(String[] args) {
        double[] myList = {5.6,4.5,3.3,13.2,4.0,34.33,34.0,45.45,99.993,11123};
        double largest = myList[0];

        // Create loop to iterate through array
        for(int index = 1; index < myList.length; index++){
            if(myList[index] > largest){
                largest = myList[index];
            }
        }
        System.out.println("Largest number is = " +largest);
    }
}
