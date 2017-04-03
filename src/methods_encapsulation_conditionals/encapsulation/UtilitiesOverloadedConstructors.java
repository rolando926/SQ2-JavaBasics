package methods_encapsulation_conditionals.encapsulation;

/**
 * Created by RXC8414 on 4/3/2017.
 */
public class UtilitiesOverloadedConstructors {
    private int value1;
    private int value2;
    private int value3;

    UtilitiesOverloadedConstructors(){
        value1 = 0;
        value2 = 0;
        value3 = 0;
    }

    UtilitiesOverloadedConstructors(int val1){
        value1 = val1;
        value2 = 0;
        value3 = 0;
    }

    UtilitiesOverloadedConstructors(int val1, int val2){
        //value1 = val1;
        this(val1);
        value2 = val2;
        value3 = 0;
    }

    UtilitiesOverloadedConstructors(int val1, int val2, int val3){
        value1 = val1;
        value2 = val2;
        //this(val1,val2);
        value3 = val3;
    }

    public void printValues(){
        System.out.println("Value1 = "+value1);
        System.out.println("Value2 = "+value2);
        System.out.println("Value3 = "+value3);
    }
}
