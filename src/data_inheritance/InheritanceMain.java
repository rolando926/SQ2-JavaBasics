package data_inheritance;

import data_inheritance.Exercises.SomeOtherClassInheritance;
import data_inheritance.Exercises.SubClass;
import data_inheritance.Exercises.SuperClass;

/**
 * Created by RXC8414 on 4/11/2017.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        SubClass sub = new SubClass(2,3);

        sub.add();
        sub.multiplication();

    }
}
