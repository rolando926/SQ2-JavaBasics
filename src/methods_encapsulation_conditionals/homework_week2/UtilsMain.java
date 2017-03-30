package methods_encapsulation_conditionals.homework_week2;


/**
 * Created by RXC8414 on 3/28/2017.
 */
public class UtilsMain {
    static int i;

    public static void main(String[] args) {
        Utilities utils1 = new Utilities();
        //utils1.printDivisibleBySeven(0,1000);
        System.out.println("Occurrences = "+utils1.countNumbersDivisibleBySeven(0,1000));
        countNumbersSeries(0,1000);
        System.out.println("Length of string: "+utils1.findStringSize("I need to find out the length of this string."));
        utils1.countVowelsAndChars("I need to find out the number of vowels in this string.");
    }

    public static void countNumbersSeries(int start, int stop){
        int x = 0;
        for(int i = start; i <= stop; i++){
            x+=i; //x = x + i
        }
        System.out.println("The sum of all number from "+start+" and "+stop+" = "+x);
    }

}
