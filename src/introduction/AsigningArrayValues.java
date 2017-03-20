package introduction;

/**
 * Created by RXC8414 on 3/17/2017.
 */
public class AsigningArrayValues {
    public static void main(String[] args) {
        double[] myList = new double[10];

        // Loading data into array
        for(int index = 0; index < myList.length; index++ ){
            myList[index] = index*2;
            //System.out.println(myList[index]);
        }

        // Printing data from loaded array
        for (double tempArrayNumber: myList) {
            System.out.println(tempArrayNumber);
        }


    }
}
