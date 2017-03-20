package introduction;

/**
 * Created by RXC8414 on 3/15/2017.
 */
public class AddingVariables {
    public static void main(String[] args) {
        int value1 = 100;
        int value2 = 200;
        int total;

        total = value1 + value2;
        //System.out.println("value1 + value2 = "+total);

        //System.out.println("value1 + value2 = "+(value1+value2));

        String str3 = value1+"+"+value2+"="+(value1+value2);
        //System.out.println(str3);

        String str1 = "My name is";
        String str2 = "Rolando";

        System.out.println(str1+" "+str2+ args[0]);


    }
}
