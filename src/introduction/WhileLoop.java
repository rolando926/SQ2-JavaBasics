package introduction;

/**
 * Created by RXC8414 on 3/16/2017.
 */
public class WhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        boolean blnCond = false;
        while(blnCond){
            System.out.println(counter);
            counter++;
            if (counter == 10){
                break;
            }
        }
    }
}
