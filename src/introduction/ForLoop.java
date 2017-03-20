package introduction;

/**
 * Created by RXC8414 on 3/16/2017.
 */
public class ForLoop {
    public static void main(String[] args) {
        for(int counter = 100;counter <= 110; counter++){
            if(counter == 105)
                continue; //skipping
            System.out.println(counter);
        }
    }
}
