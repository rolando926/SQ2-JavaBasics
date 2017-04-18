package Interfaces;

import java.util.concurrent.TimeUnit;

/**
 * Created by RXC8414 on 4/18/2017.
 */
public class TryCatch {
    public static void main(String[] args) {
        // 1. Try Catch at the source

        /*
        for (int i = 0; i < 5; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("i=" + i);
            } catch (InterruptedException ie) {
                System.out.println("Sorry for this... Please try again...");
            }
        }
        */

        // 2. Try Catch using Throwable
        TryCatchUtils tryC = new TryCatchUtils();
        /*
        try {
            tryC.printCounter();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }catch(Exception e){

        }*/

        //3. Zero as the denominator
        double num = tryC.div(10,0);
        System.out.println(num);
    }
}
