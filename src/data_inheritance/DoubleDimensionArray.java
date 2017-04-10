
package data_inheritance;



/**
 * Created by RXC8414 on 4/5/2017.
 */
public class DoubleDimensionArray {
    static final int ROWS = 1000;
    static final int COLS = 1000;

    public static void main(String[] args) {
        String[][] matrixNumbers = {{"00","01","02","03","04"},
                {"10","11","12","13","14"},
                {"20","21","22","AA","24"}};

        for (int row = 0; row <= 2; row++){
            for(int col = 0; col <= 4; col++){
                if(matrixNumbers[row][col] == "AA"){
                    System.out.print("Row = "+row);
                    System.out.print(" Col = "+col);
                    //Short cut for println is sout+TAB
                    System.out.println("\nRow = "+row+" Col = "+col);
                }
            }
        }

        // Exercise: I want you to create a double dimension array of 6x6
        // Assign each value = row_index + col_index
        // print the sum of all those numbers


        int[][] matrixNumber = new int[ROWS][COLS];
        int sum = 0;
        for(int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                matrixNumber[row][col] = row+col;

                // Anyone of these two will achieve the same goal
                //sum += row+col; // Assigning the value directly
                sum += matrixNumber[row][col]; //Assigning from variable
            }
        }
        System.out.println("The sum of all numbers are: "+sum);
    }
}

