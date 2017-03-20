package introduction;

/**
 * Created by RXC8414 on 3/16/2017.
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        boolean blnCond = false;
        int counter = 0;
        do{
            System.out.println(counter);
            counter++;
            if(counter == 10){
                break;
            }
        }while(!blnCond);
    }
}
