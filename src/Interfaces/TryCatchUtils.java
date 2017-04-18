package Interfaces;

import java.util.concurrent.TimeUnit;
import java.lang.ArithmeticException;
/**
 * Created by RXC8414 on 4/18/2017.
 */
public class TryCatchUtils {

    public void printCounter() throws Exception{
        for (int i = 0; i < 5; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("i=" + i);
        }
    }

    public double div(double num1, double num2){
        try {
            return num1 / num2;
        }catch(ArithmeticException ae){
            System.out.println("Can't divide by 0...");
        }
        return -1;
    }
}
