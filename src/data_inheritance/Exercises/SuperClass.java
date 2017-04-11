package data_inheritance.Exercises;

/**
 * Created by RXC8414 on 4/11/2017.
 */
public class SuperClass{
    public int num1;
    public int num2;

    public SuperClass(int number1, int number2){
        num1 = number1;
        num2 = number2;
    }

    public void multiplication(){
        System.out.println(num1*num2);
    }
}
