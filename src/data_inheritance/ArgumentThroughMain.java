package data_inheritance;

/**
 * Created by RXC8414 on 4/5/2017.
 */
public class ArgumentThroughMain {
    public static void main(String[] args) {
        int sum=0;
        for (String temp:args) {
            sum += Integer.parseInt(temp);
        }
        System.out.println(sum);
        System.out.println("Args[2]="+args[2]);
    }
}
