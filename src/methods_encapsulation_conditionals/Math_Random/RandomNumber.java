package methods_encapsulation_conditionals.Math_Random;

/**
 * Created by RXC8414 on 3/31/2017.
 */
public class RandomNumber {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            randomNum(1000);
        }
    }

    public static void randomNum(long range){
        System.out.println((long)(Math.random()*range));
    }

    //generate a 9 digit random number
}
